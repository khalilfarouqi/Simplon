package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entity.*;
import com.app.service.ActiviteService;

@RestController
@RequestMapping("/api/activite")
public class ActiviteController {

	private com.app.service.ActiviteService activiteService;

	public ActiviteController(ActiviteService activiteService) {
		super();
		this.activiteService = activiteService;
	}

	// build create activite REST API
	@PostMapping
	public ResponseEntity<Activite> save(@RequestBody Activite activite) {
		return new ResponseEntity<Activite>(activiteService.saveActivite(activite), HttpStatus.CREATED);
	}

	// build get all activites REST API
	@GetMapping
	public List<Activite> getAllActivite() {
		return activiteService.getAllActivites();
	}

	// build get activite by id REST API
	// http://localhost:8080/api/activite/1
	@GetMapping("{id}")
	public ResponseEntity<Activite> getActiviteById(@PathVariable("id") long activiteId) {
		return new ResponseEntity<Activite>(activiteService.getActiviteById(activiteId), HttpStatus.OK);
	}

	// build update activite REST API
	// http://localhost:8080/api/activite/1
	@PutMapping("{id}")
	public ResponseEntity<Activite> updateActivite(@PathVariable("id") long id, @RequestBody Activite activite) {
		return new ResponseEntity<Activite>(activiteService.updateActivite(activite, id), HttpStatus.OK);
	}

	// build delete activite REST API
	// http://localhost:8080/api/activite/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteActivite(@PathVariable("id") long id) {

		// delete activite from DB
		activiteService.deleteActiviteById(id);

		return new ResponseEntity<String>("Activite deleted successfully!.", HttpStatus.OK);
	}

}
