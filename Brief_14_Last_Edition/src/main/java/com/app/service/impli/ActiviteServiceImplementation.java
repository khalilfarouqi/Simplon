package com.app.service.impli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.*;
import com.app.exception.ResourceNotFoundException;
import com.app.service.*;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ActiviteServiceImplementation implements ActiviteService{
	
	private com.app.repository.ActiviteRepository activiteRepository;

	@Override
	public List<Activite> getAllActivites() {
		// TODO Auto-generated method stub
		return activiteRepository.findAll();
	}

	@Override
	public Activite saveActivite(Activite activite) {
		// TODO Auto-generated method stub
		return this.activiteRepository.save(activite);
	}

	@Override
	public Activite getActiviteById(long id) {
		
//		Optional<Activite> activite = activiteRepository.findById(id);
//		if(activite.isPresent()) {
//			return activite.get();
//		}else {
//			throw new ResourceNotFoundException("Activite", "Id", id);
//		}
		
		return activiteRepository.findById(id).get();
	}

	@Override
	public Activite updateActivite(Activite activite, long id) {
		Activite existingActivite = activiteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("activiteRepository", "Id", id));

		
		existingActivite.setTitre(activite.getTitre());
		existingActivite.setDescriptif(activite.getDescriptif());
		existingActivite.setType(activite.getType());
		existingActivite.setDateDebut(activite.getDateDebut());
		existingActivite.setDateFin(activite.getDateFin());
		existingActivite.setEtat(activite.getEtat());

		activiteRepository.save(existingActivite);

		return existingActivite;
	}

	@Override
	public void deleteActiviteById(long id) {
		// TODO Auto-generated method stub
		this.activiteRepository.deleteById(id);
	}

}
