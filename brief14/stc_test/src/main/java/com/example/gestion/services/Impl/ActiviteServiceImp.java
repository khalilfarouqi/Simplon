package com.example.gestion.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gestion.entities.Activite;
import com.example.gestion.repositories.ActiviteRepository;
import com.example.gestion.services.ActiviteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ActiviteServiceImp implements ActiviteService{
	
	private ActiviteRepository activiteRepository;

	@Override
	public List<Activite> getAllActivites() {
		
		return activiteRepository.findAll();
	}

	@Override
	public Activite saveActivite(Activite activite) {
		
		return activiteRepository.save(activite);
	}

	@Override
	public Activite getActiviteById(long id) {
		Optional<Activite> optional = activiteRepository.findById(id);
		Activite activite = null;
		if (optional.isPresent()) {
			activite = optional.get();
		} else {
			throw new RuntimeException(" Activite not found for id :: " + id);
		}
		return activite;
	}

	@Override
	public void deleteActiviteById(long id) {
		
		this.activiteRepository.deleteById(id);
	}

	@Override
	public Activite updateActivite(Activite activite, long id) {
		
		Activite existingActivite = activiteRepository.findById(id).get();
		existingActivite.setTitre(activite.getTitre());
		existingActivite.setDescriptif(activite.getDescriptif());
		existingActivite.setType(activite.getType());
		existingActivite.setDate_debut(activite.getDate_debut());
		existingActivite.setDate_fin(activite.getDate_fin());
		existingActivite.setEtat(activite.getEtat());
		
		activiteRepository.save(existingActivite);
		return existingActivite;
	}

}
