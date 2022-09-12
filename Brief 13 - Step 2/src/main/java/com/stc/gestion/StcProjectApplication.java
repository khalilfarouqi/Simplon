package com.stc.gestion;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.stc.gestion.entities.Administrateur;
import com.stc.gestion.entities.AppRole;
import com.stc.gestion.entities.AppUser;
import com.stc.gestion.service.AccountService;
import com.stc.gestion.service.StcService;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class StcProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StcProjectApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	CommandLineRunner start(AccountService accountService, StcService<Administrateur, Long> adminService) {
		
		return args -> {
			accountService.addNewRole(new AppRole(null,"ADMIN"));
			accountService.addNewRole(new AppRole(null,"RESPONSABLE"));
			accountService.addNewRole(new AppRole(null,"PARTICIPANT"));
			
			
//			accountService.addNewUser(new AppUser(null,"elhabti","fatiha","Lily","12345","fatiha@gmail.com","1234566",new ArrayList<>()));
			
			
			adminService.save(new Administrateur(null,"EL HABTI","Fatiha","Red","12345","elhabtifatiha08@gmail.com","+21267584936",new ArrayList<>(),"active"));

//			
//			accountService.addRoleToUser("Lily", "ADMIN");
//			accountService.addRoleToUser("Lily", "USER");
			accountService.addRoleToUser("Red", "ADMIN");
//			accountService.addRoleToUser("Sunshine", "USER");
//			accountService.addRoleToUser("Princess", "COSTUMOR_MANAGER");
//			accountService.addRoleToUser("Ryle", "PRODUCT_MANAGER");
//			accountService.addRoleToUser("Joshy", "ADMIN");
//			accountService.addRoleToUser("Alex", "BILLS_MANAGER");
//			accountService.addRoleToUser("Alex", "PRODUCT_MANAGER");
		};
	}

}
