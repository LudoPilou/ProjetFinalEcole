package org.college.serveur.service;

import javax.management.relation.Role;

import org.college.serveur.dao.IAdminDAO;
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

}
