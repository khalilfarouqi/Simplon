package com.brief.app.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@DiscriminatorValue(value = "Participant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participant extends Users {

	private static final long serialVersionUID = 1L;

	@Column(name = "Domaine")
	private String Domaine;

	@Column(name = "Structure")
	private String Structure;
	
	@ManyToMany(/*mappedBy = "participant_activite",*/ fetch = FetchType.EAGER)
	private List<Activite> activite;
	
}