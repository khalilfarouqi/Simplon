package implimentation_DAO;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import connexion.HibernateUtil;
import dao.IDAO;
import models.*;

public class Implimentation_Admin implements IDAO <Admin> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Admin admin) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(admin);
            transaction.commit();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        };
	}

	@Override
	public void supprimer(long id) {
		 Transaction transaction = null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            transaction = session.beginTransaction();

	            Admin admin1 = (Admin) session.get(Admin.class, id);
	            if (admin1 != null) {
	                session.delete(admin1);
	                System.out.println("admin is deleted");
	            }

	            transaction.commit();
	        } catch (Exception e) {
            	System.out.println(e.getMessage());
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	}

	@Override
	public void modifier(Admin admin) {
		Transaction transaction = null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	        	transaction = session.beginTransaction();
	            session.update(admin);
	            transaction.commit();
	        } catch (Exception e) {
            	System.out.println(e.getMessage());
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	}

	@Override
	public List<Admin> lister_Tous() {
		Query query;
		List<Admin> admin = null;
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
       try {
    	   query = (Query) session.createQuery("from admin");
    	   admin = query.list();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           e.printStackTrace();
       }
       return admin;
	}

	@Override
	public Admin lister_One(long id) {
		Transaction transaction = null;
		Admin admin = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
       try {
           transaction = session.beginTransaction();
           admin = (Admin) session.get(Admin.class, id);
           transaction.commit();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return admin;
	}
	
	public Boolean checke(String username, String Password) {
		
		return false;
	}

}
