package com.app.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Brand")
	private String Brand;

	@Column(name = "Description")
	private String Description;

	@Column(name = "Prix")
	private Double Prix;

	@Column(name = "Power")
	private int Power;

	@Column(name = "Doors")
	private int Doors;

	@Column(name = "Fuel")
	private String Fuel;

	@Column(name = "FuelConsomation")
	private int FuelConsomation;

	@Column(name = "Color")
	private String Color;

	@Column(name = "Gearbox")
	private String Gearbox;

	@Column(name = "Bluetooth")
	private Boolean Bluetooth;

	@Column(name = "AirConditione")
	private Boolean AirConditione;

	@Column(name = "Seats")
	private int Seats;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Photo", referencedColumnName = "id")
	private Photo photo;
	
	@OneToMany(mappedBy = "car")
	private List<Reservation> reservation;

}
