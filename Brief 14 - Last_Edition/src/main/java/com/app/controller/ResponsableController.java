package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entity.*;
import com.app.service.*;

@RestController
@RequestMapping("/api/responsable")
public class ResponsableController {
	
	private ResponsableService responsableService;

	public ResponsableController(ResponsableService responsableService) {
		super();
		this.responsableService = responsableService;
	}
	
	// build create responsable REST API
		@PostMapping()
		public ResponseEntity<Responsable> save(@RequestBody Responsable responsable){
			return new ResponseEntity<Responsable>(responsableService.saveResponsable(responsable), HttpStatus.CREATED);
		}
		
		// build get all responsables REST API
		@GetMapping
		public List<Responsable> getAllResponsables(){
			return responsableService.getAllResponsables();
		}
		
		// build get responsable by id REST API
		// http://localhost:8080/api/responsables/1
		@GetMapping("{id}")
		public ResponseEntity<Responsable> getResponsableById(@PathVariable("id") long responsableId){
			return new ResponseEntity<Responsable>(responsableService.getResponsableById(responsableId), HttpStatus.OK);
		}
		
		// build update responsable REST API
		// http://localhost:8080/api/responsable/1
		@PutMapping("{id}")
		public ResponseEntity<Responsable> updateResponsable(@PathVariable("id") long id
													  ,@RequestBody Responsable responsable){
			return new ResponseEntity<Responsable>(responsableService.updateResponsable(responsable, id), HttpStatus.OK);
		}
		
		// build delete responsable REST API
		// http://localhost:8080/api/responsable/1
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteResponsable(@PathVariable("id") long id){
			
			// delete responsable from DB
			responsableService.deleteResponsableById(id);
			
			return new ResponseEntity<String>("Responsable deleted successfully!.", HttpStatus.OK);
		}

}
