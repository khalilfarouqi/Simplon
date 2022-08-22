package com.brief.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllEmployees() {
		return null;
	}
	
}
