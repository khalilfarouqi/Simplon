package implimentation_DAO;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import dao.*;
import model.*;
import util.*;

public class EmployDaoImp  implements IDAO<Employe>{
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	//@SuppressWarnings("unchecked")
	@Override
	public List<Employe> listElemts() {

//		  Transaction transaction = null;
//          List <Employe> listOfEmployee = null;
//          
//          Session session = HibernateUtil.getSessionFactory().openSession();
//          try {
//              // start a transaction
//              transaction = session.beginTransaction();
//              // get an employee object
//
//              listOfEmployee = (session.createQuery("from employe")).getResultList();
//              
//              System.out.println(listOfEmployee);
//              
//              // commit transaction
//              transaction.commit();
//          } catch (Exception e) {
//              if (transaction != null) {
//                  transaction.rollback();
//              }
//              e.printStackTrace();
//          }
//          return listOfEmployee;
		return null;
	}

	@Override
	public void addElemts(Employe e) {                                     
		// work !!!!!
		
		    Session session = sessionFactory.openSession();		
		    session.beginTransaction();
		    session.save(e);
		    session.getTransaction().commit();
		    session.close();
	}

	@Override
	public void updateElemts(Employe e) {                   
		// work !!!!
		
		    Session session = sessionFactory.openSession();	
	        session.beginTransaction();
	        session.update(e);
	        session.getTransaction().commit();
			session.close();
		
	}

	@Override
	public void deleteElemts(long id) {                         
		// work !!!!
		
		    Session session = sessionFactory.openSession();	
            session.beginTransaction();
          //Employe user = (Employe) session.get(Employe.class, id);
            
            System.out.println(id);
            
            Object e = session.get(Employe.class, id);
            if(e == null) throw new RuntimeException("Employe not delete");
            else session.delete(e);
            session.getTransaction().commit();
  		    session.close();
		
	}

	

	@Override
	public Employe getElemts(long id) {
		
             Session session = sessionFactory.openSession();	
             session.beginTransaction();
     //      employe = (Employe) session.get(Employe.class, id);
             Object e = session.get(Employe.class, id);
             if(e==null) throw new RuntimeException("Employe introuvable");
             session.getTransaction().commit();
		     session.close();
		     return (Employe)e;
	}

}
