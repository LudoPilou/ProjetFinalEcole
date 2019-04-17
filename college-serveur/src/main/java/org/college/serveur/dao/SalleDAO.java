package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Salle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoSalle")
public class SalleDAO implements  ISalleDAO {

	
	@Autowired
	private SessionFactory session; 
	
	
	public SalleDAO() {
		
		
	}


	public void ajouter(Salle t) {
		// TODO Auto-generated method stub
		
	}


	public void modifier(Salle t) {
		// TODO Auto-generated method stub
		
	}


	public void supprimer(Salle t) {
		// TODO Auto-generated method stub
		
	}


	public List<Salle> afficher() {
		// TODO Auto-generated method stub
		return null;
	}


	public Salle getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
