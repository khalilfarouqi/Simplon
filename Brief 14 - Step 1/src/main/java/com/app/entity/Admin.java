package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Admin")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends User {
	
	@Column(name = "NomCompet")
	private String NomCompet;
	
}
