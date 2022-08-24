package com.brief.app.service;

import java.util.List;

import com.brief.app.model.*;

public interface UsersService {
	
	Users saveUsers(Users user);
	List<Users> getAllUsers();
	Users getUsersById(long id);
	Users updateUsers(Users user, long id);
	void deleteUsers(long id);
	
}
