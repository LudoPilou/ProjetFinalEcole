package org.college.serveur.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Noter implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Float note;
	
	@Id
	@ManyToOne
	private Matiere matiere;
	
	@Id
	@ManyToOne
	@JoinColumn(name="idPersonne")
	private Etudiant etudiant;
	
	public Noter(float note, Matiere matiere, Etudiant etudiant) {
		
		this.setNote(note);
		this.setMatiere(matiere);
		this.setEtudiant(etudiant);
	}

	public Noter() {
		
	}

	public Float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@Override
	public String toString() {
		return "Noter [note=" + note + ", matiere=" + matiere + ", etudiant=" + etudiant + "]";
	}
	
	

}
