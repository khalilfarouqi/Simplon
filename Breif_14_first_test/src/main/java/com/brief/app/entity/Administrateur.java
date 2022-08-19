package com.brief.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@DiscriminatorValue(value = "Administrateur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrateur extends Users {

	private static final long serialVersionUID = 1L;

	@Column(name = "Etat")
	private String Etat;
	
}
