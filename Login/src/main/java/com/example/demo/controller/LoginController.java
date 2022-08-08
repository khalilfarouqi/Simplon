package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.LoginForm;

@Controller
public class LoginController {
	
	//get login form page
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}
	
	//checking for login
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		
		String Username = loginForm.getUssername();
		String Password = loginForm.getPassword();
		
		System.out.println(Username + " <-- user | Password --> " + Password);
		
		if("admin@admin.com".equals(Username) || "admin".equals(Password)) {
			return "Home";
		}
		model.addAttribute("invalidCredentials", true);
		return "Login";
	}
}
