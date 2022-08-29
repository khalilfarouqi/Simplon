package com.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "Nom")
	private String Nom;

	@Column(name = "Prenom")
	private String Prenom;

	@Column(name = "Login")
	private String Login;

	@Column(name = "Password")
	private String Password;

	@Column(name = "Email")
	private String Email;

	@Column(name = "Telephone")
	private String Telephone;
	
	@ManyToOne
	@JoinColumn(name = "ID_Role")
	private Role role;

	public Users(String nom, String prenom, String login, String password, String email, String telephone, Role role) {
		super();
		Nom = nom;
		Prenom = prenom;
		Login = login;
		Password = password;
		Email = email;
		Telephone = telephone;
		this.role = role;
	}
	
	
	
}
