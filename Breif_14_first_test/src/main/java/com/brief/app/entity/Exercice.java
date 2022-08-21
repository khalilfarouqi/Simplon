package com.brief.app.entity;

import java.io.*;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Exercice")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exercice implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "Annee")
	private int Annee;

	@Column(name = "DateDebut")
	private Date DateDebut;

	@Column(name = "DateFin")
	private Date DateFin;

	@Column(name = "Statut")
	private String Statut;
	
	@OneToMany(mappedBy = "exercice")
	private List<Activite> activit;
	
}
