package org.college.serveur.dao;

import javax.management.relation.Role;

import org.college.serveur.entities.User;

public interface IAdminDAO {

	public void ajouter(User admin);
	public void ajouter(Role admin);
}
