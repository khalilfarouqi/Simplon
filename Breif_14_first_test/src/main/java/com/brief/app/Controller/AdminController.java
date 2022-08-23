package com.brief.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.brief.app.entity.Administrateur;
import com.brief.app.services.*;


@Controller
public class AdminController {
	
	private IService<Administrateur> adminSercive;
	
	public AdminController(IService<Administrateur> adminSercive) {
		super();
		this.adminSercive = adminSercive;
	}
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllAdmins() {
		ModelAndView mav = new ModelAndView("HomeAdmin");
		mav.addObject("admins", adminSercive.lister_Tous());
		return mav;
	}
	
	@GetMapping("/addAdminForm")
	public ModelAndView addAdminForm() {
		ModelAndView mav = new ModelAndView("Add_Admin_Form");
		Administrateur newAdmin = new Administrateur();
		mav.addObject("admins", newAdmin);
		return mav;
	}
	
	
	@PostMapping("/saveAdmin")
	public String saveAdmin(@ModelAttribute Administrateur admin) {
		adminSercive.Save(admin);
		return "redirect:/list";
	}
	
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long Id) {
		ModelAndView mav = new ModelAndView("Add_Admin_Form");
		Administrateur admin = adminSercive.lister_One(Id);
		mav.addObject("admins", admin);
		return mav;
	}
	
	@GetMapping("/deleteAdmin")
	public String deleteEmployee(@RequestParam Long Id) {
		adminSercive.Delete(Id);
		return "redirect:/list";
	}
}
