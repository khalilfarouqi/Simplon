package com.brief.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brief.app.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
