package org.college.Controller;

import java.util.ArrayList;
import java.util.List;

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
public class ControllerSalle {
	
	@Autowired
	IGestionCollegeMetier<Salle> serviceSalle;
	
	@RequestMapping("/gestionSalle")
	public ModelAndView createMatiere() {
		ModelAndView view = new ModelAndView("ajoutSalle");
		List<Salle> listeSalle = new ArrayList<Salle>();
		listeSalle=serviceSalle.afficher();		
		view.addObject("listeSalle", listeSalle);
		view.addObject("salle", new Salle());
		return view;
	}
	
	@RequestMapping("/ajouterSalle")
	public ModelAndView ajoutMatiere(@ModelAttribute("salle")Salle salle) {
		ModelAndView view = new ModelAndView("ajoutSalle");
		serviceSalle.ajouter(salle);		
		List<Salle> listeSalle = new ArrayList<Salle>();
		listeSalle=serviceSalle.afficher();		
		view.addObject("listeSalle", listeSalle);
		return view;	
	}
			
	@RequestMapping("/modifSalle")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("ajoutSalle");
		Salle s=serviceSalle.getById(id);
		List<Salle> listeSalle =serviceSalle.afficher();	
		view.addObject("salle",s);
		view.addObject("listeSalle",listeSalle);
		return view;
	}
	
	@RequestMapping("/supprSalle")
	public ModelAndView supprimer(@RequestParam int id) {
		ModelAndView view=new ModelAndView("ajoutSalle");
		Salle s=serviceSalle.getById(id);
		serviceSalle.supprimer(s);
		List<Salle> listeSalle =serviceSalle.afficher();
		view.addObject("listeSalle",listeSalle);
		view.addObject("salle",s);
		return view;
	}
}
