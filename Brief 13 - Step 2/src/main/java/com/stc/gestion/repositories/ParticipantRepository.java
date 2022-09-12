package com.stc.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stc.gestion.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
