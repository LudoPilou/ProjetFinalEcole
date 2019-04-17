package org.college.serveur.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Colleges {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCollege;
	private String siteInternet;
	
	@OneToMany(mappedBy="college")
	List<Departement> departements;

	public Colleges() {
		
	}

	
	public Colleges(String siteInternet) {
		
		this.siteInternet = siteInternet;
	}




	public int getIdCollege() {
		return idCollege;
	}


	public void setIdCollege(int idCollege) {
		this.idCollege = idCollege;
	}


	public String getSiteInternet() {
		return siteInternet;
	}

	public void setSiteInternet(String siteInternet) {
		this.siteInternet = siteInternet;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}


	@Override
	public String toString() {
		return "College [id=" + idCollege + ", siteInternet=" + siteInternet + "]";
	}
	
	 

}
