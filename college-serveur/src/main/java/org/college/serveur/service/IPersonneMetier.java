package org.college.serveur.service;

import org.college.serveur.dao.IPersonneDAO;
import org.college.serveur.dto.FicheSemantique;

public interface IPersonneMetier extends IPersonneDAO {
	
	public FicheSemantique afficherFicheSemantisue(int idPersonne) ;

}
