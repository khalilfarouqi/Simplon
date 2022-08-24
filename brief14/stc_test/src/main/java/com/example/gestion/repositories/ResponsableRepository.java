package com.example.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestion.entities.Responsable;


@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

}
