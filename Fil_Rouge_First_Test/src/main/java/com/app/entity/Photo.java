package com.app.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Photos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "Photo1")
	private String Photo1;
	
	@Column(name = "Photo2")
	private String Photo2;
	
	@Column(name = "Photo3")
	private String Photo3;

	@OneToOne(mappedBy = "photo")
	private Car car;
	
}
