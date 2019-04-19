package org.college.serveur.dao;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;
import org.college.serveur.entities.Noter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoEtudiant")
public class EtudiantDAO implements  IEtudiantDAO {

	
	@Autowired
	private SessionFactory session; 
	
	public EtudiantDAO() {
	}

	public void ajouter(Etudiant t) {
		session.getCurrentSession().merge(t);
		
	}

	public void modifier(Etudiant t) {
		session.getCurrentSession().update(t);
		
	}

	public void supprimer(Etudiant t) {
		session.getCurrentSession().delete(t);
		
	}

	public List<Etudiant> afficher() {
		
		return  session.getCurrentSession().createQuery("from Etudiant e").list();
	}

	public Etudiant getById(int id) {
		
		return (Etudiant) session.getCurrentSession().get(Etudiant.class, id);
	}

	public double getMoyenneGenerale(int idEtudiant) {
		Query q = session.getCurrentSession().createQuery("select avg(note) from Noter n where n.etudiant.idPersonne =:id group by n.etudiant.idPersonne").setParameter("id", idEtudiant);
//		if(!q.list().isEmpty()) {
			return (Double) q.list().get(0);
//		}
//		return 0;
		
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		List<Noter> noters=session.getCurrentSession().createQuery(" from Noter n").list();
		List<Matiere> matiers=new ArrayList<Matiere>();
		for(Noter n : noters) {
			if(n.getEtudiant().getIdPersonne()==idEtudiant && n.getNote()==null) {
				
				matiers.add(n.getMatiere());
			}

		}
		return matiers;
	}
	
	
	
	public List<Etudiant> afficherEtuAdmis(){
		
		return session.getCurrentSession().createQuery(" select * from Personne p inner join Noter n on n.idPersonne=p.idPersonne  group by n.etudiant.idPersonne having avg(note)>10").list() ;
		
	}

}
