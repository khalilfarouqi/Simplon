package com.app.sevice.impli;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.*;
import com.app.exeption.ResourceNotFoundException;
import com.app.repository.ProduitRepository;
import com.app.sevice.IService;

@Service
public class ServiceProduitImpli implements IService<Produit> {
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit save(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public Produit getById(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get();
	}

	@Override
	public Produit update(Produit produit, Long id) {
		// TODO Auto-generated method stub
		Produit existingProduit = produitRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("produitRepository", "Id", id));
		
		existingProduit.setCode(produit.getCode());
		existingProduit.setNom(produit.getNom());
		existingProduit.setCompany(produit.getCompany());
		existingProduit.setPrix(produit.getPrix());
		existingProduit.setDateExp(produit.getDateExp());
		existingProduit.setCategorie(produit.getCategorie());
//		existingProduit.setCommande(produit.getCommande());

		produitRepository.save(existingProduit);

		return existingProduit;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.produitRepository.deleteById(id);
	}

}
