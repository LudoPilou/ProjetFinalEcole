package org.college.serveur.service;

import org.college.serveur.dao.IDepartementDAO;

public interface IDepartementMetier extends IDepartementDAO{
	
	public double getMoyenneParDepartement(int idDepartement);

}
