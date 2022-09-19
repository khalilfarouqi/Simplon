package com.app.sevice.impli;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.entity.*;
import com.app.entity.User;
import com.app.repository.UserRepository;
import com.app.sevice.IService;


@Service
public class ServiceUserImpl implements IService<User> {
	
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public ServiceUserImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User save(User user) {
//		User user = new User(registrationDto.getFirstName(), 
//				registrationDto.getLastName(),
//				registrationDto.getEmail(),
//				passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(Role.CLIENT));
//		
//		return userRepository.save(user);
		return null;
	}
	
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = userRepository.FindByEmail(username);
//		if(user == null) {
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRole()));		
//	}
	
//	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Role roles){
//		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
//	}
	
	//_____________________________________________________________________________________

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
