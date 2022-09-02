package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.entity.*;
import com.app.service.*;

@RestController
@RequestMapping("/api/exercice")
public class ExerciceController {

	private ExerciceService exerciceService;

	public ExerciceController(ExerciceService exerciceService) {
		super();
		this.exerciceService = exerciceService;
	}

	// build create exercice REST API
	@PostMapping
	public ResponseEntity<Exercice> save(@RequestBody Exercice exercice) {
		return new ResponseEntity<Exercice>(exerciceService.saveExercice(exercice), HttpStatus.CREATED);
	}

	// build get all exercices REST API
	@GetMapping
	public List<Exercice> getAllExercice() {
		return exerciceService.getAllExercices();
	}

	// build get exercice by id REST API
	// http://localhost:8080/api/exercice/1
	@GetMapping("{id}")
	public ResponseEntity<Exercice> getExerciceById(@PathVariable("id") long exerciceId) {
		return new ResponseEntity<Exercice>(exerciceService.getExerciceById(exerciceId), HttpStatus.OK);
	}

	// build update exercice REST API
	// http://localhost:8080/api/exercice/1
	@PutMapping("{id}")
	public ResponseEntity<Exercice> updateExercice(@PathVariable("id") long id, @RequestBody Exercice exercice) {
		return new ResponseEntity<Exercice>(exerciceService.updateExercice(exercice, id), HttpStatus.OK);
	}

	// build delete exercice REST API
	// http://localhost:8080/api/exercice/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteExercice(@PathVariable("id") long id) {

		// delete exercice from DB
		exerciceService.deleteExerciceById(id);

		return new ResponseEntity<String>("Exercice deleted successfully!.", HttpStatus.OK);
	}

}
