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
//	    Professeurs prof2 = new Professeurs("Farouqi1","Khalil1");
//	    Professeurs prof3 = new Professeurs("Farouqi3","Khalil3");
	    
//	    
//	    Etudiant etudiant1 = new Etudiant(1,"Oussous2","Anas2");
//	    Etudiant etudiant3 = new Etudiant(3,"Oussous2","Anas2");
//		List <Etudiant> ListEtu = new ArrayList<Etudiant>(); 
//		ListEtu.add(etudiant1);
//		ListEtu.add(etudiant3);
		

//		Cours cours1 = new Cours(1,"Oussous1","Anas1",IP.lister_One(1));
//		Cours cours2 = new Cours(2,"Oussous2","Anas2",IP.lister_One(2));
//		Cours cours3 = new Cours(3,"Oussous3","Anas3",IP.lister_One(3));
//		List <Cours> ListCou = new ArrayList<Cours>(); 
//		ListCou.add(cours1);
//		ListCou.add(cours2);
//		ListCou.add(cours3);
		
//	    Etudiant etudiant = new Etudiant("Oussous2","Anas4",ListCou);
//	    Cours cours = new Cours("2022-08-12","Java3",IP.lister_One(1),ListEtu);

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
	    System.out.println(IP.lister_One(1));
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
	    System.out.println(IC.lister_One(1));;
	    
    		//------------------------------------------------------
	    //--------------------------------------------------------------

		HibernateUtil.getSessionFactory().close();
		
		System.out.println("Project Salla !!!!");
	}

}
