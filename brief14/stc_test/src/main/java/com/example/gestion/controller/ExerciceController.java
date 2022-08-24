package com.example.gestion.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.gestion.entities.Exercice;
import com.example.gestion.services.ExerciceService;

@RestController
@RequestMapping("/api/exercice")
public class ExerciceController {
	private ExerciceService exerciceService;

	public ExerciceController(ExerciceService exerciceService) {
		super();
		this.exerciceService = exerciceService;
	}
	
	// build create Exercice REST API
	@PostMapping()
	public ResponseEntity<Exercice> saveExercice(@RequestBody Exercice exercice){
		return new ResponseEntity<Exercice>(exerciceService.saveExercice(exercice), HttpStatus.CREATED);
	}
		
	// build get all Exercice REST API
	@GetMapping
	public List<Exercice> getAllExercices(){
		return exerciceService.getAllExercices();
	}
		
	// build get Exercice by id REST API
	// http://localhost:8080/api/exercice/1
	@GetMapping("{ID_Exe}")
	public ResponseEntity<Exercice> getExerciceById(@PathVariable("ID_Exe") long id){
		return new ResponseEntity<Exercice>(exerciceService.getExerciceById(id), HttpStatus.OK);
	}
		
	// build update Exercice REST API
	// http://localhost:8080/api/Exercice/1
	@PutMapping("{ID_Exe}")
	public ResponseEntity<Exercice> updateExercice(@PathVariable("ID_Exe") long id ,@RequestBody Exercice exercice){
		return new ResponseEntity<Exercice>(exerciceService.updateExercice(exercice, id), HttpStatus.OK);
	}
		
	// build delete Exercice REST API
	// http://localhost:8080/api/Exercice/1
	@DeleteMapping("{ID_Exe}")
	public ResponseEntity<String> deleteExercice(@PathVariable("ID_Exe") long id){
			
		// delete Exercice from DB
		exerciceService.deleteExerciceById(id);
			
		return new ResponseEntity<String>("Exercice deleted successfully!.", HttpStatus.OK);
	}
}
