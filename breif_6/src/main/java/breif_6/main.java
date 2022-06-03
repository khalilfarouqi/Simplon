package breif_6;

import java.util.Scanner;

public class main {
	
	public static Scanner scan = new Scanner(System.in);

	public static void ajouter() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+----------------------HELLO---------------------+");
		
		int choixT,choix;
		
		
		do {
			do {

				System.out.println("+--------------Choisir-quelle-table-------------+");
				System.out.println("|\t\t 1 - Produits \t\t\t|");
				System.out.println("|\t\t 2 - Categories \t\t\t|");
				System.out.println("|\t\t 3 - Unite \t\t\t|");
				System.out.println("|\t\t 0 - Quitter \t\t\t|");
				System.out.println("+-----------------------------------------------+");
				
				do {
					choixT = scan.nextInt();
				} while (choixT < 0 && choixT > 3);

				
				System.out.println("+----------------------MENU---------------------+");
				System.out.println("|\t\t 1 - Ajouter \t\t\t|");
				System.out.println("|\t\t 2 - Supprimer \t\t\t|");
				System.out.println("|\t\t 3 - Modifier \t\t\t|");
				System.out.println("|\t\t 4 - lister \t\t\t|");
				System.out.println("|\t\t-1 - Reteurne \t\t\t|");
				System.out.println("|\t\t 0 - Quitter \t\t\t|");
				System.out.println("+-----------------------------------------------+");
				
				do {
					choix = scan.nextInt();
				} while (choix < 0 && choix > 4);
			} while (choix == -1);
		}while(choix != 0);
		
		if(choixT == 1) {
			
		}else if (choixT == 2) {
			
		}else if (choixT == 3) {
			
		}
		switch (choix) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		}

		System.out.println("--------------------MERCI--------------------");
	}

}
