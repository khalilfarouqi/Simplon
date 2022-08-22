package com.brief.app.services;

import java.util.List;

import com.brief.app.entity.Administrateur;
import com.brief.app.repository.AdministrateurRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AdminServiceImpl implements Service<Administrateur> {
	
	private AdministrateurRepository adminRepo;

	@Override
	public Administrateur lister_One(long id) {
		return null;
	}

	@Override
	public List<Administrateur> lister_Toust() {
		return null;
	}

	@Override
	public void Save(Administrateur t) {
		
	}

	@Override
	public void Update(Administrateur t) {
		
	}

	@Override
	public void Delete(Administrateur t) {
		
	}

}
