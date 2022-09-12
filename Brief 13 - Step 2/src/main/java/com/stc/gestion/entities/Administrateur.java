package com.stc.gestion.entities;

import java.util.Collection;

import javax.persistence.Entity;
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
@Table(name="admins")
public class Administrateur extends AppUser {
	
	private String etat;

	public Administrateur(Long ID_User, String nom, String prenom, String username, String password, String email,
			String telephone, Collection<AppRole> appRoles, String etat) {
		super(ID_User, nom, prenom, username, password, email, telephone, appRoles);
		this.etat = etat;
	}
	
}
