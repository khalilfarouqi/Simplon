package com.stc.gestion.service.impl;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stc.gestion.entities.Participant;
import com.stc.gestion.exception.ResourceNotFoundException;
import com.stc.gestion.repositories.ParticipantRepository;
import com.stc.gestion.service.StcService;

@Service
@Component
public class PaticipantServiceImpl implements StcService<Participant, Long> {
	
	private ParticipantRepository participantRepository;
	private PasswordEncoder  passwordEncoder;

	public PaticipantServiceImpl(ParticipantRepository participantRepository, PasswordEncoder passwordEncoder) {
		super();
		this.participantRepository = participantRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<Participant> getAll() {
		
		return participantRepository.findAll();
	}

	@Override
	public Participant save(Participant participant) {
		
		String pw = participant.getPassword();
		participant.setPassword(passwordEncoder.encode(pw));
		return participantRepository.save(participant);
	}

	@Override
	public Participant getById(long id) {

		return participantRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Participant", "Id", id));
	}

	@Override
	public Participant update(Participant participant, long id) {

		Participant existingParticipant = participantRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Participant", "Id", id));
		
		
		existingParticipant.setNom(participant.getNom());
		existingParticipant.setPrenom(participant.getPrenom());
		existingParticipant.setEmail(participant.getEmail());
		existingParticipant.setUsername(participant.getUsername());
		existingParticipant.setPassword(participant.getPassword());
		existingParticipant.setTelephone(participant.getTelephone());
		existingParticipant.setStructure(participant.getStructure());
		existingParticipant.setDomaine(participant.getDomaine());
		
		participantRepository.save(existingParticipant);
		return existingParticipant;
	}

	@Override
	public void delete(long id) {
		
		participantRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Participant", "Id", id));
		
		participantRepository.deleteById(id);
	}

}
