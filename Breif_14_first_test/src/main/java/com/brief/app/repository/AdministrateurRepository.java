package com.brief.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brief.app.entity.Administrateur;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
