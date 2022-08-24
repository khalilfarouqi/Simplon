package com.example.gestion.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gestion.entities.Responsable;
import com.example.gestion.repositories.ResponsableRepository;
import com.example.gestion.services.ResponsableService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResponsableServiceImp implements ResponsableService {

	private ResponsableRepository responsableRepository;
	
	@Override
	public List<Responsable> getAllResponsables() {
		
		return responsableRepository.findAll();
	}

	@Override
	public Responsable saveResponsable(Responsable responsable) {
		
		return responsableRepository.save(responsable);
	}

	@Override
	public Responsable getResponsableById(long id) {
		Optional<Responsable> optional = responsableRepository.findById(id);
		Responsable responsable = null;
		if (optional.isPresent()) {
			responsable = optional.get();
		} else {
			throw new RuntimeException(" Responsable not found for id :: " + id);
		}
		return responsable;
	}

	@Override
	public void deleteResponsableById(long id) {
		
		this.responsableRepository.deleteById(id);
	}

	@Override
	public Responsable updateResponsable(Responsable responsable, long id) {
		
		Responsable existingResponsable = responsableRepository.findById(id).get();
		existingResponsable.setNom(responsable.getNom());
		existingResponsable.setPrenom(responsable.getPrenom());
		existingResponsable.setEmail(responsable.getEmail());
		existingResponsable.setLogin(responsable.getLogin());
		existingResponsable.setPassword(responsable.getPassword());
		existingResponsable.setTelephone(responsable.getTelephone());
		existingResponsable.setEtat(responsable.getEtat());
		existingResponsable.setDomaine(responsable.getDomaine());
		existingResponsable.setType(responsable.getType());
		responsableRepository.save(existingResponsable);
		return existingResponsable;
	}

}
