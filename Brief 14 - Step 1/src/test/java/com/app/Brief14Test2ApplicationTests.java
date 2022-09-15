package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.entity.*;
import com.app.sevice.impli.*;

@SpringBootTest
class Brief14Test2ApplicationTests {
	
	@Autowired
	ServiceCommandeImpli serviceCommandeImpli;
	@Autowired
	ServiceClientImpli ClientImpli;
	@Autowired
	ServiceProduitImpli ProduitImpli;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void Test1 () {
		
		Commande commande = new Commande();
		
		commande.setID((long) 2);
		commande.setValidation(true);
		commande.setMontant(1200.00);
		commande.setClient(ClientImpli.getById((long) 3));
		commande.setProduit(ProduitImpli.getById((long) 1));
		
		serviceCommandeImpli.save(commande);
		
	}

}
