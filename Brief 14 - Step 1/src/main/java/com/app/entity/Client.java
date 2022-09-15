package com.app.entity;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Clients")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User {
	
	@Column(name = "CIN")
	private String CIN;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name = "Prenom")
	private String Prenom;
	
	@Column(name = "Adresse")
	private String Adresse;
	
	@Column(name = "Ville")
	private String Ville;
	
	@Column(name = "Tel")
	private String Tel;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DateNai")
	private Date DateNai;
	
//	@OneToMany(mappedBy = "produit")
//	private List<Commande> commande;
	
}
