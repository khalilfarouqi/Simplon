package com.app.web.dto;

import javax.persistence.Column;

public class UserRegistrationDto {
	
	private String Nom;
	private String Prenom;
	private String Login;
	private String Password;
	private String Email;
	private String Telephone;
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public UserRegistrationDto() {
		super();
	}
	public UserRegistrationDto(String nom, String prenom, String login, String password, String email,
			String telephone) {
		super();
		Nom = nom;
		Prenom = prenom;
		Login = login;
		Password = password;
		Email = email;
		Telephone = telephone;
	}
	
	

}
