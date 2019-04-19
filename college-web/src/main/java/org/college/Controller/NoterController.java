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
	INoterMetier serviceNote;
	
	
	@Autowired
	INoterMetier notemetier;
	
	private int idMatiere;
	private int idEtud;

	@RequestMapping("/gestionNoter")
	public ModelAndView renvoieEtudiant() {	
		
		int edit=0;
				
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
		model.addObject("edit", edit);	
		return model; 
	}
	
	
	@RequestMapping("/ajoutNote")
	public ModelAndView ajoutEnseignant(@ModelAttribute("noter")Noter note) {
		
		int edit = 0;

		ModelAndView view = new ModelAndView("noter");

		System.out.println(note);
		Noter n = new Noter();
       
		
		if (note.getEtudiant()!=null && note.getMatiere()!=null && notemetier.getNote(note.getEtudiant().getIdPersonne(), note.getMatiere().getIdMat()) == null) {
			Matiere m = serviceMat.getById(note.getMatiere().getIdMat());
			Etudiant e = serviceEtu.getById(note.getEtudiant().getIdPersonne());

			n.setEtudiant(e);
			n.setMatiere(m);
			n.setNote(note.getNote());

			serviceNote.ajouter(n);
		} else {

			Matiere mat = serviceMat.getById(idMatiere);
			Etudiant etud = serviceEtu.getById(idEtud);

			note.setEtudiant(etud);
			note.setMatiere(mat);
			serviceNote.modifier(note);

		}
		
		List<Noter> listeNote = new ArrayList<Noter>();
		listeNote = serviceNote.afficher();


		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();

		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();

		view.addObject("listeEtud", listeEtud);
		view.addObject("listeMat", listeMat);
		view.addObject("listeNote", listeNote);
		view.addObject("noter", new Noter());
		view.addObject("edit", edit);
		return view;
	}

	@RequestMapping("/editNote")
	public ModelAndView modifier(@RequestParam int id, @RequestParam int idp) {

		int edit = 1;

		ModelAndView view = new ModelAndView("noter");
		Noter n = notemetier.getNote(id, idp);
		view.addObject("noter", n);

		List<Etudiant> listeEtud = new ArrayList<Etudiant>();
		listeEtud = serviceEtu.afficher();

		List<Matiere> listeMat = new ArrayList<Matiere>();
		listeMat = serviceMat.afficher();

		view.addObject("listeEtud", listeEtud);
		view.addObject("listeMat", listeMat);
		view.addObject("edit", edit);
		idMatiere = id;
		idEtud = idp;
		return view;
	}
	
	
	@RequestMapping("/deleteNote")
	public ModelAndView supprimerNote(@RequestParam int id,@RequestParam int idp) {
		ModelAndView view = new ModelAndView("noter");
		
		
		
		
		
		
		return null;
		
	}


	public int getIdMatiere() {
		return idMatiere;
	}


	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}


	public int getIdEtud() {
		return idEtud;
	}


	public void setIdEtud(int idEtud) {
		this.idEtud = idEtud;
	}
	
}
