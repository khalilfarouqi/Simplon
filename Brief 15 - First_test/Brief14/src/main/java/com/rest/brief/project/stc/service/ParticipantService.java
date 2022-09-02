package com.rest.brief.project.stc.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rest.brief.project.stc.model.Participant;
import com.rest.brief.project.stc.exeption.Exeption;
import com.rest.brief.project.stc.repository.ParticipantRepository;

@Service
public class ParticipantService {
	
	 @Autowired
	    private ParticipantRepository participantRepository;
	 
	 @Autowired
	    private PasswordEncoder passwordEncoder;

	    public Optional<Participant> getParticipant(final Long id) {
	        return participantRepository.findById(id);
	    }

	    public Iterable<Participant> getParticipant() {
	        return participantRepository.findAll();
	    }

	    public void deleteParticipant(final Long id) {
	    	participantRepository.deleteById(id);
	    }

	    public Participant saveParticipant(Participant participant) {
	    	Participant savedParticipant;

	    	String password=passwordEncoder.encode(participant.getPasword());
	    	participant.setPasword(password);
	    	
	    	savedParticipant = participantRepository.save(participant);
	        return savedParticipant;
	    }
	    public List<Participant> getAllParticipant(){
	        return participantRepository.findAll();
	      }

		public Participant updateParticipant(Participant participant, Long id) {

			Participant existingParticipant = participantRepository.findById(id)
					.orElseThrow(() -> new Exeption("Participant", "Id", id));

			existingParticipant.setNom(participant.getNom());
			existingParticipant.setPrenom(participant.getPrenom());
			existingParticipant.setLogin(participant.getLogin());
			existingParticipant.setPasword(new BCryptPasswordEncoder().encode(participant.getPasword()));
			existingParticipant.setEmail(participant.getEmail());
			existingParticipant.setTelephone(participant.getTelephone());
			existingParticipant.setDomaine(participant.getDomaine());
			existingParticipant.setStructure(participant.getStructure());

			participantRepository.save(existingParticipant);

			return existingParticipant;
			
		}
}
