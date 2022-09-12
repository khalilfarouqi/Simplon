package com.stc.gestion.service.impl;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.stc.gestion.entities.AppRole;
import com.stc.gestion.entities.AppUser;
import com.stc.gestion.repositories.AppRoleRepository;
import com.stc.gestion.repositories.AppUserRepository;
import com.stc.gestion.service.AccountService;

@Service
@Component 
public class AccountServiceImpl implements AccountService {
	
	private AppRoleRepository appRoleRepository;
	private AppUserRepository appUserRepository;
	private PasswordEncoder  passwordEncoder;
	
	public AccountServiceImpl(AppRoleRepository appRoleRepository, AppUserRepository appUserRepository,PasswordEncoder  passwordEncoder) {
		this.appRoleRepository = appRoleRepository;
		this.appUserRepository = appUserRepository;
		this.passwordEncoder=passwordEncoder;
	}

	@Override
	public AppRole addNewRole(AppRole appRole) {
		
		return appRoleRepository.save(appRole);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		
		AppUser appUser = appUserRepository.findByUsername(username);
		AppRole appRole = appRoleRepository.findByRoleName(roleName);
		appUser.getAppRoles().add(appRole);
		appUserRepository.save(appUser);
	}

	@Override
	public AppUser loadUserByUsername(String username) {
		
		return appUserRepository.findByUsername(username);
	}

	@Override
	public List<AppUser> listUsers() {
		
		return appUserRepository.findAll();
	}

	@Override
	public AppUser addNewUser(AppUser appUser) {
	
		String pw = appUser.getPassword();
		appUser.setPassword(passwordEncoder.encode(pw));
		return appUserRepository.save(appUser);
	}

}
