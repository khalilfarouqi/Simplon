package com.brief.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

@Service
public class ActiviteServiceImpl implements IService<Activite> {
	
	@Autowired
	private ActiviteRepository activiteRepo;
	
	public ActiviteServiceImpl(ActiviteRepository activiteRepo) {
		super();
		this.activiteRepo = activiteRepo;
	}
	
	@Override
	public Activite lister_One(long id) {
		return activiteRepo.findById(id).get();
	}

	@Override
	public List<Activite> lister_Tous() {
		return activiteRepo.findAll();
	}

	@Override
	public Activite Save(Activite t) {
		return activiteRepo.save(t);
	}

	@Override
	public Activite Update(Activite t) {
		return activiteRepo.save(t);
	}

	@Override
	public void Delete(long id) {
		activiteRepo.deleteById(id);
	}

}
