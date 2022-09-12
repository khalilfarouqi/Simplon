package com.app.entity;

import java.util.Collection;

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
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name = "ID_User", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "ID_Role", referencedColumnName = "id"))
	private Collection<Role> role;
	
}
