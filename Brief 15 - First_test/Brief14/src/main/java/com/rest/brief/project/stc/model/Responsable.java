package com.rest.brief.project.stc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@DiscriminatorValue("Responsable")
@EqualsAndHashCode(callSuper = true)
public class Responsable extends Utilisateur {
	
	
	
	@Column(name = "domaine")
    private String domaine;

    @Column(name = "type")
    private String type;

    @Column(name = "etat")
    private String etat;
    
//    @OneToMany(cascade = CascadeType.ALL,
//            mappedBy = "responsable")
// private List<Activite> activite;
    @OneToMany(mappedBy = "responsable",cascade = CascadeType.ALL)
	private Set<Activite> activite;
    
    
    
}