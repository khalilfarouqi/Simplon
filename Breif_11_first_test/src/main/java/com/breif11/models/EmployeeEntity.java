package com.breif11.models;

import java.io.Serializable;
import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity implements Serializable {
	
	@Id()
	@GeneratedValue
	private Integer ID;
	
	@Column(nullable = false)
	private String Nom;
	@Column(nullable = false)
	private String Prenom;
	
	@Column(name = "Tel")
	private String Telephone;
	
	@Column(nullable = false)
	private String Post;
	@Column(nullable = false)
	private Double Salaire;
	@Column(nullable = false)
	private Boolean Admin;
	
	@Column(name = "Contrat")
	private String Type_Contrat;
	
}
