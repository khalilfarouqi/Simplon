import java.util.Scanner;

public class First_Brif {
	public static Scanner Scan;
	public static double Salaire;
	
	public static void mensuel() {
		
		int No_heure,tarif;
		
		//La_Saisi_de_heure_de_travail
		System.out.println("\t!!!!!REMARAUE Le nombre d’heure total ne doit pas dépasser 50 heures par semaine!!!!!");
		do {
			System.out.println("Vous pouver saisir combient d’heure travaillée par semaine : ");
			No_heure = Scan.nextInt();
		}while(No_heure > 50);
		
		//La_Saisi_de_tarif
		System.out.println("\t!!!!!REMARAUE Le tarif par heure ne doit pas être inférieur à 25 DH par heur!!!!!");
		do {
			System.out.println("\t\tcombient est Le tarif par heure pour vous : ");
			tarif = Scan.nextInt();
		}while(tarif < 25);

		//Le_calcule 
		if (No_heure > 40) Salaire = (40 * tarif) + ((No_heure - 40) * (tarif * 1.5));
		else Salaire = No_heure * tarif;
	}
	
	public static void hebdomadaire() {
		
		int No_heure,tarif;
		
		//La_Saisi_de_heure_de_travail
		System.out.println("\t!!!!!REMARAUE Le nombre d’heure total ne doit pas dépasser 200 heures par mois!!!!!");
		do {
			System.out.println("Vous pouver saisir combient d’heure travaillée par mois : ");
			No_heure = Scan.nextInt();
		}while(No_heure > 200);
		
		//La_Saisi_de_tarif
		System.out.println("\t!!!!!REMARAUE Le tarif par heure ne doit pas être inférieur à 20 DH par heur!!!!!");
		do {
			System.out.println("\t\tcombient est Le tarif par heure pour vous : ");
			tarif = Scan.nextInt();
		}while(tarif < 20);

		//Le_calcule 
		if (No_heure > 180) Salaire = (180 * tarif) + ((No_heure - 180) * (tarif * 1.5));
		else Salaire = No_heure * tarif;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char Mode_payement;
		String Nom;
		
		System.out.println("***************************H E L L O****************************");
		System.out.print("\t*********Saisir votre Nom : ");
		
		Scan = new Scanner(System.in);
		
		Nom = Scan.next(); 
		
		System.out.println("\t*********bienvenue " + Nom + "*********");	
		
		System.out.println("\tVous pouver saisir votre mode de payement");
		System.out.println("\tmensuel taper M \thebdomadaire taper H");
		
		do {
			Mode_payement = Character.toUpperCase(Scan.next().charAt(0)); 
		}while(Mode_payement != 'M' && Mode_payement != 'H');
		
		switch (Mode_payement) {
			case 'H' : 
				hebdomadaire();
				break;
			case 'M' : 
				mensuel();
				break;
		}

		System.out.println(" ________________________________________________");	
		System.out.println("│\tVotre valaire est " + String.format("%.2f", Salaire) + "│");	
		System.out.println("|________________________________________________|");	
		
		
	}

}
