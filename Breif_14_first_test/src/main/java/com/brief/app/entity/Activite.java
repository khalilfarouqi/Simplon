package com.brief.app.entity;

import java.io.*;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Activite")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activite implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "Titre")
	private String Titre;
	
	@Column(name = "Descriptif")
	private String Descriptif;

	@Column(name = "type")
	private String type;

	@Column(name = "DateDebut")
	private Date DateDebut;

	@Column(name = "DateFin")
	private Date DateFin;

	@Column(name = "Etat")
	private String Etat;
	
	//ID_User Participant ManytoMany
	
	@ManyToOne
	@JoinColumn(name = "ID_Exer")
	private Exercice exer;

	@ManyToOne
	@JoinColumn(name = "ID_User_res")
	private Responsable respo;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			  name = "participant_activite", 
			  joinColumns = @JoinColumn(name = "ID_Participant"), 
			  inverseJoinColumns = @JoinColumn(name = "ID_Activite"))
	private List<Participant> partticipant;
	

}
