package com.rest.brief.project.stc.model;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@DiscriminatorValue("Participant")
@EqualsAndHashCode(callSuper = true)
public class Participant extends Utilisateur{
	@Column(name = "domaine")
    private String domaine;

    @Column(name = "structure")
    private String structure;
    
    @JsonIgnore
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Participant_Activite", 
        joinColumns = { @JoinColumn(name = "Id") }, 
        inverseJoinColumns = { @JoinColumn(name = "activite_Id") }
    )
    Set<Activite> activites = new HashSet<>();
}