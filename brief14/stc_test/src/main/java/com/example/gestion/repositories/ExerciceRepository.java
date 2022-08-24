package com.example.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entities.Exercice;

@Repository
public interface ExerciceRepository extends JpaRepository<Exercice, Long> {

}
