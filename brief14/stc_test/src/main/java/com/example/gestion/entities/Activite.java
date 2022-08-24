package com.example.gestion.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activite {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID_Activ;
	private String titre;
	private String descriptif;
	private String type;
	@Temporal(TemporalType.DATE)
	private Date date_debut;
	@Temporal(TemporalType.DATE)
	private Date date_fin;
	private String etat;
	
	@ManyToOne
    @JoinColumn(name="ID_User", nullable=false)
    private Responsable responsable;
	
	@ManyToOne
    @JoinColumn(name="ID_Exe", nullable=false)
    private Exercice exercice;
	
	@ManyToMany
	@JoinTable(name = "activite_participant", joinColumns = @JoinColumn(name = "ID_Activ"), inverseJoinColumns = @JoinColumn(name = "ID_User"))
	private List<Participant> participants = new ArrayList<>();
	
}
