package dao;

import models.Admin;

public interface IDAO {

	public void ajouter(Admin admin);
	
	public void supprimer(Admin admin);
	
	public void modifier(Admin admin);
	
	public void lister_Tous(Admin admin);
	
	public void lister_One(Admin admin);
}
