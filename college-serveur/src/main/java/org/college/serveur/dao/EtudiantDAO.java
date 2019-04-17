package org.college.serveur.dao;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;
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


@Repository("daoEtudiant")
public class EtudiantDAO implements  IEtudiantDAO {

	
	@Autowired
	private SessionFactory session; 
	
	public EtudiantDAO() {
		
	}

	public void ajouter(Etudiant t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Etudiant t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Etudiant t) {
		// TODO Auto-generated method stub
		
	}

	public List<Etudiant> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getMoyenneGenerale(int idEtudiant) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
