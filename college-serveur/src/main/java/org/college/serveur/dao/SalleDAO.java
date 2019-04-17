package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Matiere;
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
		session.getCurrentSession().merge(t);
		
	}


	public void modifier(Salle t) {
	
		session.getCurrentSession().update(t);
	}


	public void supprimer(Salle t) {
		
		session.getCurrentSession().delete(t);
	}


	public List<Salle> afficher() {
	
		return session.getCurrentSession().createQuery("from Salle t").list();
	}


	public Salle getById(int id) {
	
		return (Salle) session.getCurrentSession().get(Salle.class, id);
	}

	

}
