package com.rest.brief.project.stc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rest.brief.project.stc.model.*;
import com.rest.brief.project.stc.service.*;

@RestController
@RequestMapping("/admin")
public class AdministrateurController {


	@Autowired(required = true)
	AdministateurService AdministateurService;
	

	// Insert admin record
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Administrateur addAdministrateur(@RequestBody Administrateur administrateur) {
		return AdministateurService.saveAdministrateur(administrateur);

	}


	// Fetch all admin records
	@GetMapping
	public List<Administrateur> getAllAdministrateurs() {
		return AdministateurService.getAllAdministrateurs();
	}

	// Fetch single admin
	@GetMapping("/{id}")
	public Optional<Administrateur> getAdministrateurById(@PathVariable("id") Long id) {
		return AdministateurService.getAdministrateur(id);
	}

	// Update admin record
	@PutMapping("/{id}")
	public ResponseEntity<Administrateur> updateAdministrateur(@PathVariable("id") long id, @RequestBody Administrateur administrateur) {
		return new ResponseEntity<Administrateur>(AdministateurService.updateAdministrateur(administrateur, id), HttpStatus.OK);
	}

	// Delete admin record
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAdministrateur(@PathVariable Long id) {
		try {
			AdministateurService.deleteAdministrateur(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (RuntimeException ex) {
			// log the error message
			System.out.println(ex.getMessage());
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
}
