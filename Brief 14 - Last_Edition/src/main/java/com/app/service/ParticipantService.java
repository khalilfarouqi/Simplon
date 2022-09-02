package com.app.service;

import java.util.List;

import com.app.entity.Participant;

public interface ParticipantService {
	
	List<Participant> getAllParticipants();

	Participant saveParticipant(Participant participant);

	Participant getParticipantById(long id);
	
	Participant updateParticipant(Participant participant, long id);

	void deleteParticipantById(long id);

}
