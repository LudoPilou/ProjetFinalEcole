<<<<<<< HEAD
package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Noter;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("daoNoter")
public class NoterDAO implements INoterDAO {

	@Autowired
	private SessionFactory session; 
	
	
	
	public NoterDAO() {
		
	}



	public void ajouter(Noter t) {
		session.getCurrentSession().merge(t);
		
	}



	public void modifier(Noter t) {
		session.getCurrentSession().update(t);
		
	}



	public void supprimer(Noter t) {
		session.getCurrentSession().delete(t);
		
	}



	public List<Noter> afficher() {
		return session.getCurrentSession().createQuery("select n from Noter n").list();
	}



	public Noter getById(int id) {
		return (Noter) session.getCurrentSession().get(Noter.class, id);
	}



	public double getMoyenneParMatiere(int idMatiere) {
		
		Query q=session.getCurrentSession().createQuery(" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere").setParameter("id", idMatiere);
		return (Double) q.list().get(0);
	}

	

}
=======
package org.college.serveur.dao;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Noter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoNoter")
public class NoterDAO implements INoterDAO {

	@Autowired
	private SessionFactory session; 
	
	
	
	public NoterDAO() {
	
	}



	public void ajouter(Noter t) {
		// TODO Auto-generated method stub
		
	}



	public void modifier(Noter t) {
		// TODO Auto-generated method stub
		
	}



	public void supprimer(Noter t) {
		// TODO Auto-generated method stub
		
	}



	public List<Noter> afficher() {
		// TODO Auto-generated method stub
		return null;
	}



	public Noter getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
>>>>>>> branch 'master' of https://github.com/LudoPilou/ProjetFinalEcole.git
