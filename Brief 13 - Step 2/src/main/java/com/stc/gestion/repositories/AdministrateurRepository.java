package com.stc.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stc.gestion.entities.Administrateur;

public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
