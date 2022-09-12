package com.stc.gestion.controllers;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stc.gestion.JWTUtil;
import com.stc.gestion.entities.Activite;
import com.stc.gestion.entities.Administrateur;
import com.stc.gestion.entities.AppRole;
import com.stc.gestion.entities.AppUser;
import com.stc.gestion.entities.Exercice;
import com.stc.gestion.entities.Participant;
import com.stc.gestion.entities.Responsable;
import com.stc.gestion.service.AccountService;
import com.stc.gestion.service.StcService;

import lombok.Data;

@RestController
public class AccountRestControllers {
	
	private StcService<Activite, Long> activiteService;
	private StcService<Exercice, Long> exerciceService;
	private StcService<Administrateur, Long> adminService;
	private StcService<Responsable, Long> responsableService;
	private StcService<Participant, Long> participantService;
	private AccountService accountService;
	
	public AccountRestControllers(StcService<Activite, Long> activite, StcService<Exercice, Long> exercice,
			StcService<Administrateur, Long> admin, StcService<Responsable, Long> responsable,
			StcService<Participant, Long> participant, AccountService accountService) {
		this.activiteService = activite;
		this.exerciceService = exercice;
		this.adminService = admin;
		this.responsableService = responsable;
		this.participantService = participant;
		this.accountService = accountService;
	}
	
	@GetMapping(path = "/users")
	@PostAuthorize("hasAuthority('ADMIN')")
	public List<AppUser> getAllUsers(){
		
		return accountService.listUsers();
	}

	@PostMapping(path = "/roles")
	@PostAuthorize("hasAuthority('ADMIN')")
	public AppRole saveRole(@RequestBody AppRole appRole) {
		
		return accountService.addNewRole(appRole);
	}
	
	@PostMapping(path = "/addRoleToUser")
	@PostAuthorize("hasAuthority('ADMIN')")
	public void addRoleToUser(@RequestBody RoleUserForm roleUserForm ) {
		
		accountService.addRoleToUser(roleUserForm.getUsername(),roleUserForm.getRoleName());
	}
	
	@PostMapping(path = "/activites")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public ResponseEntity<Activite> saveActivite(@RequestBody Activite activite){
		return new ResponseEntity<Activite>(activiteService.save(activite), HttpStatus.CREATED);
	}
	
	@GetMapping(path="/activities")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE','PARTICIPANT')")
	public List<Activite> getAllActivites(){
		
		return activiteService.getAll();
	}
		
	@GetMapping(path="/activities/{ID_Activ}")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE','PARTICIPANT')")
	public ResponseEntity<Activite> getActiviteById(@PathVariable("ID_Activ") long id){
		return new ResponseEntity<Activite>(activiteService.getById(id), HttpStatus.OK);
	}
	
	@PutMapping(path="/activities/{ID_Activ}")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public ResponseEntity<Activite> updateActivite(@PathVariable("ID_Activ") long id ,@RequestBody Activite activite){
		return new ResponseEntity<Activite>(activiteService.update(activite, id), HttpStatus.OK);
	}
	
	@DeleteMapping(path="/activities/{ID_Activ}")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public ResponseEntity<String> deleteActivite(@PathVariable("ID_Activ") long id){
		activiteService.delete(id);
			
		return new ResponseEntity<String>("Activite deleted successfully!.", HttpStatus.OK);
	}
	
	@PostMapping(path="/admins")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Administrateur> saveAdministrateur(@RequestBody Administrateur administrateur) {

		return new ResponseEntity<Administrateur>(adminService.save(administrateur), HttpStatus.CREATED);
	}
	
	@GetMapping(path="/admins")
	@PostAuthorize("hasAuthority('ADMIN')")
	public List<Administrateur> getAllAdmins() {
		return adminService.getAll();
	}
	
	@GetMapping(path="/admins/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Administrateur> getAdminById(@PathVariable("ID_User") long adminId) {
		return new ResponseEntity<Administrateur>(adminService.getById(adminId), HttpStatus.OK);
	}
	
	@PutMapping("/admins/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Administrateur> updateAdmin(@PathVariable("ID_User") long id,
			@RequestBody Administrateur administrateur) {
		return new ResponseEntity<Administrateur>(adminService.update(administrateur, id),
				HttpStatus.OK);
	}
	
	@DeleteMapping(path="/admins/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<String> deleteAdmin(@PathVariable("ID_User") long id) {

		// delete admin from DB
		adminService.delete(id);
		return new ResponseEntity<String>("Admin deleted successfully!.", HttpStatus.OK);
	}
	
	@PostMapping(path = "/exercices")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Exercice> saveExercice(@RequestBody Exercice exercice){
		return new ResponseEntity<Exercice>(exerciceService.save(exercice), HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/exercices")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public List<Exercice> getAllExercices(){
		return exerciceService.getAll();
	}
	
	@GetMapping(path="/exercices/{ID_Exe}")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public ResponseEntity<Exercice> getExerciceById(@PathVariable("ID_Exe") long id){
		return new ResponseEntity<Exercice>(exerciceService.getById(id), HttpStatus.OK);
	}
	
	@PutMapping(path="/exercices/{ID_Exe}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Exercice> updateExercice(@PathVariable("ID_Exe") long id ,@RequestBody Exercice exercice){
		return new ResponseEntity<Exercice>(exerciceService.update(exercice, id), HttpStatus.OK);
	}
	
	@DeleteMapping(path="/exercices/{ID_Exe}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<String> deleteExercice(@PathVariable("ID_Exe") long id){
		
		exerciceService.delete(id);
		return new ResponseEntity<String>("Exercice deleted successfully!.", HttpStatus.OK);
	}
	
	@PostMapping(path="/participants")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Participant> saveParticipant(@RequestBody Participant participant) {

		return new ResponseEntity<Participant>(participantService.save(participant), HttpStatus.CREATED);
	}
	
	@GetMapping(path="/participants")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public List<Participant> getAllParticipants() {
		return participantService.getAll();
	}
	
	@GetMapping(path="/participants/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN','RESPONSABLE')")
	public ResponseEntity<Participant> getParticipantById(@PathVariable("ID_User") long id) {
		return new ResponseEntity<Participant>(participantService.getById(id), HttpStatus.OK);
	}
	
	@PutMapping(path="/participants/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Participant> updateParticipant(@PathVariable("ID_User") long id,
			@RequestBody Participant participant) {
		return new ResponseEntity<Participant>(participantService.update(participant, id),HttpStatus.OK);
	}
	
	@DeleteMapping(path="/participants/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<String> deleteParticipant(@PathVariable("ID_User") long id) {

		participantService.delete(id);
		return new ResponseEntity<String>("Participant deleted successfully!.", HttpStatus.OK);
	}
	
	@PostMapping(path = "/responsables")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Responsable> saveResponsable(@RequestBody Responsable responsable) {

		return new ResponseEntity<Responsable>(responsableService.save(responsable), HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/responsables")
	@PostAuthorize("hasAuthority('ADMIN')")
	public List<Responsable> getResponsables() {
		return responsableService.getAll();
	}
	
	@GetMapping(path = "/responsables/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Responsable> getResponsableById(@PathVariable("ID_User") long id) {
		return new ResponseEntity<Responsable>(responsableService.getById(id), HttpStatus.OK);
	}
	
	
	@PutMapping(path = "/responsables/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<Responsable> updateResponsable(@PathVariable("ID_User") long id,
			@RequestBody Responsable responsable) {
		return new ResponseEntity<Responsable>(responsableService.update(responsable, id),HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/responsables/{ID_User}")
	@PostAuthorize("hasAuthority('ADMIN')")
	public ResponseEntity<String> deleteResponsable(@PathVariable("ID_User") long id) {

		responsableService.delete(id);
		return new ResponseEntity<String>("Responsable deleted successfully!.", HttpStatus.OK);
	}
	
	@GetMapping(path = "/refreshToken")
	public void refreshToken(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String authToken = request.getHeader(JWTUtil.HEADER);
		if(authToken!=null && authToken.startsWith(JWTUtil.PREFIX)) {
			
			try {
				
				String refreshToken = authToken.substring(JWTUtil.PREFIX.length());
				Algorithm algorithm = Algorithm.HMAC256(JWTUtil.SECRET);
				JWTVerifier jwtVerifier = JWT.require(algorithm).build();
				DecodedJWT decodedJWT = jwtVerifier.verify(refreshToken);
				String username = decodedJWT.getSubject();
				AppUser appUser = accountService.loadUserByUsername(username);
				String jwtAccessToken = JWT.create()
						.withSubject(appUser.getUsername())
						.withExpiresAt(new Date(System.currentTimeMillis()+JWTUtil.EXPIRE_ACCESS_TOKEN))
						.withIssuer(request.getRequestURI().toString())
						.withClaim("roles", appUser.getAppRoles().stream().map(r->r.getRoleName()).collect(Collectors.toList()))
						.sign(algorithm);
				 
				Map<String,String> idToken = new HashMap<>();
				idToken.put("access-token", jwtAccessToken);
				idToken.put("refresh-token", refreshToken);
				response.setContentType("application/json");
				new ObjectMapper().writeValue(response.getOutputStream(), idToken);
				
			} catch (Exception e) {
//				response.setHeader("error-message", e.getMessage());
//				response.sendError(HttpServletResponse.SC_FORBIDDEN);
				throw e;
			}
		}else {
			throw new RuntimeException("Refresh Token required!!");
		}
	}
}

@Data
class RoleUserForm {
	private String username;
	private String roleName;
}