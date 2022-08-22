package com.brief.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

public class ActiviteServiceImpl implements Service<Activite> {
	
	@Autowired
	private ActiviteRepository activiteRepo;
	
	@Override
	public Activite lister_One(long id) {
		Activite activite = null;
		try {
			Optional<Activite> optional = activiteRepo.findById(id);
			if (optional.isPresent()) {
				activite = optional.get();
			} else {
				throw new RuntimeException("Activite not found for id :: " + id);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return activite;
	}

	@Override
	public List<Activite> lister_Tous() {
		List<Activite> activite = null;
		try {
			activite = activiteRepo.findAll();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return activite;
	}

	@Override
	public void Save(Activite t) {
		try {
			activiteRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Update(Activite t) {
		try {
			//!!!!!!!!!!
			activiteRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Delete(long id) {
		try {
			activiteRepo.deleteById(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
