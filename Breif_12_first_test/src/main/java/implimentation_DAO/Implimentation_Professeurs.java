package implimentation_DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.Professeurs;

public class Implimentation_Professeurs implements IDAO<Professeurs> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Professeurs prof) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Professeurs prof) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Professeurs prof) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_Tous(Professeurs prof) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_One(Professeurs prof) {
		// TODO Auto-generated method stub
		
	}

}
