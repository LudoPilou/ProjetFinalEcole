package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Colleges;
import org.college.serveur.entities.Departement;
import org.college.serveur.entities.Enseignant;
import org.college.serveur.entities.Matiere;
import org.college.serveur.service.IDepartementMetier;
import org.college.serveur.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class ControllerDepartement {

	//test
	@Autowired
	IDepartementMetier DepartMet;
	
	@Autowired
	@Qualifier("serviceEnseignant")
	IGestionCollegeMetier<Enseignant> EnsMet;
	
	@Autowired
	@Qualifier("serviceCollege")
	IGestionCollegeMetier<Colleges> EnsCol;
	
	@RequestMapping("/addDepartement")
	public ModelAndView ajouter(@ModelAttribute("depart")Departement t) {
		ModelAndView view= new ModelAndView("departement");
		DepartMet.ajouter(t);
		
		
		List <Departement> Depart=DepartMet.afficher();
		System.out.println(Depart);
	    view.addObject("listeDepart",Depart);
	    view.addObject("depart",new Departement());
	    
		List<Enseignant> Ens = new ArrayList<Enseignant>();
		Ens = EnsMet.afficher();
		view.addObject("listEnseignant", Ens);
		
		List<Colleges> coll = new ArrayList<Colleges>();
		coll = EnsCol.afficher();
		view.addObject("listCollege", coll);
		
		return view;
		
	}
	
	@RequestMapping("/modifierDepartement")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("departement");
		Departement t=DepartMet.getById(id);
		List <Departement> Depart=DepartMet.afficher();
		
		List<Enseignant> Ens = new ArrayList<Enseignant>();
		Ens = EnsMet.afficher();
		view.addObject("listEnseignant", Ens);
		
		List<Colleges> coll = new ArrayList<Colleges>();
		coll = EnsCol.afficher();
		view.addObject("listCollege", coll);
		
		view.addObject("depart",t);
	    view.addObject("listeDepart",Depart);
		return view;
		
	}
	@RequestMapping("/gestionDepartement")
	public ModelAndView afficher() {
		
		List<Departement> Depart=new ArrayList<Departement>();
		ModelAndView view= new ModelAndView("departement","depart",new Departement());
		Depart=DepartMet.afficher();
	    view.addObject("listeDepart",Depart);
	    
	    List<Enseignant> Ens = new ArrayList<Enseignant>();
		Ens = EnsMet.afficher();
		view.addObject("listEnseignant", Ens);
		
		List<Colleges> coll = new ArrayList<Colleges>();
		coll = EnsCol.afficher();
		view.addObject("listCollege", coll);
		
		return view ;
		
	}
	
	@RequestMapping("/supprimerDepartement")
public ModelAndView supprimer(@RequestParam int id){
		
		ModelAndView view=new ModelAndView("departement");
		Departement t=DepartMet.getById(id);
		
		System.out.println(t);
		
		
		DepartMet.supprimer(t);
		 List <Departement> Depart=DepartMet.afficher();
		 
		 List<Enseignant> Ens = new ArrayList<Enseignant>();
			Ens = EnsMet.afficher();
			view.addObject("listEnseignant", Ens);
			
		List<Colleges> coll = new ArrayList<Colleges>();
		coll = EnsCol.afficher();
		view.addObject("listCollege", coll);
		 
		 view.addObject("listeDepart",Depart);
		 view.addObject("depart",new Departement());
		 return view;
	}
	
	
	
}
