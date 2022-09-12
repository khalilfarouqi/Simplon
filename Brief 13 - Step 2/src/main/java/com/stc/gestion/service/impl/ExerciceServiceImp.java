package com.stc.gestion.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stc.gestion.entities.Exercice;
import com.stc.gestion.exception.ResourceNotFoundException;
import com.stc.gestion.repositories.ExerciceRepository;
import com.stc.gestion.service.StcService;

@Service
@Component
public class ExerciceServiceImp implements StcService<Exercice, Long> {
	
	private ExerciceRepository exerciceRepository;
	
	public ExerciceServiceImp(ExerciceRepository exerciceRepository) {
		super();
		this.exerciceRepository = exerciceRepository;
	}

	
	@Override
	public List<Exercice> getAll() {
		
		return exerciceRepository.findAll();
	}

	@Override
	public Exercice save(Exercice exercice) {
		
		return exerciceRepository.save(exercice);
	}

	@Override
	public Exercice getById(long id) {

		return exerciceRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Exercice", "Id", id));
	}

	@Override
	public Exercice update(Exercice exercice, long id) {
		
		Exercice existingExercice = exerciceRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Exercice", "Id", id));
        
        
        existingExercice.setAnnee(exercice.getAnnee());
        existingExercice.setDate_debut(exercice.getDate_debut());
        existingExercice.setDate_fin(exercice.getDate_fin());
        existingExercice.setStatut(exercice.getStatut());
        
        exerciceRepository.save(existingExercice);
		return existingExercice;
	}

	@Override
	public void delete(long id) {
		
		exerciceRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Exercice", "Id", id));
		
		exerciceRepository.deleteById(id);
	}

}
