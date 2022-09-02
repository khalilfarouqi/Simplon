package com.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.app.entity.*;
import com.app.web.dto.*;

public interface UserService extends UserDetailsService {
	Users save(UserRegistrationDto registrationDto);
}
