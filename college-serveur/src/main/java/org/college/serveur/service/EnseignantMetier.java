package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.EnseignantDAO;
import org.college.serveur.dao.IEnseignantDAO;
import org.college.serveur.entities.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("serviceEnseignant")
public class EnseignantMetier implements IGestionCollegeMetier<Enseignant> {

	@Autowired
	@Qualifier("daoEnseignant")
	private IEnseignantDAO dao;
	
	
	
	
	public EnseignantMetier() {
		dao=new EnseignantDAO();
	}

	
	public void ajouter(Enseignant t) {
		dao.ajouter(t);
	}

	
	public void modifier(Enseignant t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Enseignant t) {
		dao.supprimer(t);
		
	}

	
	public List<Enseignant> afficher() {
		
		return dao.afficher();
	}

	
	public Enseignant getById(int id) {
		
		return dao.getById(id);
	}

	
}
