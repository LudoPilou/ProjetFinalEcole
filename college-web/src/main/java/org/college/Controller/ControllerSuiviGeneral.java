package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Departement;
import org.college.serveur.entities.Matiere;
import org.college.serveur.service.IDepartementMetier;
import org.college.serveur.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ControllerSuiviGeneral {
	
	@Autowired
	IDepartementMetier serviceDep; 
	
	@Autowired
	@Qualifier("serviceMatiere")
	IGestionCollegeMetier<Matiere> serviceMat; 
	
	@RequestMapping("/suiviGeneral")
	public ModelAndView suivi() {
		ModelAndView model = new ModelAndView("suiviGeneral"); 
		List<Departement> listeDep = new ArrayList<Departement>(); 
		listeDep = serviceDep.afficher();
		System.out.println(listeDep);
		List<Matiere> listeMat = new ArrayList<Matiere>(); 
		listeMat = serviceMat.afficher(); 
		
		model.addObject("departement", new Departement());
		model.addObject("matiere", new Matiere());
		model.addObject("listeDep",listeDep); 
		model.addObject("listeMat", listeMat); 
		return model; 
	}
	
	@RequestMapping("/calculMoyDep")
	public ModelAndView calculMoyDep() {
		ModelAndView model = new ModelAndView("suiviGeneral"); 
		
		
		return model; 
	}
	
	@RequestMapping("/calculMoyMat")
	public ModelAndView calculMoyMat() {
		ModelAndView model = new ModelAndView("suiviGeneral"); 
		
		return model; 
	}

}
