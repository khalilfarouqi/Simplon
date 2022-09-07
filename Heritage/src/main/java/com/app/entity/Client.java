package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Clients")
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User {
	
	@Column(name = "PhoneNumber")
	private String PhoneNumber;
	
	@Column(name = "City")
	private String City;
	
	@Column(name = "CIN")
	private String CIN;
	
	@Column(name = "Licence")
	private String Licence;
	
	@Column(name = "Age")
	private int Age;
	
	@Column(name = "Sexe")
	private String Sexe;

}
