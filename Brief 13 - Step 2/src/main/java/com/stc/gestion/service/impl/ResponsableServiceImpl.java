package com.stc.gestion.service.impl;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stc.gestion.entities.Responsable;
import com.stc.gestion.exception.ResourceNotFoundException;
import com.stc.gestion.repositories.ResponsableRepository;
import com.stc.gestion.service.StcService;

@Service
@Component
public class ResponsableServiceImpl implements StcService<Responsable, Long> {
	
	private ResponsableRepository responsableRepository;
	private PasswordEncoder  passwordEncoder;
	
	public ResponsableServiceImpl(ResponsableRepository responsableRepository, PasswordEncoder passwordEncoder) {
		this.responsableRepository = responsableRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<Responsable> getAll() {
		
		return responsableRepository.findAll();
	}

	@Override
	public Responsable save(Responsable respo) {
		
		String pw = respo.getPassword();
		respo.setPassword(passwordEncoder.encode(pw));
		return responsableRepository.save(respo);
	}

	@Override
	public Responsable getById(long id) {
		
		return responsableRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Responsable", "Id", id));
	}

	@Override
	public Responsable update(Responsable responsable, long id) {
		

		Responsable existingResponsable = responsableRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Responsable", "Id", id));
		
		
		existingResponsable.setNom(responsable.getNom());
		existingResponsable.setPrenom(responsable.getPrenom());
		existingResponsable.setEmail(responsable.getEmail());
		existingResponsable.setUsername(responsable.getUsername());
		existingResponsable.setPassword(responsable.getPassword());
		existingResponsable.setTelephone(responsable.getTelephone());
		existingResponsable.setEtat(responsable.getEtat());
		existingResponsable.setDomaine(responsable.getDomaine());
		existingResponsable.setType(responsable.getType());
		responsableRepository.save(existingResponsable);
		return existingResponsable;
	}

	@Override
	public void delete(long id) {
		
		responsableRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Responsable", "Id", id));
		
		responsableRepository.deleteById(id);
	}

}
