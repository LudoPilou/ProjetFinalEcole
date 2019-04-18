package org.college.serveur.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idRole;
	private String roleName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Id_user")
	private User user;
	
	
	

	public Role(String roleName) {
		this.roleName = roleName;
	}
	
	public Role() {
	}


	public long getIdRole() {
		return idRole;
	}


	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + ", user=" + user + "]";
	}
		

}
