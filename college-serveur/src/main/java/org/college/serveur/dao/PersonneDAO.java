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
		// TODO Auto-generated method stub
		
	}



	public void modifier(Personne t) {
		// TODO Auto-generated method stub
		
	}



	public void supprimer(Personne t) {
		// TODO Auto-generated method stub
		
	}



	public List<Personne> afficher() {
		// TODO Auto-generated method stub
		return null;
	}



	public Personne getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	


}
