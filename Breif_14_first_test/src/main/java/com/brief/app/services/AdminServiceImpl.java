package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.brief.app.entity.Administrateur;
import com.brief.app.repository.AdministrateurRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdminServiceImpl implements Service<Administrateur> {
	
	@Autowired
	private AdministrateurRepository adminRepo;

	@Override
	public Administrateur lister_One(long id) {
		Administrateur admin = null;
		try {
			Optional<Administrateur> optional = adminRepo.findById(id);
			if (optional.isPresent()) {
				admin = optional.get();
			} else {
				throw new RuntimeException("Admin not found for id :: " + id);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return admin;
	}

	@Override
	public List<Administrateur> lister_Tous() {
		List<Administrateur> admin = null;
		try {
			admin = adminRepo.findAll();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return admin;
	}

	@Override
	public void Save(Administrateur t) {
		try {
			adminRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Update(Administrateur t) {
		try {
			//!!!!!!!!!!
			adminRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Delete(long id) {
		try {
			adminRepo.deleteById(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
