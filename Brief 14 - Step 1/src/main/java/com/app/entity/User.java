package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Users")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Password")
	private String Password;
	
	@Column(name = "Role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
	
}
