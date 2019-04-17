package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.IPersonneDAO;
import org.college.serveur.dao.PersonneDAO;
import org.college.serveur.dto.FicheSemantique;
import org.college.serveur.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("servicePersonne")
public class PersonneMetier implements IPersonneMetier {
	
	@Autowired
	@Qualifier("daoPersonne")
	private IPersonneDAO pdao;
	
	
	

	public PersonneMetier() {
		pdao=new PersonneDAO();
		
	}




	
	public FicheSemantique afficherFicheSemantisue(int idPersonne) {
		
		
			Personne p=pdao.getById(idPersonne);
			FicheSemantique fs=new FicheSemantique();
			fs.setPrenom(p.getPrenom());
			fs.setMail(p.getMail());
			fs.setTel(p.getTel());
			return fs;
		
	}




	
	public void ajouter(Personne t) {
		pdao.ajouter(t);
		
	}




	
	public void modifier(Personne t) {
		pdao.modifier(t);
		
	}




	
	public void supprimer(Personne t) {
		pdao.supprimer(t);
		
	}




	
	public List<Personne> afficher() {
		
		return pdao.afficher();
	}




	
	public Personne getById(int id) {
		
		return pdao.getById(id);
	}

}
