package com.app.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "Type")
	private String Type;
	
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produit;

}
