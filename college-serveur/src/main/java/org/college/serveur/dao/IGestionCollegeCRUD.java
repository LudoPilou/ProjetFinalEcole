package org.college.serveur.dao;

import java.util.List;

public interface IGestionCollegeCRUD<T> {
	
	public void ajouter(T t);
	public void modifier(T t);
	public void supprimer(T t);
	public List<T> afficher();
	public T getById(int id);

}
