package com.stc.gestion.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stc.gestion.entities.Activite;
import com.stc.gestion.exception.ResourceNotFoundException;
import com.stc.gestion.repositories.ActiviteRepository;
import com.stc.gestion.service.StcService;

@Service
@Component
public class ActiviteServiceImp implements StcService<Activite, Long> {
	
	private ActiviteRepository activiteRepository;
	public ActiviteServiceImp(ActiviteRepository activiteRepository) {
		super();
		this.activiteRepository = activiteRepository;
	}

	@Override
	public List<Activite> getAll() {
		
		return activiteRepository.findAll();
	}

	@Override
	public Activite save(Activite activite) {
		
		return activiteRepository.save(activite);
	}

	@Override
	public Activite getById(long id) {
		
		return activiteRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Activite", "Id", id));
	}

	@Override
	public Activite update(Activite activite, long id) {
		Activite existingActivite = activiteRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Activite", "Id", id));	
		
		existingActivite.setTitre(activite.getTitre());
		existingActivite.setDescriptif(activite.getDescriptif());
		existingActivite.setType(activite.getType());
		existingActivite.setDate_debut(activite.getDate_debut());
		existingActivite.setDate_fin(activite.getDate_fin());
		existingActivite.setEtat(activite.getEtat());
		//existingActivite.setParticipants(activite.getParticipants());
		
		activiteRepository.save(existingActivite);
		return existingActivite;
	}

	@Override
	public void delete(long id) {
		
		activiteRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Activite", "Id", id));
		
		activiteRepository.deleteById(id);
	}


}
