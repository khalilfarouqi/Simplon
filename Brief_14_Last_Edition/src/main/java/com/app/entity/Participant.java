package com.app.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Participant")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Participant extends Users {

	private static final long serialVersionUID = 1L;

	@Column(name = "Domaine")
	private String Domaine;

	@Column(name = "Structure")
	private String Structure;
	
	@ManyToMany(mappedBy = "participant", fetch = FetchType.EAGER)
	private List<Activite> activite;
	
}