package implimentation_DAO;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.*;

public class Implimentation_Admin implements IDAO <Admin> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Admin admin) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Admin admin) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        Admin user = (Admin) session.get(Admin.class, admin.getId());
        session.delete(user);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void modifier(Admin admin) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.update(admin);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_Tous(Admin admin) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        admin = (Admin) session.get(Admin.class, admin.getId());
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_One(Admin admin) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        admin = (Admin) session.get(Admin.class, admin.getId());
        session.getTransaction().commit();
		session.close();
	}

}
