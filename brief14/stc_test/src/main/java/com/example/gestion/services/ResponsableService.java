package com.example.gestion.services;

import java.util.List;

import com.example.gestion.entities.Responsable;

public interface ResponsableService {

	List<Responsable> getAllResponsables();

	Responsable saveResponsable(Responsable responsable);

	Responsable getResponsableById(long id);
	
	Responsable updateResponsable(Responsable responsable, long id);

	void deleteResponsableById(long id);
}
