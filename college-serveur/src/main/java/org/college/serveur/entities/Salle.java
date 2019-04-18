package org.college.serveur.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSalle;
	private int nbrPlace;
	
	@OneToMany(mappedBy="salle", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	List<Matiere> matieres;
	
	
	public Salle() {
		matieres= new ArrayList<Matiere>();
	}
	public Salle(int nbrPlace) {
		
		this.nbrPlace = nbrPlace;
	}

	public int getNbrPlace() {
		return nbrPlace;
	}
	public void setNbrPlace(int nbrPlace) {
		this.nbrPlace = nbrPlace;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nbrPlace=" + nbrPlace + ", matieres=" + matieres + "]";
	}
	
	

}
