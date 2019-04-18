package org.college.serveur.service;

import java.util.List;



import org.college.serveur.dao.IAdminDAO;
import org.college.serveur.entities.Role;
import org.college.serveur.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceAdmin")
public class AdminMetier implements IAdminMetier{
	
	@Autowired
	@Qualifier("daoAdmin")
	private IAdminDAO dao;

	public void ajouter(User admin) {
		dao.ajouter(admin);
	}

	public void ajouter(Role admin) {
		dao.ajouter(admin);
	}

	public List<User> users() {
		
		return dao.users();
	}

	public User getById(long id) {
		
		return dao.getById(id);
	}



}
