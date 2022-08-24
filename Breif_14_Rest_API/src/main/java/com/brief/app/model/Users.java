package com.brief.app.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
}
