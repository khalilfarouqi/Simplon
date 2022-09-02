package com.rest.brief.project.stc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rest.brief.project.stc.exeption.Exeption;
import com.rest.brief.project.stc.model.Administrateur;
import com.rest.brief.project.stc.repository.AdministrateurRepositiry;



@Service 
public class AdministateurService {
	 @Autowired
	    private AdministrateurRepositiry administrateurRepository;
	 
	 @Autowired
	    private PasswordEncoder passwordEncoder;

	    public Optional<Administrateur> getAdministrateur(final Long id) {
	        return administrateurRepository.findById(id);
	    }

	    public Iterable<Administrateur> getAdministrateur() {
	        return administrateurRepository.findAll();
	    }

	    public void deleteAdministrateur(final Long id) {
	    	administrateurRepository.deleteById(id);
	    }

	    public Administrateur saveAdministrateur(Administrateur Administrateur) {
	    	Administrateur savedAdministrateur;
			
            String password=passwordEncoder.encode(Administrateur.getPasword());
            Administrateur.setPasword(password);

            savedAdministrateur = administrateurRepository.save(Administrateur);
			
	        return savedAdministrateur;
	    }
	    public List<Administrateur> getAllAdministrateurs(){
	        return administrateurRepository.findAll();
	      }

	    public Administrateur updateAdministrateur(Administrateur administrateur, long id) {
			Administrateur existingAdministrateur = administrateurRepository.findById(id)
					.orElseThrow(() -> new Exeption("administrateurRepository", "Id", id));

			
			existingAdministrateur.setNom(administrateur.getNom());
			existingAdministrateur.setPrenom(administrateur.getPrenom());
			existingAdministrateur.setLogin(administrateur.getLogin());
			existingAdministrateur.setPasword(new BCryptPasswordEncoder().encode(administrateur.getPasword()));
			existingAdministrateur.setEmail(administrateur.getEmail());
			existingAdministrateur.setTelephone(administrateur.getTelephone());
			existingAdministrateur.setEtat(administrateur.getEtat());

			administrateurRepository.save(existingAdministrateur);

			return existingAdministrateur;
		}

		

}
