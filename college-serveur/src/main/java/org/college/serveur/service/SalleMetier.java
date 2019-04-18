package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.ISalleDAO;
import org.college.serveur.dao.SalleDAO;
import org.college.serveur.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceSalle")
public class SalleMetier implements IGestionCollegeMetier<Salle> {

	@Autowired
	@Qualifier("daoSalle")
	private ISalleDAO dao;
	
	
	
	
	public SalleMetier() {
		dao=new SalleDAO();
	}

	
	public void ajouter(Salle t) {
		dao.ajouter(t);
	}

	
	public void modifier(Salle t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Salle t) {
		dao.supprimer(t);
		
	}

	
	public List<Salle> afficher() {
		
		return dao.afficher();
	}

	
	public Salle getById(int id) {
		
		return dao.getById(id);
	}

	
}
