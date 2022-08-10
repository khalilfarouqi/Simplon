package implimentation_DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.Admin;
import models.Professeurs;

public class Implimentation_Professeurs implements IDAO<Professeurs> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Professeurs prof) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(prof);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Professeurs prof) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        Professeurs user = (Professeurs) session.get(Professeurs.class, prof.getId());
        session.delete(user);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void modifier(Professeurs prof) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.update(prof);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_Tous(Professeurs prof) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        prof = (Professeurs) session.get(Professeurs.class, prof.getId());
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_One(Professeurs prof) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        prof = (Professeurs) session.get(Professeurs.class, prof.getId());
        session.getTransaction().commit();
		session.close();
	}

}
