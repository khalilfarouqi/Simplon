package com.app.sevice.impli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Commande;
import com.app.exeption.ResourceNotFoundException;
import com.app.repository.CommandeRepository;
import com.app.sevice.IService;

@Service
public class ServiceCommandeImpli implements IService<Commande> {
	
	private CommandeRepository commandeRepository;

	@Override
	public List<Commande> getAll() {
		// TODO Auto-generated method stub
		return commandeRepository.findAll();
	}

	@Override
	public Commande save(Commande commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}

	@Override
	public Commande getById(Long id) {
		// TODO Auto-generated method stub
		return commandeRepository.findById(id).get();
	}

	@Override
	public Commande update(Commande commande, Long id) {
		// TODO Auto-generated method stub
		Commande existingCommande = commandeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("commandeRepository", "Id", id));
		
		existingCommande.setDateCom(commande.getDateCom());
		existingCommande.setMontant(commande.getMontant());
		existingCommande.setValidation(commande.getValidation());
		existingCommande.setProduit(commande.getProduit());
//		existingCommande.setClient(commande.getClient());

		commandeRepository.save(existingCommande);

		return existingCommande;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.commandeRepository.deleteById(id);
	}

}
