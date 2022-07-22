package implimentation_DAO;

import models.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import dao.*;

public class Impliment_Employe implements IDAO<Employe> {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@Override
	public void ajouter(Employe employe) {
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(employe);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Employe employe) {
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        Employe user = (Employe) session.get(Employe.class, employe.getID());
        session.delete(user);
        session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void modifier(Employe employe) {
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.update(employe);
        session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void lister_Tous(Employe employe) {
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        employe = (Employe) session.get(Employe.class, employe.getID());
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_One(Employe employe) {
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        employe = (Employe) session.get(Employe.class, employe.getID());
        session.getTransaction().commit();
		session.close();
	}
	

}
