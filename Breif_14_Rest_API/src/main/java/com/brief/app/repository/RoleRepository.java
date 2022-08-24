package com.brief.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brief.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
