package implimentation_DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.Cours;

public class Implimentation_Cours implements IDAO <Cours>{

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Cours cours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Cours cours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Cours cours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_Tous(Cours cours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_One(Cours cours) {
		// TODO Auto-generated method stub
		
	}

}
