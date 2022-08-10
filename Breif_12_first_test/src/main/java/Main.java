import org.hibernate.Session;

import connexion.HibernateUtil;
import implimentation_DAO.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project started ...");
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    
	    
	    
	    Implimentation_Admin IA = new Implimentation_Admin();
	    Implimentation_Cours IC = new Implimentation_Cours();
	    Implimentation_Etudiant IE = new Implimentation_Etudiant();
	    Implimentation_Professeurs IP = new Implimentation_Professeurs();
		
		
		HibernateUtil.getSessionFactory().close();
		
		System.out.println("Project Salla !!!!");
	}

}
