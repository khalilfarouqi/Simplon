package com.brief.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brief.app.entity.*;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long>  {

}
