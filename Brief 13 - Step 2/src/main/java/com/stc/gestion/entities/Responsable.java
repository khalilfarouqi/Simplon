package com.stc.gestion.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="responsables")
public class Responsable extends AppUser {
	
	private String domaine;
	private String type;
	private String etat;

	@OneToMany(mappedBy="responsable")
//	@JsonIgnore
    private Collection<Activite> activities;

	public Responsable(Long ID_User, String nom, String prenom, String username, String password, String email,
			String telephone, Collection<AppRole> appRoles, String domaine, String type, String etat,
			Collection<Activite> activities) {
		super(ID_User, nom, prenom, username, password, email, telephone, appRoles);
		this.domaine = domaine;
		this.type = type;
		this.etat = etat;
		this.activities = activities;
	}
}
