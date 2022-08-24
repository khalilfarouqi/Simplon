package com.brief.app.model;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "Nom")
	private String Nom;
	
	@OneToMany(mappedBy = "role")
	private List<Users> users;
	
}
