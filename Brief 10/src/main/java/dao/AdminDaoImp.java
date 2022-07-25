package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import implimentation_DAO.IDAO;
import model.Admin;
import model.Employe;

public class AdminDaoImp implements IDAO<Admin> {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public List<Admin> listElemts() {
		    return null;
	}

	@Override
	public void addElemts(Admin e) {                                     
		// work !!!!!
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateElemts(Admin e) {         
		// work !!!!
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void deleteElemts(long id) {   
		
	}

	

	@Override
	public Admin getElemts(long id) {
		     return null;
	}

}
