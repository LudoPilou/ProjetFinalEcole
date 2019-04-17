package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.IMatiereDAO;
import org.college.serveur.dao.MatiereDAO;
import org.college.serveur.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceMatiere")
public class MatiereMetier implements IGestionCollegeMetier<Matiere> {

	@Autowired
	@Qualifier("daoMatiere")
	private IMatiereDAO dao;
	
	
	
	
	public MatiereMetier() {
		dao=new MatiereDAO();
	}

	
	public void ajouter(Matiere t) {
		dao.ajouter(t);
	}

	
	public void modifier(Matiere t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Matiere t) {
		dao.supprimer(t);
		
	}

	
	public List<Matiere> afficher() {
		
		return dao.afficher();
	}

	
	public Matiere getById(int id) {
		
		return dao.getById(id);
	}

	
}
