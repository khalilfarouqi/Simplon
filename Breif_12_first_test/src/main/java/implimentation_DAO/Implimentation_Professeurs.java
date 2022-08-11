package implimentation_DAO;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import connexion.HibernateUtil;
import dao.IDAO;
import models.*;

public class Implimentation_Professeurs implements IDAO<Professeurs> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Professeurs prof) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(prof);
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

	            Professeurs prof = (Professeurs) session.get(Professeurs.class, id);
	            if (prof != null) {
	                session.delete(prof);
	                System.out.println("Professeurs is deleted");
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
	public void modifier(Professeurs prof) {
		Transaction transaction = null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	        	transaction = session.beginTransaction();
	            session.update(prof);
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
	public List<Professeurs> lister_Tous() {
		Query query;
		List<Professeurs> prof = null;
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
       try {
    	   query = (Query) session.createQuery("Select * from professeurs");
    	   prof = query.list();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           e.printStackTrace();
       }
       return prof;
	}

	@Override
	public Professeurs lister_One(long id) {
		Transaction transaction = null;
		Professeurs prof = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
       try {
           transaction = session.beginTransaction();
           prof = (Professeurs) session.get(Professeurs.class, id);
           transaction.commit();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return prof;
	}

}
