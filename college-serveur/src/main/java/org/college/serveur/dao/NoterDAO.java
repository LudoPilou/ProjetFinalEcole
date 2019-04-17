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
