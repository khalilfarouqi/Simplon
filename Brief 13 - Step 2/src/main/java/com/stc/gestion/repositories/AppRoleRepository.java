package com.stc.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stc.gestion.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
	
	AppRole findByRoleName(String roleName);

}
