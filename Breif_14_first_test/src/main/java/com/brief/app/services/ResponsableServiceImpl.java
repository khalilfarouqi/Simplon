package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

@Service
public class ResponsableServiceImpl implements IService<Responsable> {
	
	@Autowired
	private ResponsableRepository responsableRepo;
	
	public ResponsableServiceImpl(ResponsableRepository responsableRepo) {
		super();
		this.responsableRepo = responsableRepo;
	}
	
	@Override
	public Responsable lister_One(long id) {
		return responsableRepo.findById(id).get();
	}

	@Override
	public List<Responsable> lister_Tous() {
		return responsableRepo.findAll();
	}

	@Override
	public Responsable Save(Responsable t) {
		return responsableRepo.save(t);
	}

	@Override
	public Responsable Update(Responsable t) {
		return responsableRepo.save(t);
	}

	@Override
	public void Delete(long id) {
		responsableRepo.deleteById(id);
	}

}