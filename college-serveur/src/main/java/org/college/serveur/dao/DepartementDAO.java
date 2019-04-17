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
		session.getCurrentSession().merge(t);
		
	}



	public void modifier(Departement t) {
		session.getCurrentSession().update(t);
		
	}



	public void supprimer(Departement t) {
		session.getCurrentSession().delete(t);
		
	}



	public List<Departement> afficher() {
		
		return session.getCurrentSession().createQuery("from Departement d").list();
	}



	public Departement getById(int id) {
		
		return (Departement) session.getCurrentSession().get(Departement.class, id);
	}

	
	
	
}
