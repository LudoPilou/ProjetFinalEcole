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
		// TODO Auto-generated method stub
		
	}




	public void modifier(Colleges t) {
		// TODO Auto-generated method stub
		
	}




	public void supprimer(Colleges t) {
		// TODO Auto-generated method stub
		
	}




	public List<Colleges> afficher() {
		// TODO Auto-generated method stub
		return null;
	}




	public Colleges getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
