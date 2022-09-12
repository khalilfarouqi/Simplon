package com.stc.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stc.gestion.entities.Activite;

public interface ActiviteRepository extends JpaRepository<Activite, Long> {

}
