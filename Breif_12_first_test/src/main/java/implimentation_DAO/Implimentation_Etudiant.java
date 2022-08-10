package implimentation_DAO;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.Etudiant;

public class Implimentation_Etudiant implements IDAO<Etudiant> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_Tous(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lister_One(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

}
