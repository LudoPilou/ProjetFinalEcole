package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.EtudiantDAO;
import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceEtudiant")
public class EtudiantMetier implements IGestionCollegeMetier<Etudiant>,IEtudiantMetier {

	
	@Autowired
	@Qualifier("daoEtudiant")
	private EtudiantDAO dao;
	
	
	
	
	public EtudiantMetier() {
		dao=new EtudiantDAO();
	}

	
	public void ajouter(Etudiant t) {
		dao.ajouter(t);
	}

	
	public void modifier(Etudiant t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Etudiant t) {
		dao.supprimer(t);
		
	}

	
	public List<Etudiant> afficher() {
		
		return dao.afficher();
	}

	
	public Etudiant getById(int id) {
		
		return dao.getById(id);
	}

	
	public double getMoyenneGenerale(int idEtudiant) {
		
		return dao.getMoyenneGenerale(idEtudiant);
	}

	
	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		
		return dao.getMatieresSansNote(idEtudiant);
	}

	
}
