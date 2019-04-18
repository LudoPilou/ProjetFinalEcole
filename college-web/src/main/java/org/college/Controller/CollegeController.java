package org.college.Controller;

import java.util.List;

import org.college.serveur.entities.Colleges;
import org.college.serveur.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CollegeController {
	
	@Autowired
	IGestionCollegeMetier<Colleges> collegeService; 
	
	@RequestMapping("/formCollege")
	public ModelAndView afficheCollege(){
		ModelAndView view=new ModelAndView("gestionCollege","college",new Colleges());
		List<Colleges> colleges=collegeService.afficher(); 
		view.addObject("listColleges",colleges); 
		return view; 
		
	}
	
	@RequestMapping("/addCollege")
	public ModelAndView ajoutCollege(@ModelAttribute("college")Colleges col){
		collegeService.ajouter(col);
		ModelAndView view=new ModelAndView("gestionCollege");
		List<Colleges> colleges=collegeService.afficher(); 
		view.addObject("listColleges",colleges); 
		return view; 
		
	}
	
	@RequestMapping("/edit")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("gestionCollege"); 
		Colleges c=collegeService.getById(id); 
		List<Colleges> colleges=collegeService.afficher(); 
		
		view.addObject("college",c);
		view.addObject("listColleges",colleges); 
		return view; 
	}
	@RequestMapping("/delete")
	public ModelAndView suprimer(@RequestParam int id) {
		ModelAndView view=new ModelAndView("gestionCollege"); 
		Colleges c=collegeService.getById(id); 
		collegeService.supprimer(c);
		List<Colleges> colleges=collegeService.afficher(); 
		view.addObject("listColleges",colleges);
		view.addObject("college",new Colleges());
		return view;
	}
	

}
