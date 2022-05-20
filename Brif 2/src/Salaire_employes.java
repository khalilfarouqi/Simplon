import java.time.LocalDate;
import java.util.Scanner;

public class Salaire_employes {
	
	public static Scanner scan = new Scanner(System.in);
	public static String Prenom, Nom;
	public static LocalDate Da_Nai;
	public static char type_employés, Mode_payement;
	public static Double Salaire, Commission, taux_horaire, heures_prestées;
	public static int Ventes;
	
	
	public static void employesFixe() {
		
		System.out.println("-------------------------------------------Fixe---------------------------------------------");
		
		//----------------------------------------_Salaire-------------------------------------------
		System.out.println("\tS'il vous plais saisi votre Salaire :");
		Salaire = scan.nextDouble();
		
		//----------------------------------------Declaration_de_Class-------------------------------
		EmployeFixe EmFi = new EmployeFixe(Salaire, Prenom, Nom, Da_Nai);
		
		//----------------------------------------Afficher_Class-------------------------------------
		System.out.println(EmFi.toString());
		
		System.out.println("---------------------------------------M E R C I---------------------------------------------");
	}
	
	public static void employesCommission() {
		
		System.out.println("--------------------------------------------Commission--------------------------------------------");
		
		//----------------------------------------_Salaire-------------------------------------------
		System.out.println("\tS'il vous plais saisi votre Salaire :");
		Salaire = scan.nextDouble();
		//----------------------------------------_ventes-------------------------------------------
		System.out.println("\tS'il vous plais saisi combient de ventes avez vous fait :");
		Ventes = scan.nextInt();
		//----------------------------------------Commission-------------------------------------------
		System.out.println("\tS'il vous plais saisi commission il est la commission :");
		Commission = scan.nextDouble();
		
		//----------------------------------------Declaration_de_Class-------------------------------
		EmployeCommission EmCo = new EmployeCommission(Prenom, Nom, Da_Nai, Salaire, Commission, Ventes);
		
		//----------------------------------------Afficher_Class-------------------------------------
		System.out.println(EmCo.toString());
		
		System.out.println("---------------------------------------M E R C I---------------------------------------------");
	}
	
	public static void employesHoraire() {
		
		System.out.println("---------------------------------------------Horaire-------------------------------------------");
		
		//----------------------------------------Mode_de_payement---------------------------------------
		System.out.println("\tVous pouver saisir votre mode de payement");
		System.out.println("\tmensuel taper M \thebdomadaire taper H");
		do {
			Mode_payement = Character.toUpperCase(scan.next().charAt(0)); 
		}while(Mode_payement != 'M' && Mode_payement != 'H');
		
		
		//----------------------------------------taux_horaire-------------------------------------------
		System.out.println("\tS'il vous plais saisi votre taux horaire :");
		taux_horaire = scan.nextDouble();
		//----------------------------------------heures_prestées----------------------------------------
		System.out.println("\tS'il vous plais saisi votre heures prestées :");
		heures_prestées = scan.nextDouble();
		
		//----------------------------------------Declaration_de_Class-------------------------------
		EmployeHoraire EmHo = new EmployeHoraire(Prenom, Nom, Da_Nai, taux_horaire, heures_prestées);
		
		//----------------------------------------Afficher_Class-------------------------------------
		System.out.println(EmHo.toString());
		
		System.out.println("---------------------------------------M E R C I---------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------------------------------HELLO BOSS---------------------------------------");
		
		
		//----------------------------------------_Prenom-------------------------------------
		System.out.println("\tS'il vous plais saisi votre Prenom :");
		Prenom = scan.nextLine();
		
		//----------------------------------------_nom----------------------------------------
		System.out.println("\tS'il vous plais saisi votre Nom :");
		Nom = scan.nextLine();
		
		//----------------------------------------Date_de_naissance---------------------------
		System.out.println("\tS'il vous plais saisi votre Date de naissance :");
		Da_Nai = LocalDate.of(scan.nextInt() , scan.nextInt() , scan.nextInt());
		
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		//----------------------------------------type_de_employés---------------------------
		System.out.println("\tQelle type de employés eter vous");
		System.out.println("\tFixe tapper F\tCommission tapper C\tHoraire tapper H");
		do {
			type_employés = Character.toUpperCase(scan.next().charAt(0));
		}while(type_employés != 'F' && type_employés != 'C' && type_employés != 'H');
		
		//----------------------------------------Switch_les_type---------------------------
		switch (type_employés) {
		case 'F' : 
			employesFixe();
			break;
		case 'C' : 
			employesCommission();
			break;
		case 'H' : 
			employesHoraire();
			break;
	}
		
		 
		
	}

}
