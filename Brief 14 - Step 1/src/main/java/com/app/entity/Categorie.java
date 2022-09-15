package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "ID")
public class Categorie {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "Type")
	private String Type;
	
//	@OneToMany(mappedBy = "categorie")
//	private List<Produit> produit;

}
