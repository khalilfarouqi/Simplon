package implimentation_DAO;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import dao.IDAO;
import model.*;
import util.HibernateUtil;

public class AdminDaoImp implements IDAO<Admin> {
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public List<Admin> listElemts() {
		
		List<Admin> livres = null; 		
		
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		
		Query<Admin> query = (Query<Admin>) session.createQuery("FROM admin");
		
		livres = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return livres;
	}
	
	
	public boolean listElemtsAdmin(String username,int password) {
		
		Transaction transaction = null;
        Admin admin = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            admin = (Admin) session.createQuery("FROM admin U WHERE U.username = :username").setParameter("username", username)
                .uniqueResult();

            if (admin != null && admin.getPassword() == password) return true;

            transaction.commit();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        	
            //if (transaction != null) transaction.rollback();
            
            e.printStackTrace();
        }
        return false;
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
		session.update(e);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void deleteElemts(long id) {   
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        
        Object a = session.get(Admin.class, id);
        
        if(a == null) throw new RuntimeException("Admin not delete");
        else session.delete(a);
        
        session.getTransaction().commit();
        session.close();
	}

	

	@Override
	public Admin getElemts(long id) {
		
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        
        Object a = session.get(Admin.class, id);
        
        if(a==null) throw new RuntimeException("Admin introuvable");
        
        session.getTransaction().commit();
        session.close();
        return (Admin)a;
	}


	@Override
	public List<Employe> getALLEmplye() {
		// TODO Auto-generated method stub
		return null;
	}

}
