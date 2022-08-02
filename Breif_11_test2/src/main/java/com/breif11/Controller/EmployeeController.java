package com.breif11.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("List-employees");
		mav.addObject("Employees", eRepo.findAll());
		return mav;
	}
}
