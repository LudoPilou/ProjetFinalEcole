package org.college.Controller;

import org.college.serveur.entities.Colleges;
import org.college.serveur.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerTest {

	@Autowired
	IGestionCollegeMetier<Colleges> mcollege;
	
	@RequestMapping("/redirect")
	public ModelAndView afficher() {
		return new ModelAndView("test");
		
	}
	
	
}
