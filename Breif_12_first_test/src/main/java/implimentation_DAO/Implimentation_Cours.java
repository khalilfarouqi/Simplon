package implimentation_DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import connexion.HibernateUtil;
import dao.IDAO;
import models.*;

public class Implimentation_Cours implements IDAO <Cours>{

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Cours cours) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(cours);
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

	            Cours cours1 = (Cours) session.get(Cours.class, id);
	            if (cours1 != null) {
	                session.delete(cours1);
	                System.out.println("cours is deleted");
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
	public void modifier(Cours cours) {
		Transaction transaction = null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	        	transaction = session.beginTransaction();
	            session.update(cours);
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
	public List<Cours> lister_Tous() {
		Query query;
		List<Cours> cours = null;
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
       try {
    	   query = (Query) session.createQuery("Select * from cours");
    	   cours = query.list();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           e.printStackTrace();
       }
       return cours;
	}

	@Override
	public Cours lister_One(long id) {
		Transaction transaction = null;
		Cours cours = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
       try {
           transaction = session.beginTransaction();
           cours = (Cours) session.get(Cours.class, id);
           transaction.commit();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return cours;
	}

}
