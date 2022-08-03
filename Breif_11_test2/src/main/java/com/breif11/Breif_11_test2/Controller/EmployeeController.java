package com.breif11.Breif_11_test2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.breif11.Breif_11_test2.dao.EmployeeRepository;
import com.breif11.Breif_11_test2.models.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("List_Employees");
		mav.addObject("employees", eRepo.findAll());
		return mav;
	}
	
	@GetMapping("/addEmployeeForm")
	public ModelAndView addEmployeeForm() {
		ModelAndView mav = new ModelAndView("Add_Employee_Form");
		Employee newEmployee = new Employee();
		mav.addObject("employee", newEmployee);
		return mav;
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		eRepo.save(employee);
		return "redirect:/list";
	}
	
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long employeeId) {
		ModelAndView mav = new ModelAndView("Add_Employee_Form");
		Employee employee = eRepo.findById(employeeId).get();
		mav.addObject("employee", employee);
		return mav;
	}
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam Long employeeId) {
		eRepo.deleteById(employeeId);
		return "redirect:/list";
	}
}
