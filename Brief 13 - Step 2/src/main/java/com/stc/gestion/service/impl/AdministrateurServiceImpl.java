package com.stc.gestion.service.impl;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stc.gestion.entities.Administrateur;
import com.stc.gestion.exception.ResourceNotFoundException;
import com.stc.gestion.repositories.AdministrateurRepository;
import com.stc.gestion.service.StcService;

@Service
@Component
public class AdministrateurServiceImpl implements StcService<Administrateur, Long> {
	
	private AdministrateurRepository administrateurRepository;
	private PasswordEncoder  passwordEncoder;
	
	public AdministrateurServiceImpl(AdministrateurRepository administrateurRepository,PasswordEncoder  passwordEncoder) {
		this.administrateurRepository = administrateurRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<Administrateur> getAll() {
		
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur save(Administrateur admin) {
		
		String pw = admin.getPassword();
		admin.setPassword(passwordEncoder.encode(pw));
		return administrateurRepository.save(admin);
	}

	@Override
	public Administrateur getById(long id) {
		
		return administrateurRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Administrateur", "Id", id));
	}

	@Override
	public Administrateur update(Administrateur administrateur, long id) {
		
		Administrateur existingAdministrateur = administrateurRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Administrateur", "Id", id));	
		
		
		
		existingAdministrateur.setNom(administrateur.getNom());
		existingAdministrateur.setPrenom(administrateur.getPrenom());
		existingAdministrateur.setEmail(administrateur.getEmail());
		existingAdministrateur.setUsername(administrateur.getUsername());
		existingAdministrateur.setPassword(administrateur.getPassword());
		existingAdministrateur.setTelephone(administrateur.getTelephone());
		existingAdministrateur.setEtat(administrateur.getEtat());
		// save existing employee to DB
		administrateurRepository.save(existingAdministrateur);
		return existingAdministrateur;
	}

	@Override
	public void delete(long id) {
		
		administrateurRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Admin", "Id", id));

		administrateurRepository.deleteById(id);
	}

}
