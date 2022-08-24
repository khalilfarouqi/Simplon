package com.example.gestion.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.gestion.entities.Administrateur;
import com.example.gestion.repositories.AdministrateurRepository;
import com.example.gestion.services.AdministrateurService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdministrateurServiceImp implements AdministrateurService {

	private AdministrateurRepository administrateurRepository;

	@Override
	public List<Administrateur> getAllAdmins() {

		return administrateurRepository.findAll();
	}

	@Override
	public Administrateur saveAdmin(Administrateur admin) {

		return administrateurRepository.save(admin);
	}

	@Override
	public Administrateur getAdminById(long id) {
		Optional<Administrateur> optional = administrateurRepository.findById(id);
		Administrateur admin = null;
		if (optional.isPresent()) {
			admin = optional.get();
		} else {
			throw new RuntimeException(" Admin not found for id :: " + id);
		}
		return admin;
	}

	@Override
	public void deleteAdminById(long id) {

		this.administrateurRepository.deleteById(id);
	}

	@Override
	public Administrateur updateAdministrateur(Administrateur administrateur, long id) {
		// we need to check whether admin with given id is exist in DB or not
		Administrateur existingAdministrateur = administrateurRepository.findById(id).get();
		existingAdministrateur.setNom(administrateur.getNom());
		existingAdministrateur.setPrenom(administrateur.getPrenom());
		existingAdministrateur.setEmail(administrateur.getEmail());
		existingAdministrateur.setLogin(administrateur.getLogin());
		existingAdministrateur.setPassword(administrateur.getPassword());
		existingAdministrateur.setTelephone(administrateur.getTelephone());
		existingAdministrateur.setEtat(administrateur.getEtat());
		// save existing employee to DB
		administrateurRepository.save(existingAdministrateur);
		return existingAdministrateur;
	}

}
