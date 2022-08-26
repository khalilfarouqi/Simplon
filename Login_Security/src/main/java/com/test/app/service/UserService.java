package com.test.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.test.app.entity.User;
import com.test.app.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
