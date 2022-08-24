package com.example.gestion.entities;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("RESPONSABLE")
public class Responsable extends Users {
	
	private static final long serialVersionUID = 1L;
	
	private String domaine;
	private String type;
	private String etat;

	@OneToMany(mappedBy="responsable")
    private Set<Activite> activities;
}
