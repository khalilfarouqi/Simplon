package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Administrateur")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrateur extends Users {

	private static final long serialVersionUID = 1L;

	@Column(name = "Etat")
	private String Etat;
	
}
