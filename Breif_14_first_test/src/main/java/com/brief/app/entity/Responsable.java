package com.brief.app.entity;

import javax.persistence.*;

@Entity
public class Responsable extends Users {

	private static final long serialVersionUID = 1L;

	@Column(name = "Domaine")
	private String Domaine;

	@Column(name = "Type")
	private String Type;

	@Column(name = "Etat")
	private String Etat;

}
