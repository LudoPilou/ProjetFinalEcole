package org.college.serveur.service;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.dao.DepartementDAO;
import org.college.serveur.dao.IDepartementDAO;
import org.college.serveur.dao.INoterDAO;
import org.college.serveur.dao.NoterDAO;
import org.college.serveur.entities.Departement;
import org.college.serveur.entities.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("serviceDepartement")
public class DepartementMetier implements IGestionCollegeMetier<Departement>,IDepartementMetier {

	
	@Autowired
	@Qualifier("daoDepartement")
	private IDepartementDAO dao;
	
	@Autowired
	@Qualifier("daoNoter")
	private INoterDAO ndao;
	
	
	public DepartementMetier() {
		dao=new DepartementDAO();
		ndao=new NoterDAO();
	}

	
	public void ajouter(Departement t) {
		dao.ajouter(t);
	}

	
	public void modifier(Departement t) {
		dao.modifier(t);
		
	}

	
	public void supprimer(Departement t) {
		dao.supprimer(t);
		
	}

	
	public List<Departement> afficher() {
		
		return dao.afficher();
	}

	
	public Departement getById(int id) {
		
		return dao.getById(id);
	}

	
	public double getMoyenneParDepartement(int idDepartement) {
		
		Departement dep =dao.getById(idDepartement);
		
		
		List<Integer> idMatieres=new ArrayList<Integer>();
		double sommeMoyenne=0;
		
		for(Enseignant e : dep.getEnseignants()) {
			
			if(e.getMatiere().getIdMat()!=0) {
			idMatieres.add(e.getMatiere().getIdMat());
			sommeMoyenne+=ndao.getMoyenneParMatiere(e.getMatiere().getIdMat());
			}
		}
		
		
		
		double moyenneDep=sommeMoyenne/idMatieres.size();
		System.out.println("somme final "+sommeMoyenne+" nbfinal "+idMatieres.size());
		
		return moyenneDep;
	}


	
}
