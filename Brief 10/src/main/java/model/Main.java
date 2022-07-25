package model;

import org.hibernate.Session;

import dao.AdminDaoImp;
import dao.EmployDaoImp;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
      System.out.println("Project started ...");
      
      Session session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      
      
       EmployDaoImp em = new EmployDaoImp();
       AdminDaoImp ad = new AdminDaoImp();
      
      // -----------------------------Add employe work---------------------------------------
      
//       em.addElemts(new Employe("MED", "Error", 5000, "Professeur", "CDI"));
//       em.addElemts(new Employe("KHALIL", "one", 7000, "Professeur", "CDI"));
//       em.addElemts(new Employe("NAWAN", "two", 9000, "Professeur", "CDI"));
//       em.addElemts(new Employe("ANASS", "tree", 8000, "Professeur", "CDI"));
//       em.addElemts(new Employe("Mary", "Smile", 10000, "Professeur", "DDI"));
       
     // ------------------------------update employe  work ----------------------------------
       
        
       Employe e = em.getElemts(6);
//       e.setPrenom("Flan");
       e.setId(3);
       em.updateElemts(e);
       
       
      // ------------------------------delete employe work------------------------------------
       
//       em.deleteElemts(5); 
       
      //---------------------------------Add Admin  work --------------------------------------------
       
     //  ad.addAdmin(new Admin("MED",123));
      
      //--------------------------------Admin update------------------------------------------
       
       
       
       
       
      
      HibernateUtil.getSessionFactory().close();
   
	}
}
