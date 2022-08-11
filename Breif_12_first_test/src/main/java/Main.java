import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import connexion.HibernateUtil;
import implimentation_DAO.*;
import models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project started ...");
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	    session.beginTransaction();
	    
	    
//	    String dat = "2022-08-10";
//	    
//	    LocalDate da = LocalDate.parse(dat);
//	    
//	    System.out.println(da);

	    //------------------------Implimentation------------------------
	    
	    Implimentation_Admin IA = new Implimentation_Admin();
	    Implimentation_Professeurs IP = new Implimentation_Professeurs();
	    Implimentation_Etudiant IE = new Implimentation_Etudiant();
	    Implimentation_Cours IC = new Implimentation_Cours();
	    
	    //--------------------------------------------------------------
	    //----------------------------Models----------------------------
	    
//	    Admin admin = new Admin("Admin2@admin.com","Admin2"); 
//	    Professeurs prof = new Professeurs("Farouqi2","Khalil2");
//	    Cours cours = new Cours("2022-08-02","Java2",IP.lister_One(1),ListEtu);

	    //--------------------------------------------------------------
	    //----------------------Test-Implimentation---------------------
	    	//--------------------------Admin-----------------------
//	    System.out.println(IP.lister_One(1));
	    
//	    Admin admin = new Admin();
//	    IA.ajouter(admin);
//	    IA.supprimer(5);
//	    IA.modifier(admin);
//	    System.out.println(IA.lister_One(4));
//	    System.out.println(IA.lister_Tous());
	    
	    	//------------------------------------------------------
    		//--------------------------Prof------------------------
	    
//	    IP.ajouter(prof);
//	    IP.supprimer(prof);
//	    IP.modifier(prof);
//	    IP.lister_One(prof);
//	    IP.lister_Tous(prof);
	    
    		//------------------------------------------------------
	    	//--------------------------Etudi-----------------------
	    
//	    IE.ajouter(etudiant);
//	    IE.supprimer(etudiant);
//	    IE.modifier(etudiant);
//	    IE.lister_One(etudiant);
//	    IE.lister_Tous(etudiant);
	    
    		//------------------------------------------------------
    		//--------------------------Cours-----------------------

//	    Cours cours = new Cours();
//	    Cours cours = new Cours(2,"2022-08-02","Java2",IP.lister_One(1));
//	    IC.ajouter(cours);
//	    IC.lister_Tous(cours);
//	    IC.supprimer();
//	    IC.modifier(cours);
//	    System.out.println(IC.lister_One(1));;
	    
    		//------------------------------------------------------
	    //--------------------------------------------------------------

		HibernateUtil.getSessionFactory().close();
		
		System.out.println("Project Salla !!!!");
	}

}
