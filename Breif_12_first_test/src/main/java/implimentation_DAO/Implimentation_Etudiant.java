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

public class Implimentation_Etudiant implements IDAO<Etudiant> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Etudiant etudiant) {
		Transaction transaction = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(etudiant);
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

	            Etudiant etudiant = (Etudiant) session.get(Etudiant.class, id);
	            if (etudiant != null) {
	                session.delete(etudiant);
	                System.out.println("Etudiant is deleted");
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
	public void modifier(Etudiant etudiant) {
		Transaction transaction = null;
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	        	transaction = session.beginTransaction();
	            session.update(etudiant);
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
	public List<Etudiant> lister_Tous() {
		Query query;
		List<Etudiant> etudiant = null;
		Session session = sessionFactory.openSession();	
		session.beginTransaction();
       try {
    	   query = (Query) session.createQuery("Select * from etudiant");
    	   etudiant = query.list();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           e.printStackTrace();
       }
       return etudiant;
	}

	@Override
	public Etudiant lister_One(long id) {
		Transaction transaction = null;
		Etudiant etudiant = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
       try {
           transaction = session.beginTransaction();
           etudiant = (Etudiant) session.get(Etudiant.class, id);
           transaction.commit();
       } catch (Exception e) {
       	System.out.println(e.getMessage());
           if (transaction != null) {
               transaction.rollback();
           }
           e.printStackTrace();
       }
       return etudiant;
	}
}
