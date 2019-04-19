package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Departement;
import org.college.serveur.entities.Enseignant;
import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;
import org.college.serveur.entities.Noter;
import org.college.serveur.service.IEtudiantMetier;
import org.college.serveur.service.IGestionCollegeMetier;
import org.college.serveur.service.INoterMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoterController {
	
	@Autowired
	IEtudiantMetier serviceEtu;
	
	@Autowired
	@Qualifier("serviceMatiere")
	IGestionCollegeMetier<Matiere> serviceMat;
	
	@Autowired
	@Qualifier("serviceNoter")
	IGestionCollegeMetier<Noter> serviceNote;
	
	
	@Autowired
	INoterMetier notemetier;

	@RequestMapping("/gestionNoter")
	public ModelAndView renvoieEtudiant() {	
				
		ModelAndView model = new ModelAndView("noter");
		
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();
		
		List<Noter> listeNote = new ArrayList<Noter>();
		listeNote = serviceNote.afficher();

		model.addObject("listeEtud", listeEtud);
		model.addObject("listeMat", listeMat);
		model.addObject("listeNote", listeNote);
		model.addObject("noter", new Noter());
			
		return model; 
	}
	
	
	@RequestMapping("/ajoutNote")
	public ModelAndView ajoutEnseignant(@ModelAttribute("noter")Noter note) {
		
		ModelAndView view = new ModelAndView("noter");
		
		System.out.println(note);
		Noter n=new Noter();
		System.out.println(note.getMatiere().getIdMat());
		Matiere m=serviceMat.getById(note.getMatiere().getIdMat());
		Etudiant e=serviceEtu.getById(note.getEtudiant().getIdPersonne());
		n.setEtudiant(e);
	    n.setMatiere(m);
	    n.setNote(note.getNote());
		serviceNote.ajouter(n);	
		
		
		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();

		view.addObject("listeEtud", listeEtud);
		view.addObject("listeMat", listeMat);
		
		view.addObject("noter", new Noter());		
		
		return view; 
	}
	
	@RequestMapping("/editNote")
	public ModelAndView modifier(@RequestParam int id,@RequestParam int idp) {
		ModelAndView view = new ModelAndView("noter");
		Noter n=notemetier.getNote(id, idp);
		view.addObject("noter",n);

		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();
		
		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();

		view.addObject("listeEtud", listeEtud);
		view.addObject("listeMat", listeMat);
		
		return view;
	}
	
	
	
}
