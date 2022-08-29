package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entity.*;
import com.app.service.*;

@RestController
@RequestMapping("/api/administrateur")
public class AdministrateurController {
	
	private AdministrateurService administrateurService;
	
	public AdministrateurController(AdministrateurService administrateurService) {
		super();
		this.administrateurService = administrateurService;
	}
	
	// build create administrateur REST API
	@PostMapping
	public ResponseEntity<Administrateur> save(@RequestBody Administrateur administrateur) {
		return new ResponseEntity<Administrateur>(administrateurService.saveAdmin(administrateur), HttpStatus.CREATED);
	}

	// build get all administrateurs REST API
	@GetMapping
	public List<Administrateur> getAllAdmins() {
		return administrateurService.getAllAdmins();
	}

	// build get administrateur by id REST API
	// http://localhost:8080/api/administrateur/1
	@GetMapping("{id}")
	public ResponseEntity<Administrateur> getAdministrateurById(@PathVariable("id") long administrateurId) {
		return new ResponseEntity<Administrateur>(administrateurService.getAdminById(administrateurId), HttpStatus.OK);
	}

	// build update administrateur REST API
	// http://localhost:8080/api/administrateur/1
	@PutMapping("{id}")
	public ResponseEntity<Administrateur> updateAdministrateur(@PathVariable("id") long id,
			@RequestBody Administrateur administrateur) {
		return new ResponseEntity<Administrateur>(administrateurService.updateAdministrateur(administrateur, id),
				HttpStatus.OK);
	}

	// build delete administrateur REST API
	// http://localhost:8080/api/administrateur/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAdministrateur(@PathVariable("id") long id) {

		// delete administrateur from DB
		administrateurService.deleteAdminById(id);

		return new ResponseEntity<String>("Administrateur deleted successfully!.", HttpStatus.OK);
	}

}
