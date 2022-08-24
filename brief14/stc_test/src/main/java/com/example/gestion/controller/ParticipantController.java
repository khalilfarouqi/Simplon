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

import com.example.gestion.entities.Participant;
import com.example.gestion.services.ParticipantService;

@RestController
@RequestMapping("/api/participants")
public class ParticipantController {

	private ParticipantService participantService;

	public ParticipantController(ParticipantService participantService) {
		super();
		this.participantService = participantService;
	}

	// build create a participant REST API
	@PostMapping
	public ResponseEntity<Participant> saveResponsable(@RequestBody Participant participant) {

		return new ResponseEntity<Participant>(participantService.saveParticipant(participant), HttpStatus.CREATED);
	}

	// build get all participants REST API
	@GetMapping
	public List<Participant> getAllAdmins() {
		return participantService.getAllParticipants();
	}

	// build get participant by id REST API
	// http://localhost:8080/api/exercice/1
	@GetMapping("{ID_User}")
	public ResponseEntity<Participant> getParticipantById(@PathVariable("ID_User") long id) {
		return new ResponseEntity<Participant>(participantService.getParticipantById(id), HttpStatus.OK);
	}

	// build update participant REST API
	// http://localhost:8080/api/employees/1
	@PutMapping("{ID_User}")
	public ResponseEntity<Participant> updateParticipant(@PathVariable("ID_User") long id,
			@RequestBody Participant participant) {
		return new ResponseEntity<Participant>(participantService.updateParticipant(participant, id),
				HttpStatus.OK);
	}
	
	// build delete responsable REST API
		// http://localhost:8080/api/employees/1
		@DeleteMapping("{ID_User}")
		public ResponseEntity<String> deleteParticipant(@PathVariable("ID_User") long id) {

			// delete admin from DB
			participantService.deleteParticipantById(id);
			return new ResponseEntity<String>("Participant deleted successfully!.", HttpStatus.OK);
		}
}

