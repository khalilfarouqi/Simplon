package com.brief.app.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.brief.app.entity.*;
import com.brief.app.repository.*;

public class ParticipantServiceImpl implements Service<Participant> {
	
	@Autowired
	private ParticipantRepository participantRepo;

	@Override
	public Participant lister_One(long id) {
		Participant participant = null;
		try {
			Optional<Participant> optional = participantRepo.findById(id);
			if (optional.isPresent()) {
				participant = optional.get();
			} else {
				throw new RuntimeException("Participant not found for id :: " + id);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return participant;
	}

	@Override
	public List<Participant> lister_Tous() {
		List<Participant> participant = null;
		try {
			participant = participantRepo.findAll();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return participant;
	}

	@Override
	public void Save(Participant t) {
		try {
			participantRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Update(Participant t) {
		try {
			//!!!!!!!!!!
			participantRepo.save(t);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void Delete(long id) {
		try {
			participantRepo.deleteById(id);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}