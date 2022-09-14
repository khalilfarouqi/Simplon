package com.app.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.app.entity.*;
import com.app.sevice.impli.*;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/User") 
public class UserController {

	private ServiceCategoryImpli serviceCategory;
	private ServiceClientImpli serviceClient;
	private ServiceCommandeImpli serviceCommande;
	private ServiceProduitImpli serviceProduit;
	public UserController(ServiceCategoryImpli serviceCategoryImpli, ServiceClientImpli serviceClientImpli,
			ServiceCommandeImpli serviceCommandeImpli, ServiceProduitImpli serviceProduitImpli) {
		super();
		this.serviceCategory = serviceCategoryImpli;
		this.serviceClient = serviceClientImpli;
		this.serviceCommande = serviceCommandeImpli;
		this.serviceProduit = serviceProduitImpli;
	}
	
//	----------------------Categorie----------------------
	@GetMapping("/ListCategories")
	public List<Categorie> getAllCategories(){
		return serviceCategory.getAll();
	}//*
	
	@PostMapping("/SaveCategorie")
	public ResponseEntity<Categorie> saveCategorie(@RequestBody Categorie categorie){
		return new ResponseEntity<Categorie>(serviceCategory.save(categorie), HttpStatus.CREATED);
	}
	
	@GetMapping("/GetCategorie/{id}")
	public ResponseEntity<Categorie> getCategorieById(@PathVariable("id") Long ID){
		return new ResponseEntity<Categorie>(serviceCategory.getById(ID), HttpStatus.OK);
	}//*
	
	@PutMapping("/UpdateCategorie/{id}")
	public ResponseEntity<Categorie> updateCategorie(@PathVariable("id") Long ID,@RequestBody Categorie categorie){
		return new ResponseEntity<Categorie>(serviceCategory.update(categorie, ID), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteCategorie/{id}")
	public ResponseEntity<String> deleteCategorieById(@PathVariable("id") Long id){
		serviceCategory.deleteById(id);
		
		return new ResponseEntity<String>("Categories deleted successfully!.", HttpStatus.OK);
	}
	
//	----------------------Client----------------------
	@GetMapping("/ListClients")
	public List<Client> getAllClients(){
		return serviceClient.getAll();
	}//*
	
	@PostMapping("/SaveClient")
	public ResponseEntity<Client> saveClient(@RequestBody Client client){
		return new ResponseEntity<Client>(serviceClient.save(client), HttpStatus.CREATED);
	}
	
	@GetMapping("/GetClient/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable("id") Long ID){
		return new ResponseEntity<Client>(serviceClient.getById(ID), HttpStatus.OK);
	}//*
	
	@PutMapping("/UpdateClient/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable("id") Long ID,@RequestBody Client client){
		return new ResponseEntity<Client>(serviceClient.update(client, ID), HttpStatus.OK);
	}
	
	@DeleteMapping("/DeleteClient/{id}")
	public ResponseEntity<String> deleteClientById(@PathVariable("id") Long id){
		serviceClient.deleteById(id);
		
		return new ResponseEntity<String>("Client deleted successfully!.", HttpStatus.OK);
	}
	
//	----------------------Commande----------------------
	@GetMapping("/ListCommandes")
	public List<Commande> getAllCommandes(){
		return serviceCommande.getAll();
	}//*
	
	@PostMapping("/SaveCommande")
	public ResponseEntity<Commande> saveCommande(@RequestBody Commande commande){
		return new ResponseEntity<Commande>(serviceCommande.save(commande), HttpStatus.CREATED);
	}
	
	@GetMapping("/GetCommande/{id}")
	public ResponseEntity<Commande> getCommandeById(@PathVariable("id") Long ID){
		return new ResponseEntity<Commande>(serviceCommande.getById(ID), HttpStatus.OK);
	}//*
	
	@PutMapping("/UpdateCommande/{id}")
	public ResponseEntity<Commande> updateCommande(@PathVariable("id") Long ID,@RequestBody Commande commande){
		return new ResponseEntity<Commande>(serviceCommande.update(commande, ID), HttpStatus.OK);
	}
	
	@DeleteMapping("/DeleteCommande/{id}")
	public ResponseEntity<String> deleteCommandeById(@PathVariable("id") Long id){
		serviceCommande.deleteById(id);
		
		return new ResponseEntity<String>("Commande deleted successfully!.", HttpStatus.OK);
	}
	
//	----------------------Produit----------------------
	@GetMapping("/ListProduits")
	public List<Produit> getAllProduits(){
		return serviceProduit.getAll();
	}//*
	
	@PostMapping("/SaveProduit")
	public ResponseEntity<Produit> saveProduit(@RequestBody Produit produit){
		return new ResponseEntity<Produit>(serviceProduit.save(produit), HttpStatus.CREATED);
	}
	
	@GetMapping("/GetProduit/{id}")
	public ResponseEntity<Produit> getProduitById(@PathVariable("id") Long ID){
		return new ResponseEntity<Produit>(serviceProduit.getById(ID), HttpStatus.OK);
	}//*
	
	@PutMapping("/UpdateProduit/{id}")
	public ResponseEntity<Produit> updateProduit(@PathVariable("id") Long ID,@RequestBody Produit produit){
		return new ResponseEntity<Produit>(serviceProduit.update(produit, ID), HttpStatus.OK);
	}
	
	@DeleteMapping("/DeleteProduit/{id}")
	public ResponseEntity<String> deleteProduitById(@PathVariable("id") Long id){
		serviceProduit.deleteById(id);
		
		return new ResponseEntity<String>("Produit deleted successfully!.", HttpStatus.OK);
	}
	
}
