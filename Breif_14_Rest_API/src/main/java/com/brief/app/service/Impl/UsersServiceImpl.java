package com.brief.app.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.brief.app.exception.ResourceNotFoundException;
import com.brief.app.model.*;
import com.brief.app.repository.UsersRepository;
import com.brief.app.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	private UsersRepository usersRepo;
	
	public UsersServiceImpl(UsersRepository usersRepo) {
		super();
		this.usersRepo = usersRepo;
	}

	@Override
	public Users saveUsers(Users user) {
		return usersRepo.save(user);
	}

	@Override
	public List<Users> getAllUsers() {
		return usersRepo.findAll();
	}

	@Override
	public Users getUsersById(long id) {
		Optional<Users> user = usersRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}else {
			throw new ResourceNotFoundException("Users", "Id", id);
		}
	}

	@Override
	public Users updateUsers(Users user, long id) {
		// we need to check whether employee with given id is exist in DB or not
		Users existingUser = usersRepo.findById(id).orElseThrow(
								() -> new ResourceNotFoundException("Users", "Id", id)); 
						
		existingUser.setNom(user.getNom());
		existingUser.setEmail(user.getEmail());
		existingUser.setLogin(user.getLogin());
		existingUser.setPassword(user.getPassword());
		existingUser.setPrenom(user.getPrenom());
		existingUser.setTelephone(user.getTelephone());
		// save existing employee to DB
		usersRepo.save(existingUser);
		return existingUser;
	}

	@Override
	public void deleteUsers(long id) {
		// check whether a employee exist in a DB or not
		usersRepo.findById(id).orElseThrow(() -> 
												new ResourceNotFoundException("Users", "Id", id));
		usersRepo.deleteById(id);
	}

}
