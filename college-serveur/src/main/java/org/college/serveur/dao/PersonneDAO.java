package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Personne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoPersonne")
public class PersonneDAO implements IPersonneDAO {
	
	@Autowired
	private SessionFactory session; 
	
	

	public PersonneDAO() {
	
	}


	public void ajouter(Personne t) {
		session.getCurrentSession().merge(t);
		
	}



	public void modifier(Personne t) {
		session.getCurrentSession().update(t);
		
	}



	public void supprimer(Personne t) {
		session.getCurrentSession().delete(t);
		
	}



	public List<Personne> afficher() {
		return session.getCurrentSession().createQuery("from Personne p").list();
	}



	public Personne getById(int id) {
		
		return (Personne) session.getCurrentSession().get(Personne.class, id);
	}



	


}
