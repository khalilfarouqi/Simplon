package com.rest.brief.project.stc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.brief.project.stc.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
