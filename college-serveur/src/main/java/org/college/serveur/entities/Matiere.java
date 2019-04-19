package org.college.serveur.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Matiere {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMat;
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="idSalle")
	private Salle salle;
	
	@OneToMany(mappedBy="matiere")
	private List<Enseignant> enseignants;
	
	
	public Matiere() {
		
	}

	public Matiere(String nom) {
		
		this.nom = nom;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public int getIdMat() {
		return idMat;
	}

	public void setIdMat(int idMat) {
		this.idMat = idMat;
	}

	
	
	
	

}
