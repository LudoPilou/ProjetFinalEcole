package org.college.serveur.dao;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Departement;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoDepartement")
public class DepartementDAO implements IDepartementDAO{

	
	
	@Autowired
	private SessionFactory session; 
	
	
	
	public DepartementDAO() {
		
		
	}



	public void ajouter(Departement t) {
		// TODO Auto-generated method stub
		
	}



	public void modifier(Departement t) {
		// TODO Auto-generated method stub
		
	}



	public void supprimer(Departement t) {
		// TODO Auto-generated method stub
		
	}



	public List<Departement> afficher() {
		// TODO Auto-generated method stub
		return null;
	}



	public Departement getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
