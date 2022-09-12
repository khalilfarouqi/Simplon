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

import com.rest.brief.project.stc.model.Activite;
import com.rest.brief.project.stc.service.ActviteService;


	@RestController
	@RequestMapping("/activite")
	public class ActiviteController {
		@Autowired(required = true)
		ActviteService activiteService;

		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public Activite addResponsable(@RequestBody Activite activite) {
			return activiteService.saveActivite(activite);
		}

		// Fetch all responsable records
		@GetMapping
		public List<Activite> getAllActivite() {
			return activiteService.getAllActivite();
		}

		// Fetch single responsable
		@GetMapping(value = "/{id}")
		public Optional<Activite> getActiviteById(@PathVariable("id") Long id) {
			return activiteService.getActivite(id);
		}

		// Update responsable record
		@PutMapping("/{id}")
		public ResponseEntity<Activite> updateActivite(@PathVariable("id") long id, @RequestBody Activite activite) {
			return new ResponseEntity<Activite>(activiteService.updateActivite(activite, id), HttpStatus.OK);
		}

		// Delete responsable record
		@DeleteMapping("/{id}")
		public ResponseEntity<String> deleteActivite(@PathVariable Long id) {
			try {
				activiteService.deleteActivite(id);
				return new ResponseEntity<String>(HttpStatus.OK);
			} catch (RuntimeException ex) {
				// log the error message
				System.out.println(ex.getMessage());
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
			}
		}
	}
