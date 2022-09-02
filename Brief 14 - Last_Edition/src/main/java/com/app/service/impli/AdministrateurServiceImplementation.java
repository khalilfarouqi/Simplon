package com.app.service.impli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.*;
import com.app.exception.*;
import com.app.repository.*;
import com.app.service.*;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdministrateurServiceImplementation implements AdministrateurService{
	
	private AdministrateurRepository administrateurRepository;
	
	@Override
	public List<Administrateur> getAllAdmins() {
		// TODO Auto-generated method stub
		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur saveAdmin(Administrateur admin) {
		// TODO Auto-generated method stub
		return this.administrateurRepository.save(admin);
	}

	@Override
	public Administrateur getAdminById(long id) {
		
//		Optional<Administrateur> administrateur = administrateurRepository.findById(id);
//		if(administrateur.isPresent()) {
//			return administrateur.get();
//		}else {
//			throw new ResourceNotFoundException("Administrateur", "Id", id);
//		}
		
		return administrateurRepository.findById(id).get();
	}

	@Override
	public Administrateur updateAdministrateur(Administrateur administrateur, long id) {
		Administrateur existingAdministrateur = administrateurRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("administrateurRepository", "Id", id));

		
		existingAdministrateur.setNom(administrateur.getNom());
		existingAdministrateur.setPrenom(administrateur.getPrenom());
		existingAdministrateur.setLogin(administrateur.getLogin());
		existingAdministrateur.setPassword(administrateur.getPassword());
		existingAdministrateur.setEmail(administrateur.getEmail());
		existingAdministrateur.setTelephone(administrateur.getTelephone());
		existingAdministrateur.setEtat(administrateur.getEtat());

		administrateurRepository.save(existingAdministrateur);

		return existingAdministrateur;
	}

	@Override
	public void deleteAdminById(long id) {
		// TODO Auto-generated method stub
		this.administrateurRepository.deleteById(id);
	}


}
