package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

@Service
public class ExcerciceServiceImpl implements IService<Exercice> {
	
	@Autowired
	private ExerciceRepository exerciceRepo;
	
	public ExcerciceServiceImpl(ExerciceRepository exerciceRepo) {
		super();
		this.exerciceRepo = exerciceRepo;
	}

	@Override
	public Exercice lister_One(long id) {
		return exerciceRepo.findById(id).get();
	}

	@Override
	public List<Exercice> lister_Tous() {
		return exerciceRepo.findAll();
	}

	@Override
	public Exercice Save(Exercice t) {
		return exerciceRepo.save(t);
	}

	@Override
	public Exercice Update(Exercice t) {
		return exerciceRepo.save(t);
	}

	@Override
	public void Delete(long id) {
		exerciceRepo.deleteById(id);
	}

}
