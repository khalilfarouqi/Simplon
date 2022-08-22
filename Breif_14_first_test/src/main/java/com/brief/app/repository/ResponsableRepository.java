package com.brief.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brief.app.entity.*;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long> {

}
