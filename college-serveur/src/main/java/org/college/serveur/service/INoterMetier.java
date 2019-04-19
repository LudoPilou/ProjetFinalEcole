package org.college.serveur.service;

import org.college.serveur.dao.INoterDAO;
import org.college.serveur.entities.Noter;

public interface INoterMetier{
	
	public double getMoyenneParMatiere(int idMatiere);
	public Noter getNote(int idMat,int idP);


}
