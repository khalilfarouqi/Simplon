package com.brief.app.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.brief.app.model.Role;
import com.brief.app.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	
	private RoleService roleService;

	public RoleController(RoleService roleService) {
		super();
		this.roleService = roleService;
	}
	
	// build create role REST API
	@PostMapping()
	public ResponseEntity<Role> saveEmployee(@RequestBody Role role){
		return new ResponseEntity<Role>(roleService.saveRole(role), HttpStatus.CREATED);
	}
		
	// build get all role REST API
	@GetMapping
	public List<Role> getAllEmployees(){
		return roleService.getAllRole();
	}
		
	// build get role by id REST API
	// http://localhost:8080/api/role/1
	@GetMapping("{id}")
	public ResponseEntity<Role> getEmployeeById(@PathVariable("id") long id){
		return new ResponseEntity<Role>(roleService.getRoleById(id), HttpStatus.OK);
	}
		
	// build update employee REST API
	// http://localhost:8080/api/role/1
	@PutMapping("{id}")
	public ResponseEntity<Role> updateEmployee(@PathVariable("id") long id ,@RequestBody Role role){
		return new ResponseEntity<Role>(roleService.updateRole(role, id), HttpStatus.OK);
	}
		
	// build delete employee REST API
	// http://localhost:8080/api/role/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
			
		// delete role from DB
		roleService.deleteRole(id);
			
		return new ResponseEntity<String>("Role deleted successfully!.", HttpStatus.OK);
	}
	
}
