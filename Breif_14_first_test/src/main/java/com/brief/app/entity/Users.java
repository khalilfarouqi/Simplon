package com.brief.app.entity;

import java.io.Serializable;

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
	
}
