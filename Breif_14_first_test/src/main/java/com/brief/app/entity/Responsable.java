package com.brief.app.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Responsable")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Responsable extends Users {

	private static final long serialVersionUID = 1L;

	@Column(name = "Domaine")
	private String Domaine;

	@Column(name = "Type")
	private String Type;

	@Column(name = "Etat")
	private String Etat;
	
	@OneToMany(mappedBy = "responsable")
	private List<Activite> activit;
}
