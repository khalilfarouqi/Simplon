package com.app.sevice.impli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Client;
import com.app.repository.ClientRepository;
import com.app.sevice.IService;

@Service
public class ServiceClientImpli implements IService<Client> {
	
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
	public Client update(Client t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.clientRepository.deleteById(id);
	}

}
