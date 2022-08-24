package com.example.gestion.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("PARTICIPANT")
public class Participant extends Users {

	private static final long serialVersionUID = 1L;
	
	private String domaine;
	private String structure;
	
	@ManyToMany(mappedBy="participants")
	private List<Activite> activities = new ArrayList<>();
}
