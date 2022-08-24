package com.brief.app.service;

import java.util.List;

import com.brief.app.model.Role;

public interface RoleService {
	
	Role saveRole(Role role);
	List<Role> getAllRole();
	Role getRoleById(long id);
	Role updateRole(Role role, long id);
	void deleteRole(long id);
	
}
