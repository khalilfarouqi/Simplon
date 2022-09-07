package com.app.entity;

import java.util.Collection;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Users")
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "FullName")
	private String FullName;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Password")
	private String Password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
					name = "role_id", referencedColumnName = "id"))
	private Collection<Role> roles;

}
