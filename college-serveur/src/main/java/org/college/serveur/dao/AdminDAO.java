package org.college.serveur.dao;

import java.util.List;

import org.college.serveur.entities.Role;
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

	public List<User> users() {
		
		return session.getCurrentSession().createQuery("from User u").list();
	}

	public User getById(long id) {
		
		return (User) session.getCurrentSession().get(User.class, id);
	}

}
