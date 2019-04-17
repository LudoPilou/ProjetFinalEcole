package org.college.serveur.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDepartement;
	private String nomDepartement;
	
	@OneToMany(mappedBy="departement",cascade=CascadeType.ALL)
	private List<Enseignant> enseignants;
	
	@ManyToOne
	@JoinColumn(name="idCollege")
	private Colleges college;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Enseignant Responsable;
	
	
	
	public Departement() {
		
	}
	
	
	public Departement(String nomDepartement) {	
		this.nomDepartement = nomDepartement;
	}
	
	
	public int getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	public List<Enseignant> getEnseignants() {
		return enseignants;
	}
	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	public Enseignant getResponsable() {
		return Responsable;
	}
	public void setResponsable(Enseignant responsable) {
		Responsable = responsable;
	}


	public Colleges getCollege() {
		return college;
	}


	public void setCollege(Colleges college) {
		this.college = college;
	}


	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", nomDepartement=" + nomDepartement + ", college="
				+ college + ", Responsable=" + Responsable + "]";
	}

	
	
}
