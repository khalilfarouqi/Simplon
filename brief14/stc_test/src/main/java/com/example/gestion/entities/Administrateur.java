package com.example.gestion.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("ADMIN")
public class Administrateur extends Users {
	
	private static final long serialVersionUID = 1L;
	
	private String etat;

}
