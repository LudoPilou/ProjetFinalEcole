package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Colleges;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoCollege")
public class CollegeDAO implements ICollegeDAO{

	
	@Autowired
	private SessionFactory session; 
	
	
	 
	
	public CollegeDAO() {
	

	}




	public void ajouter(Colleges t) {
		session.getCurrentSession().merge(t);
		
	}




	public void modifier(Colleges t) {
		session.getCurrentSession().update(t);
		
	}




	public void supprimer(Colleges t) {
		session.getCurrentSession().delete(t);
		
	}




	public List<Colleges> afficher() {
		
		return session.getCurrentSession().createQuery("from Colleges c").list();
	}




	public Colleges getById(int id) {
		
		return (Colleges) session.getCurrentSession().get(Colleges.class, id);
	}



}
