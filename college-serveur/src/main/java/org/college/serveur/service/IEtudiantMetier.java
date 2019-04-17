package org.college.serveur.service;

import java.util.List;

import org.college.serveur.dao.IEtudiantDAO;
import org.college.serveur.entities.Matiere;



public interface IEtudiantMetier extends IEtudiantDAO{
	
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);

}
