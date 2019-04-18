package org.college.Controller;

import java.util.List;



import org.college.serveur.entities.Colleges;
import org.college.serveur.entities.Role;
import org.college.serveur.entities.User;
import org.college.serveur.service.IAdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InscriptionAdminController {
	
	@Autowired
	IAdminMetier adminService; 
	
	
	@RequestMapping("/adminForm")
	public ModelAndView formulaire(){
		return new ModelAndView("InscriptionAd","admin",new User());

	}
	
	@RequestMapping("/addAdmin")
	public ModelAndView ajout(@ModelAttribute("admin")User admin) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12); 

		admin.setPassword(encoder.encode(admin.getPassword()));	


		adminService.ajouter(admin); 
		System.out.println(admin.getRoles());
		return new ModelAndView("InscriptionAd"); 
		
	}
		
		@RequestMapping("/roleForm")
		public ModelAndView role() {
			ModelAndView view=new ModelAndView("addRole","role",new Role()); 
			List<User> users=adminService.users(); 
			view.addObject("users",users); 
			return view; 
			
		}
		
		@RequestMapping("/addRole")
		public ModelAndView ajout(@ModelAttribute("role")Role role){
			User u=adminService.getById(role.getUser().getIdUser());
//			ModelAndView view=new ModelAndView("addRole");
			role.setUser(u);
			adminService.ajouter(role);
//			List<User> users=adminService.users(); 
//			view.addObject("users",users); 
	
			return new ModelAndView("addRole"); 
		}
		

}
