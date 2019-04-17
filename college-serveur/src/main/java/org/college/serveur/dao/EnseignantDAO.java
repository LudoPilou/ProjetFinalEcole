package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Enseignant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoEnseignant")
public class EnseignantDAO implements IGestionCollegeCRUD<Enseignant>,IEnseignantDAO{

	
	@Autowired
	private SessionFactory session; 
	
	public EnseignantDAO() {
		}

	public void ajouter(Enseignant t) {
		session.getCurrentSession().merge(t);
	}

	public void modifier(Enseignant t) {
		session.getCurrentSession().update(t);
		
	}

	public void supprimer(Enseignant t) {
		session.getCurrentSession().delete(t);
		
	}

	public List<Enseignant> afficher() {
		return session.getCurrentSession().createQuery("from Enseignant e").list();
	}

	public Enseignant getById(int id) {
		return (Enseignant) session.getCurrentSession().get(Enseignant.class, id);
	}


	
	
}
