package org.college.serveur.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enseignant extends Personne{
	
	private Date datePriseFonction;
	private int indice;
	
	@ManyToOne
	@JoinColumn(name="idDepartement")
	private Departement departement;
	
	@ManyToOne
	@JoinColumn(name="idMatiere")
	private Matiere matiere;
	
	
	public Enseignant(String nom, String prenom, String mail, int tel, Date datePriseFonction, int indice) {
		super(nom, prenom, mail, tel);
		this.setDatePriseFonction(datePriseFonction);
		this.setIndice(indice);
	}
	public Enseignant() {
		
	}
	public Date getDatePriseFonction() {
		return datePriseFonction;
	}
	public void setDatePriseFonction(Date datePriseFonction) {
		this.datePriseFonction = datePriseFonction;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	@Override
	public String toString() {
		return "Enseignant [datePriseFonction=" + datePriseFonction + ", indice=" + indice + ", idPersonne="
				+ idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", tel=" + tel + "]";
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
	
	

}
