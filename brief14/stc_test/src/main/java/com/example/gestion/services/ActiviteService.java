package com.example.gestion.services;

import java.util.List;

import com.example.gestion.entities.Activite;

public interface ActiviteService {

	List<Activite> getAllActivites();

	Activite saveActivite(Activite activite);

	Activite getActiviteById(long id);
	
	Activite updateActivite(Activite activite, long id);

	void deleteActiviteById(long id);
}
