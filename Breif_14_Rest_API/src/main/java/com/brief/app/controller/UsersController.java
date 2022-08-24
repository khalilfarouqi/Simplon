package com.brief.app.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.brief.app.model.Users;
import com.brief.app.service.UsersService;

@RestController
@RequestMapping("/api/user")
public class UsersController {
	
	private UsersService usersService;

	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	// build create user REST API
		@PostMapping()
		public ResponseEntity<Users> saveEmployee(@RequestBody Users user){
			return new ResponseEntity<Users>(usersService.saveUsers(user), HttpStatus.CREATED);
		}
			
		// build get all user REST API
		@GetMapping
		public List<Users> getAllEmployees(){
			return usersService.getAllUsers();
		}
			
		// build get user by id REST API
		// http://localhost:8080/api/user/1
		@GetMapping("{id}")
		public ResponseEntity<Users> getEmployeeById(@PathVariable("id") long id){
			return new ResponseEntity<Users>(usersService.getUsersById(id), HttpStatus.OK);
		}
			
		// build update employee REST API
		// http://localhost:8080/api/User/1
		@PutMapping("{id}")
		public ResponseEntity<Users> updateEmployee(@PathVariable("id") long id ,@RequestBody Users user){
			return new ResponseEntity<Users>(usersService.updateUsers(user, id), HttpStatus.OK);
		}
			
		// build delete employee REST API
		// http://localhost:8080/api/user/1
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
				
			// delete user from DB
			usersService.deleteUsers(id);
				
			return new ResponseEntity<String>("User deleted successfully!.", HttpStatus.OK);
		}
	
}
