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

import com.example.gestion.entities.Responsable;
import com.example.gestion.services.ResponsableService;

@RestController
@RequestMapping("/api/responsables")
public class ResponsableController {

	private ResponsableService responsableService;

	public ResponsableController(ResponsableService responsableService) {
		super();
		this.responsableService = responsableService;
	}

	// build create a responsable REST API
	@PostMapping
	public ResponseEntity<Responsable> saveResponsable(@RequestBody Responsable responsable) {

		return new ResponseEntity<Responsable>(responsableService.saveResponsable(responsable), HttpStatus.CREATED);
	}

	// build get all responsables REST API
	@GetMapping
	public List<Responsable> getAllAdmins() {
		return responsableService.getAllResponsables();
	}

	// build get responsable by id REST API
	// http://localhost:8080/api/exercice/1
	@GetMapping("{ID_User}")
	public ResponseEntity<Responsable> getResponsableById(@PathVariable("ID_User") long id) {
		return new ResponseEntity<Responsable>(responsableService.getResponsableById(id), HttpStatus.OK);
	}

	// build update responsable REST API
	// http://localhost:8080/api/employees/1
	@PutMapping("{ID_User}")
	public ResponseEntity<Responsable> updateResponsable(@PathVariable("ID_User") long id,
			@RequestBody Responsable responsable) {
		return new ResponseEntity<Responsable>(responsableService.updateResponsable(responsable, id),
				HttpStatus.OK);
	}
	
	// build delete responsable REST API
		// http://localhost:8080/api/employees/1
		@DeleteMapping("{ID_User}")
		public ResponseEntity<String> deleteResponsable(@PathVariable("ID_User") long id) {

			// delete admin from DB
			responsableService.deleteResponsableById(id);
			return new ResponseEntity<String>("Responsable deleted successfully!.", HttpStatus.OK);
		}
}
