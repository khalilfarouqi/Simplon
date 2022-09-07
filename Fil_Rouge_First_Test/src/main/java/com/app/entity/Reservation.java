package com.app.entity;

import java.sql.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Reservations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "DateDebut")
	private Date DateDebut;
	
	@Column(name = "DateFin")
	private Date DateFin;
	
	@Column(name = "JourReservation")
	private Date JourReservation;
	
	@Column(name = "PrixTotal")
	private Double PrixTotal;
	
	@ManyToOne
	@JoinColumn(name = "ID_Client")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "ID_Car")
	private Car car;

}
