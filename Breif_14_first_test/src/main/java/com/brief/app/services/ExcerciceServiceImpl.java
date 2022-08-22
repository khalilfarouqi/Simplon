package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

public class ExcerciceServiceImpl implements Service<Exercice> {
	
	@Autowired
	private ExerciceRepository exerciceRepo;

	@Override
	public Exercice lister_One(long id) {
		Exercice exercice = null;
		try {
			Optional<Exercice> optional = exerciceRepo.findById(id);
			if (optional.isPresent()) {
				exercice = optional.get();
			} else {
				throw new RuntimeException("Exercice not found for id :: " + id);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return exercice;
	}

	@Override
	public List<Exercice> lister_Tous() {
		List<Exercice> exercice = null;
		try {
			exercice = exerciceRepo.findAll();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return exercice;
	}

	@Override
	public void Save(Exercice t) {
		try {
			exerciceRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Update(Exercice t) {
		try {
			//!!!!!!!!!!
			exerciceRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Delete(long id) {
		try {
			exerciceRepo.deleteById(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
