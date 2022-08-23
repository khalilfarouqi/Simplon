package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

@Service
public class ParticipantServiceImpl implements IService<Participant> {
	
	@Autowired
	private ParticipantRepository participantRepo;
	
	public ParticipantServiceImpl(ParticipantRepository participantRepo) {
		super();
		this.participantRepo = participantRepo;
	}

	@Override
	public Participant lister_One(long id) {
		return participantRepo.findById(id).get();
	}

	@Override
	public List<Participant> lister_Tous() {
		return participantRepo.findAll();
	}

	@Override
	public Participant Save(Participant t) {
		return participantRepo.save(t);
	}

	@Override
	public Participant Update(Participant t) {
		return participantRepo.save(t);
	}

	@Override
	public void Delete(long id) {
		participantRepo.deleteById(id);
	}

}