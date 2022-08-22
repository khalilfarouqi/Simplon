package com.brief.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brief.app.entity.Activite;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {

}
