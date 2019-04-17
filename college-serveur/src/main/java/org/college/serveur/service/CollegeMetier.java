package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.CollegeDAO;
import org.college.serveur.dao.ICollegeDAO;
import org.college.serveur.entities.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("serviceCollege")
public class CollegeMetier implements IGestionCollegeMetier<Colleges> {

	@Autowired
	@Qualifier("daoCollege")
	private ICollegeDAO dao;
	
	
	
	
	

	
	public void ajouter(Colleges t) {
		dao.ajouter(t);
	}

	
	public void modifier(Colleges t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Colleges t) {
		dao.supprimer(t);
		
	}

	
	public List<Colleges> afficher() {
		
		return dao.afficher();
	}

	
	public Colleges getById(int id) {
		
		return dao.getById(id);
	}

	
}
