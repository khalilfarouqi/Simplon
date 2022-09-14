package com.app.sevice.impli;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.*;
import com.app.exeption.ResourceNotFoundException;
import com.app.repository.ClientRepository;
import com.app.sevice.IService;

@Service
public class ServiceClientImpli implements IService<Client> {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Client save(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public Client getById(Long id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id).get();
	}

	@Override
	public Client update(Client client, Long id) {
		// TODO Auto-generated method stub
		Client existingClient = clientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("clientRepository", "Id", id));
		
//		existingClient.setAdresse(client.getAdresse());
//		existingClient.setCIN(client.getCIN());
//		existingClient.setDateNai(client.getDateNai());
//		existingClient.setEmail(client.getEmail());
//		existingClient.setNom(client.getNom());
//		existingClient.setPassword(client.getPassword());
//		existingClient.setPrenom(client.getPrenom());
//		existingClient.setRole(client.getRole());
//		existingClient.setTel(client.getTel());
//		existingClient.setVille(client.getVille());

		clientRepository.save(existingClient);

		return existingClient;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.clientRepository.deleteById(id);
	}

}
