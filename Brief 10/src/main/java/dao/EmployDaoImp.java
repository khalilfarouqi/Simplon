package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import implimentation_DAO.IDAO;
import model.Employe;

public class EmployDaoImp  implements IDAO<Employe>{
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	@Override
	public List<Employe> listElemts() {

	        Session session = sessionFactory.openSession();		
	        session.beginTransaction();
	        Query<Employe> query = (Query<Employe>) session.createQuery("Select * from Employe");
	        List<Employe> employe = query.list();
	        session.getTransaction().commit();
	        session.close();
		    return employe;
		
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
