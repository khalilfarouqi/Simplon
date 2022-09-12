package com.app.entity;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Produits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "Code")
	private Long Code;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name = "Company")
	private String Company;
	
	@Column(name = "Prix")
	private Double Prix;
	
	@Column(name = "DateExp")
	private Date DateExp;
	
	@ManyToOne
	@JoinColumn(name = "ID_Categorie")
	private Categorie categorie;
	
	@OneToMany(mappedBy = "client")
	private List<Commande> commande;
}
