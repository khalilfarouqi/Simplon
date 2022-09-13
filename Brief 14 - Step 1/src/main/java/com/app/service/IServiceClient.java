package com.app.service;

import java.util.List;

import com.app.entity.*;

public interface IServiceClient {
	
	//Login
	//sign_in
	
	Categorie getCategorieById(long id);
	
	List<Categorie> getAllCategories();
	
	Produit getProduitById(long id);
	
	List<Produit> getAllProduits();
	
	Commande saveCommande(Commande commande);
	
	Commande updateCommande(Commande commande, long id);
	
	void deleteCommandeById(long id,Long id_Client);
	
}
