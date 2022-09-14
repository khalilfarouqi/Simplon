package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
