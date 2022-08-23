package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.brief.app.entity.Administrateur;
import com.brief.app.repository.AdministrateurRepository;

import org.springframework.stereotype.*;

@Service
public class AdminServiceImpl implements IService<Administrateur> {
	
	@Autowired
	private AdministrateurRepository adminRepo;
	
	public AdminServiceImpl(AdministrateurRepository adminRepo) {
		super();
		this.adminRepo = adminRepo;
	}

	@Override
	public Administrateur lister_One(long id) {
		return adminRepo.findById(id).get();
	}

	@Override
	public List<Administrateur> lister_Tous() {
		return adminRepo.findAll();
	}

	@Override
	public Administrateur Save(Administrateur t) {
		return adminRepo.save(t);
	}

	@Override
	public Administrateur Update(Administrateur t) {
		return adminRepo.save(t);
	}

	@Override
	public void Delete(long id) {
		adminRepo.deleteById(id);
	}

}
