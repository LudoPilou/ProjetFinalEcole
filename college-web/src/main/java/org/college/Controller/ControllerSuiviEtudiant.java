package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Etudiant;
import org.college.serveur.entities.Matiere;
import org.college.serveur.service.IEtudiantMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerSuiviEtudiant {
	
	@Autowired
	IEtudiantMetier serviceEtu;
	
	@RequestMapping("/gestionEtudiant")
	public ModelAndView selectionnerEtu() {
		ModelAndView view = new ModelAndView("suiviEtudiant");
		List<Etudiant> listEtudiant = new ArrayList<Etudiant>();
		listEtudiant = serviceEtu.afficher();
		view.addObject("etudiant", new Etudiant());
		view.addObject("listEtudiant", listEtudiant);
		return view;		
	}

	@RequestMapping("/calculMoyenne")
	public ModelAndView calculMoyenneEtu(@ModelAttribute("etudiant")Etudiant e) {
		ModelAndView view = new ModelAndView("suiviEtudiant");
		List<Etudiant> listEtudiant = new ArrayList<Etudiant>();
		listEtudiant = serviceEtu.afficher();
		Double moyenne = serviceEtu.getMoyenneGenerale(e.getIdPersonne());
		view.addObject("etudiant", e);	
		view.addObject("matiere", new Matiere());
		view.addObject("listEtudiant", listEtudiant);
		view.addObject("moyenne", moyenne);
		return view;
	}
	
	@RequestMapping("/MatSansNote")
	public ModelAndView matiereNonNotee() {
		ModelAndView view = new ModelAndView("suiviEtudiant");
		Etudiant e = new Etudiant();
		List<Matiere> listMatSansNote = new ArrayList<Matiere>();
		listMatSansNote= serviceEtu.getMatieresSansNote(e.getIdPersonne());
		view.addObject("etudiant", e);	
		view.addObject("matiere", new Matiere());
		view.addObject("listMatSansNote", listMatSansNote);
		return view;
	}
	
	@RequestMapping("/EtudiantsAdmis")
	public ModelAndView afficherAdmis() {
		ModelAndView view = new ModelAndView("suiviEtudiant");
		List<Etudiant> listeAdmis = new ArrayList<Etudiant>();
		listeAdmis = serviceEtu.afficherEtuAdmis();
		view.addObject("etudiant", new Etudiant());
		view.addObject("listeAdmis", listeAdmis);	
		return view;
	}
}
