package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Departement;
import org.college.serveur.entities.Enseignant;
import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;
import org.college.serveur.service.IDepartementMetier;
import org.college.serveur.service.IEtudiantMetier;
import org.college.serveur.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class ControllerPersonne {

	@Autowired
	IEtudiantMetier serviceEtu;
	
	@Autowired
	IGestionCollegeMetier<Enseignant> serviceEns;
	
	@Autowired
	IDepartementMetier serviceDep;
	
	@Autowired
	IGestionCollegeMetier<Matiere> serviceMat;
	
	@RequestMapping("/gestionPersonne")
	public ModelAndView renvoieEtudiant() {	
				
		ModelAndView model = new ModelAndView("personne");
		List<Enseignant> listeEns = new ArrayList<Enseignant>();
		listeEns = serviceEns.afficher();
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		model.addObject("listeMat", listeMat);
		model.addObject("listeDep", listeDep);
		
		model.addObject("enseignant", new Enseignant());
		model.addObject("etudiant", new Etudiant());
		model.addObject("listeEns", listeEns);
		model.addObject("listeEtudiant", listeEtud);	
		return model; 
	}
	
	@RequestMapping("/ajoutEnseignant")
	public ModelAndView ajoutEnseignant(@ModelAttribute("enseignant")Enseignant ens) {
		
		ModelAndView view = new ModelAndView("personne");
		serviceEns.ajouter(ens);		
		List<Enseignant> listeEns = new ArrayList<Enseignant>();
		listeEns = serviceEns.afficher();
		
		
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		view.addObject("listeEns", listeEns);
		view.addObject("listeMat", listeMat);
		view.addObject("listeDep", listeDep);
		
		view.addObject("etudiant", new Etudiant());		
		
		return view; 
	}
	
	@RequestMapping("/ajoutEtudiant")
	public ModelAndView ajoutEtudiant(@ModelAttribute("etudiant")Etudiant etud, @ModelAttribute("enseignant")Enseignant ens) {
		
		ModelAndView view = new ModelAndView("personne");
		serviceEtu.ajouter(etud);		
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		view.addObject("listeMat", listeMat);
		view.addObject("listeDep", listeDep);
		view.addObject("listeEtudiant", listeEtud);	
		
		view.addObject("enseignant", new Enseignant());
		
		return view; 
	}
	
	
	@RequestMapping("/editEns")
	public ModelAndView modifierEns(@RequestParam int id) {
		ModelAndView view = new ModelAndView("personne");
		Enseignant ens=serviceEns.getById(id);	
		serviceEns.modifier(ens);
		
		List<Enseignant> listeEns = new ArrayList<Enseignant>();
		listeEns = serviceEns.afficher();
		view.addObject("listeEns", listeEns);	
		
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		view.addObject("listeEtudiant", listeEtud);	
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		view.addObject("listeMat", listeMat);
		view.addObject("listeDep", listeDep);
		
		view.addObject("enseignant", ens);
		view.addObject("etudiant", new Etudiant());
		
		return view;
	}
	
	@RequestMapping("/deleteEns")
	public ModelAndView supprimerEns(@RequestParam int id) {
		ModelAndView view = new ModelAndView("personne");
		Enseignant ens=serviceEns.getById(id);
		serviceEns.supprimer(ens);
	
		List<Enseignant> listeEns = new ArrayList<Enseignant>();
		listeEns = serviceEns.afficher();
		view.addObject("listeEns", listeEns);
		
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		view.addObject("listeEtudiant", listeEtud);	
		
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		view.addObject("listeMat", listeMat);
		view.addObject("listeDep", listeDep);
		
		view.addObject("enseignant", new Enseignant());
		view.addObject("etudiant", new Etudiant());
				
		return view;
	}
	
	
	@RequestMapping("/editEtud")
	public ModelAndView modifierEtud(@RequestParam int id) {
		ModelAndView view = new ModelAndView("personne");
		Etudiant e=serviceEtu.getById(id);	
		serviceEtu.modifier(e);
		
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		view.addObject("listeEtudiant", listeEtud);		
		
		List<Enseignant> listeEns = new ArrayList<Enseignant>();
		listeEns = serviceEns.afficher();
		view.addObject("listeEns", listeEns);
		
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		view.addObject("listeMat", listeMat);
		view.addObject("listeDep", listeDep);
		
		view.addObject("etudiant", e);
		view.addObject("enseignant", new Enseignant());
		
		return view;
	}
	
	@RequestMapping("/deleteEtud")
	public ModelAndView supprimerEtud(@RequestParam int id) {
		ModelAndView view = new ModelAndView("personne");
		Etudiant e=serviceEtu.getById(id);
		serviceEtu.supprimer(e);
	
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		view.addObject("listeEtudiant", listeEtud);	
		
		List<Enseignant> listeEns = new ArrayList<Enseignant>();
		listeEns = serviceEns.afficher();
		view.addObject("listeEns", listeEns);
		
		List<Departement> listeDep = new ArrayList<Departement>();
		listeDep = serviceDep.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		view.addObject("listeMat", listeMat);
		view.addObject("listeDep", listeDep);
		
		view.addObject("etudiant", new Etudiant());
		view.addObject("enseignant", new Enseignant());
				
		return view;
	}
	
	
	
}
