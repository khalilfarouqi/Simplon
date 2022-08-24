package com.example.gestion.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestion.entities.Administrateur;
import com.example.gestion.services.AdministrateurService;

@RestController
@RequestMapping("/api/admins")

public class AdministrateurController {

	private AdministrateurService administrateurService;

	public AdministrateurController(AdministrateurService administrateurService) {
		super();
		this.administrateurService = administrateurService;
	}

	// build create an admin REST API
	@PostMapping
	public ResponseEntity<Administrateur> saveAdministrateur(@RequestBody Administrateur administrateur) {

		return new ResponseEntity<Administrateur>(administrateurService.saveAdmin(administrateur), HttpStatus.CREATED);
	}

	// build get all admins REST API
	@GetMapping
	public List<Administrateur> getAllAdmins() {
		return administrateurService.getAllAdmins();
	}

	// build get admin by id REST API
	// http://localhost:8080/api/employees/1
	@GetMapping("{ID_User}")
	public ResponseEntity<Administrateur> getAdminById(@PathVariable("ID_User") long adminId) {
		return new ResponseEntity<Administrateur>(administrateurService.getAdminById(adminId), HttpStatus.OK);
	}

	// build update admin REST API
	// http://localhost:8080/api/employees/1
	@PutMapping("{ID_User}")
	public ResponseEntity<Administrateur> updateAdmin(@PathVariable("ID_User") long id,
			@RequestBody Administrateur administrateur) {
		return new ResponseEntity<Administrateur>(administrateurService.updateAdministrateur(administrateur, id),
				HttpStatus.OK);
	}

	// build delete admin REST API
	// http://localhost:8080/api/employees/1
	@DeleteMapping("{ID_User}")
	public ResponseEntity<String> deleteAdmin(@PathVariable("ID_User") long id) {

		// delete admin from DB
		administrateurService.deleteAdminById(id);
		return new ResponseEntity<String>("Admin deleted successfully!.", HttpStatus.OK);
	}
}
