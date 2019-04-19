package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Departement;
import org.college.serveur.entities.Matiere;
import org.college.serveur.service.IDepartementMetier;
import org.college.serveur.service.IGestionCollegeMetier;
import org.college.serveur.service.INoterMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMoyenneMatiere {
	
	@Autowired
	@Qualifier("serviceMatiere")
	IGestionCollegeMetier<Matiere> serviceMat;
	
	@Autowired
	INoterMetier serviceNote; 
	
	@RequestMapping("/gestionMoyMat")
	public ModelAndView suivi() {
		ModelAndView model = new ModelAndView("moyenneMatiere","matiere", new Matiere());
		List<Matiere> listeMat = new ArrayList<Matiere>(); 
		listeMat = serviceMat.afficher(); 
		model.addObject("listeMat", listeMat); 
		return model; 
	}
	

	@RequestMapping("/calculMoyMat")
	public ModelAndView calculMoyMat(@ModelAttribute("matiere")Matiere m) {
		ModelAndView model = new ModelAndView("moyenneMatiere"); 
		List<Matiere> listeMat = new ArrayList<Matiere>(); 
		listeMat = serviceMat.afficher(); 
		Double moyenne = serviceNote.getMoyenneParMatiere(m.getIdMat());  
		model.addObject("listeMat",listeMat);
		model.addObject("moyenne", moyenne); 
		return model; 
	}



}
