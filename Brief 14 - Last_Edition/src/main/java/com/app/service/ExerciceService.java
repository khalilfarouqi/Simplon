package com.app.service;

import java.util.List;

import com.app.entity.Exercice;

public interface ExerciceService {
	
	List<Exercice> getAllExercices();

	Exercice saveExercice(Exercice exercice);

	Exercice getExerciceById(long id);
	
	Exercice updateExercice(Exercice exercice, long id);

	void deleteExerciceById(long id);

}
