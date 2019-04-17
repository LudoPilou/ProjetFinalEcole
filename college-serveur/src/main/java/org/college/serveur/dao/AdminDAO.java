package org.college.serveur.dao;

import javax.management.relation.Role;

import org.college.serveur.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoAdmin")
public class AdminDAO implements IAdminDAO{
	
	@Autowired
	SessionFactory session;

	public void ajouter(User admin) {
		session.getCurrentSession().merge(admin);		
	}

	public void ajouter(Role admin) {
		session.getCurrentSession().merge(admin);		
	}

}
