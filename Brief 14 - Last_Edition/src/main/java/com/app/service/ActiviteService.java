package com.app.service;

import java.util.List;

import com.app.entity.Activite;

public interface ActiviteService {
	
	List<Activite> getAllActivites();

	Activite saveActivite(Activite activite);

	Activite getActiviteById(long id);
	
	Activite updateActivite(Activite activite, long id);

	void deleteActiviteById(long id);

}
