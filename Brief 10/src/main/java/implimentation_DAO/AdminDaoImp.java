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
	
	
	public boolean listElemtsAdmin(String user,int password) {
		
		Transaction transaction = null;
        Admin admin = null;
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        try {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            admin = (Admin) session.createQuery("FROM Admin A WHERE A.username = :userName").setParameter("userName", user)
                    .uniqueResult();

            if(admin != null && admin.getPassword() == password) return true;
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
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

}
