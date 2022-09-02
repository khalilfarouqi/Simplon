package com.rest.brief.project.stc.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Activite {
	@Id
    @Column(name = "activite_Id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activite_Id;

    @Column(name = "DateDebut")
    private Date DateDebut;

    @Column(name = "DateFin")
    private Date DateFin;

    @Column(name = "titre")
    private String titre;

    @Column(name = "descriptif")
    private String descriptif;

    @Column(name = "type")
    private String type;

    @Column(name = "etat")
    private String etat;
    
    
    @ManyToOne(targetEntity = Responsable.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "responsable_Id", insertable = false, updatable = false)
    @JsonIgnore
	private Responsable responsable;

    @Column(name = "responsable_Id")
    private Integer responsableId;
    
    @ManyToOne(targetEntity = Exercice.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "Exercice_Id", insertable = false, updatable = false)
    @JsonIgnore
	private Exercice exercice;
    
    @Column(name = "Exercice_Id")
    private Integer exerciceId;
    
    @ManyToMany(mappedBy = "activites")
    private Set<Participant> participant = new HashSet<>();

	public Long getActivite_Id() {
		return activite_Id;
	}

	public void setActivite_Id(Long activite_Id) {
		this.activite_Id = activite_Id;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	

	public Exercice getExercice() {
		return exercice;
	}

	public void setExercice(Exercice exercice) {
		this.exercice = exercice;
	}

	public Set<Participant> getParticipant() {
		return participant;
	}

	public void setParticipant(Set<Participant> participant) {
		this.participant = participant;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Integer getResponsableId() {
		return responsableId;
	}

	public void setResponsableId(Integer responsableId) {
	      this.responsableId = responsableId;
  }

	public Integer getExerciceId() {
		return exerciceId;
	}

	public void setExerciceId(Integer exerciceId) {
		this.exerciceId = exerciceId;
	}


    
    
}