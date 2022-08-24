package com.example.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entities.Activite;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {

}
