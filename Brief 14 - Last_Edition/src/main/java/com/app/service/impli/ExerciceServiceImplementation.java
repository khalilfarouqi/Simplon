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
public class ExerciceServiceImplementation implements ExerciceService {
	
	private ExerciceRepository exerciceRepository;
	
	@Override
	public List<Exercice> getAllExercices() {
		// TODO Auto-generated method stub
		return exerciceRepository.findAll();
	}

	@Override
	public Exercice saveExercice(Exercice exercice) {
		// TODO Auto-generated method stub
		return this.exerciceRepository.save(exercice);
	}

	@Override
	public Exercice getExerciceById(long id) {
		
//		Optional<Exercice> exercice = exerciceRepository.findById(id);
//		if(exercice.isPresent()) {
//			return exercice.get();
//		}else {
//			throw new ResourceNotFoundException("Exercice", "Id", id);
//		}
		
		// TODO Auto-generated method stub
		return exerciceRepository.findById(id).get();
	}

	@Override
	public Exercice updateExercice(Exercice exercice, long id) {
		Exercice existingExercice = exerciceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Exercice", "Id", id));

		existingExercice.setID(exercice.getID());
		existingExercice.setAnnee(exercice.getAnnee());
		existingExercice.setDateDebut(exercice.getDateDebut());
		existingExercice.setDateFin(exercice.getDateFin());
		existingExercice.setStatut(exercice.getStatut());
		

		exerciceRepository.save(existingExercice);

		return existingExercice;
	}

	@Override
	public void deleteExerciceById(long id) {
		// TODO Auto-generated method stub
		this.exerciceRepository.deleteById(id);
	}

}
