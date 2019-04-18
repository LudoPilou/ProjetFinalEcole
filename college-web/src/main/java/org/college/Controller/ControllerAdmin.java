package org.college.Controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerAdmin {

	
	@RequestMapping(value="/admin/home", method=RequestMethod.GET)
	public String homeAdmin(Locale locale, Model model, HttpServletRequest request) {
		return "acceuil";
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String adminLogin() {
		return "authentification";
		
	}
}
