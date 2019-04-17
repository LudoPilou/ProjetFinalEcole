package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;



public interface IEtudiantDAO extends IGestionCollegeCRUD<Etudiant> {
	
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);

}
