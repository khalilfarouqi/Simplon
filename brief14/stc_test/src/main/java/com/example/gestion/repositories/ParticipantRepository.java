package com.example.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entities.Participant;


@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
