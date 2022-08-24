package com.brief.app.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.brief.app.exception.ResourceNotFoundException;
import com.brief.app.model.Role;
import com.brief.app.repository.RoleRepository;
import com.brief.app.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	private RoleRepository roleRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public List<Role> getAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Role getRoleById(long id) {
		Optional<Role> role = roleRepository.findById(id);
		if(role.isPresent()) {
			return role.get();
		}else {
			throw new ResourceNotFoundException("Role", "Id", id);
		}
		//return roleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Role", "Id", id));
	}

	@Override
	public Role updateRole(Role role, long id) {
		// we need to check whether employee with given id is exist in DB or not
		Role existingEmployee = roleRepository.findById(id).orElseThrow(
						() -> new ResourceNotFoundException("Role", "Id", id)); 
				
		existingEmployee.setNom(role.getNom());
		// save existing employee to DB
		roleRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteRole(long id) {
		// check whether a employee exist in a DB or not
		roleRepository.findById(id).orElseThrow(() -> 
										new ResourceNotFoundException("Employee", "Id", id));
		roleRepository.deleteById(id);
	}

}
