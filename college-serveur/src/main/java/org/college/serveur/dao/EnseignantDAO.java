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
		// TODO Auto-generated method stub
		
	}

	public void modifier(Enseignant t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Enseignant t) {
		// TODO Auto-generated method stub
		
	}

	public List<Enseignant> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enseignant getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
