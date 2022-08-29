package com.app.service;

import java.util.List;

import com.app.entity.Administrateur;

public interface AdministrateurService {
	
	List<Administrateur> getAllAdmins();

	Administrateur saveAdmin(Administrateur admin);
	
	Administrateur getAdminById(long id);
	
	Administrateur updateAdministrateur(Administrateur administrateur, long id);

	void deleteAdminById(long id);

}
