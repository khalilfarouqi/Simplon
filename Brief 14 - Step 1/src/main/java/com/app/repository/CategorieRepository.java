package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
