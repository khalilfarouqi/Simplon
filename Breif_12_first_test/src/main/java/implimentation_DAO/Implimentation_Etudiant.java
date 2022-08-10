package implimentation_DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.IDAO;
import models.Admin;
import models.Etudiant;

public class Implimentation_Etudiant implements IDAO<Etudiant> {

	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	@Override
	public void ajouter(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();		
		session.beginTransaction();
		session.save(etudiant);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        Etudiant user = (Etudiant) session.get(Etudiant.class, etudiant.getId());
        session.delete(user);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void modifier(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        session.update(etudiant);
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_Tous(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        etudiant = (Etudiant) session.get(Etudiant.class, etudiant.getId());
        session.getTransaction().commit();
		session.close();
	}

	@Override
	public void lister_One(Etudiant etudiant) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();	
        session.beginTransaction();
        etudiant = (Etudiant) session.get(Etudiant.class, etudiant.getId());
        session.getTransaction().commit();
		session.close();
	}

}
