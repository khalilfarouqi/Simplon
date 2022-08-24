package com.brief.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "Nom")
	private String Nom;
	
	@OneToMany(mappedBy = "role")
	private List<Users> users;

	
	
}
