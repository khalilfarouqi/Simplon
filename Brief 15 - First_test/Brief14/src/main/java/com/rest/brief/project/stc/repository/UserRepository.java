package com.rest.brief.project.stc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rest.brief.project.stc.model.Utilisateur;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur,Long> {


		@Query("SELECT u FROM Utilisateur u WHERE u.login = :login")
	    public Utilisateur getUserByUsername(@Param("login") String login);	
}
