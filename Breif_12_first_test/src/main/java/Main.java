import java.time.LocalDate;

import org.hibernate.Session;

import connexion.HibernateUtil;
import implimentation_DAO.*;
import models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Project started ...");
		
		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//	    session.beginTransaction();
	    
	    
	    String dat = "2022-08-10";
	    
	    LocalDate da = LocalDate.parse(dat);
	    
	    System.out.println(da);
	    
	    //----------------------------Models----------------------------
	    
//	    Admin admin = new Admin(1,"Admin@admin.com","Admin"); 
//	    Professeurs prof = new Professeurs(1,"Farouqi","Khalil");
//	    Etudiant etudiant = new Etudiant(1,"Oussous","Anas");
//	    Cours cours = new Cours(1,"2022-08-10","Java");
	    
	    
	    
	    //--------------------------------------------------------------
	    //------------------------Implimentation------------------------
	    
//	    Implimentation_Admin IA = new Implimentation_Admin();
//	    Implimentation_Professeurs IP = new Implimentation_Professeurs();
//	    Implimentation_Etudiant IE = new Implimentation_Etudiant();
//	    Implimentation_Cours IC = new Implimentation_Cours();
	    
	    //--------------------------------------------------------------
	    //----------------------Test-Implimentation---------------------
	    	//--------------------------Admin-----------------------
	    
//	    IA.ajouter(admin);
//	    IA.supprimer(admin);
//	    IA.modifier(admin);
//	    IA.lister_One(admin);
//	    IA.lister_Tous(admin);
	    
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
	    
//	    IC.ajouter(cours);
//	    IC.supprimer(cours);
//	    IC.modifier(cours);
//	    IC.lister_One(cours);
//	    IC.lister_Tous(cours);
	    
    		//------------------------------------------------------
	    //--------------------------------------------------------------

//		HibernateUtil.getSessionFactory().close();
		
		System.out.println("Project Salla !!!!");
	}

}
