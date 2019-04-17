package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.INoterDAO;
import org.college.serveur.dao.NoterDAO;
import org.college.serveur.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("serviceNoter")
public class NoterMetier implements IGestionCollegeMetier<Noter>,INoterMetier {

	@Autowired
	@Qualifier("daoNoter")
	private INoterDAO dao;
	
	
	
	
	public NoterMetier() {
		dao=new NoterDAO();
	}

	
	public void ajouter(Noter t) {
		dao.ajouter(t);
	}

	
	public void modifier(Noter t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Noter t) {
		dao.supprimer(t);
		
	}

	
	public List<Noter> afficher() {
		
		return dao.afficher();
	}

	
	public Noter getById(int id) {
		
		return dao.getById(id);
	}

	
	public double getMoyenneParMatiere(int idMatiere) {
		
		return dao.getMoyenneParMatiere(idMatiere);
	}

	
}
