package com.rest.brief.project.stc.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.brief.project.stc.exeption.Exeption;
import com.rest.brief.project.stc.model.Activite;
import com.rest.brief.project.stc.repository.ActiviteRepository;

@Service
public class ActviteService {
	 @Autowired
	    private ActiviteRepository activiteRepository;

	    public Optional<Activite> getActivite(final Long id) {
	        return activiteRepository.findById(id);
	    }
	    
	    public Iterable<Activite> getActivite() {
	        return activiteRepository.findAll();
	    }
	    
	    public void deleteActivite(final Long id) {
	    	activiteRepository.deleteById(id);
	    }

	    public Activite saveActivite(Activite Activite) {
	    	Activite savedActivite = activiteRepository.save(Activite);
	        return savedActivite;
	    }
	    public List<Activite> getAllActivite(){
	        //return getAllActivite();
	       return activiteRepository.findAll();
	      }

	    public Activite updateActivite(Activite activite, long id) {
			Activite existingActivite = activiteRepository.findById(id)
					.orElseThrow(() -> new Exeption("activiteRepository", "Id", id));

			
			existingActivite.setTitre(activite.getTitre());
			existingActivite.setDescriptif(activite.getDescriptif());
			existingActivite.setType(activite.getType());
			existingActivite.setDateFin(activite.getDateDebut());
			existingActivite.setDateFin(activite.getDateFin());
			existingActivite.setEtat(activite.getEtat());
			existingActivite.setResponsableId(activite.getResponsableId());
			existingActivite.setExercice(activite.getExercice());

			activiteRepository.save(existingActivite);

			return existingActivite;
		}

}
