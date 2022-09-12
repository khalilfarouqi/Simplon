package com.app.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "Nom")
	private String Nom;
	
	@ManyToMany(mappedBy = "role")
	private List<User> user;
	
}
