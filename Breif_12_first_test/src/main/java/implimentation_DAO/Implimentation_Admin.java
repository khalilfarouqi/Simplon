package implimentation_DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.Admin;

public class Implimentation_Admin implements IDAO <Admin> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_Tous(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_One(Admin admin) {
		// TODO Auto-generated method stub
		
	}

}
