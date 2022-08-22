package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

public class ResponsableServiceImpl implements Service<Responsable> {
	
	@Autowired
	private ResponsableRepository responsableRepo;
	
	@Override
	public Responsable lister_One(long id) {
		Responsable responsable = null;
		try {
			Optional<Responsable> optional = responsableRepo.findById(id);
			if (optional.isPresent()) {
				responsable = optional.get();
			} else {
				throw new RuntimeException("Responsable not found for id :: " + id);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return responsable;
	}

	@Override
	public List<Responsable> lister_Tous() {
		List<Responsable> responsable = null;
		try {
			responsable = responsableRepo.findAll();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return responsable;
	}

	@Override
	public void Save(Responsable t) {
		try {
			responsableRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Update(Responsable t) {
		try {
			//!!!!!!!!!!
			responsableRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Delete(long id) {
		try {
			responsableRepo.deleteById(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}