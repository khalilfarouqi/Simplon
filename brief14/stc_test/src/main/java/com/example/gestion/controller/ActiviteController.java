package com.example.gestion.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.gestion.entities.Activite;
import com.example.gestion.services.ActiviteService;

@RestController
@RequestMapping("/api/activites")
public class ActiviteController {
	
	private ActiviteService activiteService;

	public ActiviteController(ActiviteService activiteService) {
		super();
		this.activiteService = activiteService;
	}
	
	// build create activite REST API
	@PostMapping()
	public ResponseEntity<Activite> saveActivite(@RequestBody Activite activite){
		return new ResponseEntity<Activite>(activiteService.saveActivite(activite), HttpStatus.CREATED);
	}
		
	// build get all activites REST API
	@GetMapping
	public List<Activite> getAllExercices(){
		return activiteService.getAllActivites();
	}
		
	// build get activite by id REST API
	// http://localhost:8080/api/exercice/1
	@GetMapping("{ID_Activ}")
	public ResponseEntity<Activite> getActiviteById(@PathVariable("ID_Activ") long id){
		return new ResponseEntity<Activite>(activiteService.getActiviteById(id), HttpStatus.OK);
	}
		
	// build update activite REST API
	// http://localhost:8080/api/Exercice/1
	@PutMapping("{ID_Activ}")
	public ResponseEntity<Activite> updateActivite(@PathVariable("ID_Activ") long id ,@RequestBody Activite activite){
		return new ResponseEntity<Activite>(activiteService.updateActivite(activite, id), HttpStatus.OK);
	}
		
	// build delete activite REST API
	// http://localhost:8080/api/Exercice/1
	@DeleteMapping("{ID_Activ}")
	public ResponseEntity<String> deleteActivite(@PathVariable("ID_Activ") long id){
			
		// delete Exercice from DB
		activiteService.deleteActiviteById(id);
			
		return new ResponseEntity<String>("Activite deleted successfully!.", HttpStatus.OK);
	}
}
