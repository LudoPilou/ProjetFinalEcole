package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

import org.college.serveur.entities.Matiere;
import org.college.serveur.entities.Salle;
import org.college.serveur.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class ControllerMatiere {

	@Autowired
	IGestionCollegeMetier<Matiere> serviceMat;
	
	@Autowired
	IGestionCollegeMetier<Salle> serviceSalle;
	
	
	@RequestMapping("/gestionMatiere")
	public ModelAndView createMatiere() {
		List<Matiere> listMat = new ArrayList<Matiere>();
		listMat=serviceMat.afficher();
		Matiere m = new Matiere();
//		Salle s = new Salle();
//		m.setSalle(s);
		List<Salle> listSalle = new ArrayList<Salle>();
		listSalle=serviceSalle.afficher();
		ModelAndView view = new ModelAndView("ajoutMatiere");
		view.addObject("matiere", m);
		view.addObject("listMatiere", listMat);
		view.addObject("listSalle", listSalle);
		return view;
	}

	@RequestMapping("/ajouterMatiere")
	public ModelAndView ajoutMatiere(@ModelAttribute("matiere")Matiere mat) {
		ModelAndView view = new ModelAndView("ajoutMatiere");
		serviceMat.ajouter(mat);
		List<Matiere> listMat = new ArrayList<Matiere>();
		listMat=serviceMat.afficher();
		List<Salle> listSalle = new ArrayList<Salle>();
		listSalle=serviceSalle.afficher();
		view.addObject("listMatiere", listMat);
		view.addObject("listSalle", listSalle);
		return view;	
	}
			
	@RequestMapping("/modifMat")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("ajoutMatiere");
		Matiere m=serviceMat.getById(id);
		List<Matiere> listMat =serviceMat.afficher();	
		List<Salle> listSalle = new ArrayList<Salle>();
		listSalle=serviceSalle.afficher();
		view.addObject("matiere",m);
		view.addObject("listMatiere",listMat);
		view.addObject("listSalle", listSalle);
		return view;
	}
	
	@RequestMapping("/supprMat")
	public ModelAndView supprimer(@RequestParam int id) {
		ModelAndView view=new ModelAndView("ajoutMatiere");
		Matiere m=serviceMat.getById(id);
		serviceMat.supprimer(m);
		List<Matiere> listMat =serviceMat.afficher();
		view.addObject("listMatiere",listMat);
		List<Salle> listSalle = new ArrayList<Salle>();
		listSalle=serviceSalle.afficher();
		view.addObject("matiere",m);
		view.addObject("listSalle", listSalle);
		return view;
	}
	
}

