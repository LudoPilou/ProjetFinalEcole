package org.college.serveur.dao;

import org.college.serveur.entities.Noter;

public interface INoterDAO extends IGestionCollegeCRUD<Noter> {
	
	
	public double getMoyenneParMatiere(int idMatiere);

}
