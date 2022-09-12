package com.app.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Commandes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
	
	@Id
	private Long ID;
	
	@ManyToOne
    @JoinColumn(name = "ID_Produit")
    private Produit produit;
    
    @ManyToOne
    @JoinColumn(name = "ID_Client")
    private Client client;
    
    @Column(name = "DateCom")
    private Date DateCom;

    @Column(name = "Montant")
    private Double Montant;
    
    @Column(name = "Validation")
    private Boolean Validation;

}
