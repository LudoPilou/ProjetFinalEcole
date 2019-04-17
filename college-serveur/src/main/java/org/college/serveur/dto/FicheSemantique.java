package org.college.serveur.dto;

public class FicheSemantique {
	
	private String prenom;
	private String mail;
	private int tel;
	
	
	
	public FicheSemantique() {
		
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "FicheSemantique [prenom=" + prenom + ", mail=" + mail + ", tel=" + tel + "]";
	}
	
	

}
