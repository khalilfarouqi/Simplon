package com.rest.brief.project.stc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.brief.project.stc.exeption.Exeption;
import com.rest.brief.project.stc.model.Exercice;
import com.rest.brief.project.stc.repository.ExerciceRepository;
@Service 
public class ExerciceService {
	 @Autowired
	    private ExerciceRepository exerciceRepository;

	    public Optional<Exercice> getExercice(final Long id) {
	        return exerciceRepository.findById(id);
	    }

	    public Iterable<Exercice> getExercice() {
	        return exerciceRepository.findAll();
	    }

	    public void deleteExercice(final Long id) {
	    	exerciceRepository.deleteById(id);
	    }

	    public Exercice savesaveExercice(Exercice exercice) {
	    	Exercice savedExercice = exerciceRepository.save(exercice);
	        return savedExercice;
	    }
	    public  List<Exercice> getAllExercice(){
	    	return exerciceRepository.findAll();
	      }

		public Exercice updateExercice(Exercice exercice, Long id) {
			
			Exercice existingExercice = exerciceRepository.findById(id)
					.orElseThrow(() -> new Exeption("Exercice", "Id", id));

			existingExercice.setDateDebut(exercice.getDateDebut());
			existingExercice.setDateFin(exercice.getDateFin());
			existingExercice.setStatut(exercice.getStatut());
			

			exerciceRepository.save(existingExercice);

			return existingExercice;
			
		}

		

}
