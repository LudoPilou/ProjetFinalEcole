package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Matiere;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoMatiere")
public class MatiereDAO implements IMatiereDAO {

	
	@Autowired
	private SessionFactory session; 
	
	
	public MatiereDAO() {
	
	}


	public void ajouter(Matiere t) {
		// TODO Auto-generated method stub
		
	}


	public void modifier(Matiere t) {
		// TODO Auto-generated method stub
		
	}


	public void supprimer(Matiere t) {
		// TODO Auto-generated method stub
		
	}


	public List<Matiere> afficher() {
		// TODO Auto-generated method stub
		return null;
	}


	public Matiere getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
