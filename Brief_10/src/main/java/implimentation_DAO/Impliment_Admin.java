package implimentation_DAO;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import dao.*;
import models.*;

public class Impliment_Admin implements IDAO<Administrateur> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@Override
	public void ajouter(Administrateur admin) {
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Administrateur admin) {
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        Administrateur user = (Administrateur) session.get(Administrateur.class, admin.getID());
        session.delete(user);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void modifier(Administrateur admin) {
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.update(admin);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_Tous(Administrateur admin) {
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        admin = (Administrateur) session.get(Administrateur.class, admin.getID());
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_One(Administrateur admin) {
        Session session = sessionFactory.openSession();	
        session.beginTransaction();
        admin = (Administrateur) session.get(Administrateur.class, admin.getID());
        session.getTransaction().commit();
		session.close();
	}

}
