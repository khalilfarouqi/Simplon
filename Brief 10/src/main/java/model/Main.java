package model;


import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.Session;



import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;



import implimentation_DAO.AdminDaoImp;
import implimentation_DAO.EmployDaoImp;
import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
      System.out.println("Project started ...");
//      /
      Session session = HibernateUtil.getSessionFactory().openSession();
      session.beginTransaction();
      
      Employe employe1= new Employe();
       EmployDaoImp em = new EmployDaoImp();
       AdminDaoImp ad = new AdminDaoImp();
//		System.out.println(em.getALLEmplye()); 
		/* System.out.println(em.getElemts(1)); */
		/*
		 * List<Employe> listEmp = em.listElemts(); System.out.println(listEmp);
		 */
       
//       ___________________________________________EMPLOYE___________________________________________
      
//       -----------------------------Add employe work---------------------------------------
      
//       em.addElemts(new Employe("MED", "Error", 5000, "Professeur", "CDI"));
//       em.addElemts(new Employe("KHALIL", "one", 7000, "Professeur", "CDI"));
//       em.addElemts(new Employe("NAWAN", "two", 9000, "Professeur", "CDI"));
//       em.addElemts(new Employe("ANASS", "tree", 8000, "Professeur", "CDI"));
//       em.addElemts(new Employe("Mary", "Smile", 10000, "Professeur", "DDI"));
       
//       ------------------------------update employe  work ----------------------------------
       
        
//       Employe e = em.getElemts(6);
//       e.setPrenom("bienvenu");
//       em.updateElemts(e);
       
       
//       ------------------------------delete employe work------------------------------------
       
//       em.deleteElemts(6); 
       
//       ------------------------------lister tous employe no work------------------------------------

		/* System.out.println(em.listElemts()); */
//     ------------------------------lister tous employe no work------------------------------------

//     System.out.println(em.getElemts(1));
       
//       ______________________________________________________________________________________________
       
       
//       ___________________________________________ADMIN___________________________________________
       
//       ---------------------------------Add Admin  work --------------------------------------------
       
//       ad.addElemts(new Admin("MED",123));
//       ad.addElemts(new Admin("khalil",1));
      
//       --------------------------------Admin update work-----------------------------------------
       
//       Admin a = ad.getElemts(2);
//       a.setPassword(0);
//       ad.updateElemts(a);
       

//       ---------------------------------delete Admin work---------------------------------------
        
//        ad.deleteElemts(3); 

//     ------------------------------lister tous Admin no work------------------------------------

//       List<Admin> l = ad.listElemts();
//       System.out.println(ad.listElemts());
       
//       ______________________________________________________________________________________________
       
       
       System.out.println(ad.listElemtsAdmin("khalil",0));
      
      HibernateUtil.getSessionFactory().close();
      
      	
   
	}
}
