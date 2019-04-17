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
	
		session.getCurrentSession().merge(t);
	}


	public void modifier(Matiere t) {
	
		session.getCurrentSession().update(t);
	}


	public void supprimer(Matiere t) {
	
		session.getCurrentSession().delete(t);
	}


	public List<Matiere> afficher() {
	
		return session.getCurrentSession().createQuery("from Matiere t").list();
	}


	public Matiere getById(int id) {
		
		return (Matiere) session.getCurrentSession().get(Matiere.class, id);
	}


	
}
