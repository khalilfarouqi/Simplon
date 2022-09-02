package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.*;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
