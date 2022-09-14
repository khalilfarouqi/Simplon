package com.app.sevice.impli;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Categorie;
import com.app.exeption.ResourceNotFoundException;
import com.app.repository.CategorieRepository;
import com.app.sevice.IService;

@Service
public class ServiceCategoryImpli implements IService<Categorie> {
	
	private CategorieRepository categoryRepository;

	@Override
	public List<Categorie> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Categorie save(Categorie categorie) {
		// TODO Auto-generated method stub
		return categoryRepository.save(categorie);
	}

	@Override
	public Categorie getById(Long id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	@Override
	public Categorie update(Categorie categorie, Long id) {
		// TODO Auto-generated method stub
		Categorie existingCategorie = categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("categorieRepository", "Id", id));
		
		existingCategorie.setType(categorie.getType());
//		existingCategorie.setProduit(categorie.getProduit());

		categoryRepository.save(existingCategorie);

		return existingCategorie;
	}

	@Override
	public void deleteById(Long id) {
		this.categoryRepository.deleteById(id);
		
	}

}
