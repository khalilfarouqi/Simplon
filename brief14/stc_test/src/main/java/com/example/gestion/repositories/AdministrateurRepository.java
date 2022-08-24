package com.example.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entities.Administrateur;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
