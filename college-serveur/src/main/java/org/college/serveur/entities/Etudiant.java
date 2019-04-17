package org.college.serveur.entities;

import java.util.List;

import javax.persistence.Entity;


@Entity
public class Etudiant extends Personne{
	
	private int anneEntree;
	
	
	

	public Etudiant(String nom, String prenom, String mail, int tel, int anneEntree) {
		super(nom, prenom, mail, tel);
		this.anneEntree = anneEntree;
	}

	public Etudiant() {
		
	}

	public int getAnneEntree() {
		return anneEntree;
	}

	public void setAnneEntree(int anneEntree) {
		this.anneEntree = anneEntree;
	}

	@Override
	public String toString() {
		return "Etudiant [anneEntree=" + anneEntree + ", idPersonne=" + idPersonne + ", nom=" + nom + ", prenom="
				+ prenom + ", mail=" + mail + ", tel=" + tel + "]";
	}

	
	
}
