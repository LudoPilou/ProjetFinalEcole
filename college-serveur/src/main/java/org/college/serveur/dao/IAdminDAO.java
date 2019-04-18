package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Role;
import org.college.serveur.entities.User;

public interface IAdminDAO {

	public void ajouter(User admin);
	public void ajouter(Role admin);
	public User getById(long id);
	public List<User> users(); 
	
	
}
