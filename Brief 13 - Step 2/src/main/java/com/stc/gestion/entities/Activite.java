package com.stc.gestion.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="activites")
public class Activite {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ID_Activ;
	private String titre;
	private String descriptif;
	private String type;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date date_debut;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date date_fin;
	private String etat;
	
	@ManyToOne(targetEntity = Responsable.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_User", insertable = false, updatable = false)
//    @JsonIgnore
    private Responsable responsable;
    @Column(name = "ID_User")
    private Integer responsableId;
	
//	@ManyToOne(targetEntity = Responsable.class, fetch = FetchType.LAZY)
//    @JoinColumn(name="ID_User")   
//    private Responsable responsable;
    
    @ManyToOne(targetEntity = Exercice.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Exe", insertable = false, updatable = false)
//    @JsonIgnore
    private Exercice exercice;
    @Column(name = "ID_Exe")
    private Integer exerciceId;
	
//	@ManyToOne
//    @JoinColumn(name="ID_Exe")
//    private Exercice exercice;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "activite_participant", joinColumns = @JoinColumn(name = "ID_Activ"), inverseJoinColumns = @JoinColumn(name = "ID_User"))
	private List<Participant> participants = new ArrayList<>();
	
}
