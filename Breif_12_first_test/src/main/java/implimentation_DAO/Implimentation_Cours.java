package implimentation_DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.*;

public class Implimentation_Cours implements IDAO <Cours>{

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Cours cours) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(cours);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Cours cours) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        Cours user = (Cours) session.get(Cours.class, cours.getId());
        session.delete(user);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void modifier(Cours cours) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.update(cours);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_Tous(Cours cours) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        cours = (Cours) session.get(Cours.class, cours.getId());
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_One(Cours cours) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        cours = (Cours) session.get(Cours.class, cours.getId());
        session.getTransaction().commit();
		session.close();
	}

}
