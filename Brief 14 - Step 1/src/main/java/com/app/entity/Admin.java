package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Admins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends User {
	
	@Column(name = "NomCompet")
	private String NomCompet;
	
}
