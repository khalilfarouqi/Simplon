package breif_6;

import java.sql.SQLException;
import java.util.Scanner;

import Class.Categories;
import Class.Connect;
import Class.Produits;
import Class.Unite;
import DAO.DAO_Categories;
import DAO.DAO_Produits;
import DAO.DAO_Unite;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	public static Produits Produit;
	public static Unite Unit;
	public static Categories categ;
	
	//_______________________________Produit_______________________________
	
	public static void Ajouter_Produits(Produits Produit) {
		System.out.println("+-----------------Ajouter-les-donner-suivent---------------+");
		System.out.println(" -------------------------id_produit------------------------");
		Produit.setId_Produit(scan.nextInt());
		System.out.println(" ---------------------------code----------------------------");
		Produit.setCode(scan.nextInt());
		System.out.println(" ----------------------------nom----------------------------");
		Produit.setNom(scan.next());
		System.out.println(" -------------------------QteStock--------------------------");
		Produit.setQte_Stock(scan.nextInt());
		System.out.println(" ------------------------PrixUniter-------------------------");
		Produit.setPrix_Uniter(scan.nextInt());
		System.out.println(" -----------------------id_categories-----------------------");
		Produit.setId_categories(scan.nextInt());
		System.out.println(" -------------------------id_unite--------------------------");
		Produit.setId_unite(scan.nextInt());
		System.out.println("+----------------------------------------------------------+");
	}
	
	public static void Supprimer_Produits(Produits Produit) {
		System.out.println("+-------------------------Supprimer------------------------+");
		System.out.println(" -------------------Choisir-id-de-Produits------------------");
		Produit.setId_Produit(scan.nextInt());
		System.out.println("+----------------------------------------------------------+");
	}

	public static void Modifier_Produits(Produits Produit) {
		System.out.println("+-----------------------Misse-a-jour-----------------------+");
		System.out.println(" -------------------Choisir-Id-de-Produits------------------");
		Produit.setId_Produit(scan.nextInt());
		System.out.println(" -----------------Ajouter-les-nouveau-donner----------------");
		System.out.println(" ---------------------------code----------------------------");
		Produit.setCode(scan.nextInt());
		System.out.println(" ----------------------------nom----------------------------");
		Produit.setNom(scan.next());
		System.out.println(" -------------------------QteStock--------------------------");
		Produit.setQte_Stock(scan.nextInt());
		System.out.println(" ------------------------PrixUniter-------------------------");
		Produit.setPrix_Uniter(scan.nextInt());
		System.out.println(" -----------------------id_categories-----------------------");
		Produit.setId_categories(scan.nextInt());
		System.out.println(" -------------------------id_unite--------------------------");
		Produit.setId_unite(scan.nextInt());
		System.out.println("+----------------------------------------------------------+");
		
	}
	
	public static int Lister_Produit() {
		int choixL;
		
		System.out.println("+---------------------Lister--------------------+");
		System.out.println("|\t\t 1 - Tous \t\t\t|");
		System.out.println("|\t\t 2 - Par Categories \t\t|");
		System.out.println("+-----------------------------------------------+");
		
		do {
			choixL = scan.nextInt();
		} while (choixL != 1 && choixL != 2);
		return choixL;
	}
	
	public static int Lister_Produit_Cate() {
		System.out.println("+---------------------Lister--------------------+");
		System.out.println("+---------------Choisir-Categories--------------+");
		int cat_int = scan.nextInt();
		System.out.println("+-----------------------------------------------+");
		return cat_int;
	}
	
	//_______________________________Categories_______________________________
	
	public static void Ajouter_Categories(Categories categ) {
		System.out.println("+-----------------Ajouter-les-donner-suivent---------------+");
		System.out.println(" -----------------------id_Categories---------------------- ");
		categ.setId_Categories(scan.nextInt());
		System.out.println(" ----------------------------nom--------------------------- ");
		categ.setNom(scan.next());
		System.out.println("+----------------------------------------------------------+");
	}
	
	public static void Supprimer_Categories(Categories categ) {
		System.out.println("+-------------------------Supprimer------------------------+");
		System.out.println(" ------------------Choisir-id-de-Categories---------------- ");
		categ.setId_Categories(scan.nextInt());
		System.out.println("+----------------------------------------------------------+");
	}

	public static void Modifier_Categories(Categories categ) {
		System.out.println("+-----------------------Misse-a-jour-----------------------+");
		System.out.println(" ------------------Choisir-Id-de-Categories-----------------");
		categ.setId_Categories(scan.nextInt());
		System.out.println(" -----------------Ajouter-les-nouveau-donner----------------");
		System.out.println(" ----------------------------nom----------------------------");
		categ.setNom(scan.next());
		System.out.println("+----------------------------------------------------------+");
		
	}
	
	//_______________________________Unite_______________________________
	
	public static void Ajouter_Unite(Unite Unit) {
		System.out.println("+-----------------Ajouter-les-donner-suivent---------------+");
		System.out.println(" -------------------------id_Unite------------------------- ");
		Unit.setId_Unite(scan.nextInt());
		System.out.println(" ----------------------------nom--------------------------- ");
		Unit.setNom(scan.next());
		System.out.println("+----------------------------------------------------------+");
	}
	
	public static void Supprimer_Unite(Unite Unit) {
		System.out.println("+-------------------------Supprimer------------------------+");
		System.out.println(" ---------------------Choisir-id-de-Unite------------------ ");
		Unit.setId_Unite(scan.nextInt());
		System.out.println("+----------------------------------------------------------+");
	}

	public static void Modifier_Unite(Unite Unit) {
		System.out.println("+-----------------------Misse-a-jour-----------------------+");
		System.out.println(" --------------------Choisir-Id-de-Unite------------------- ");
		Unit.setId_Unite(scan.nextInt());
		System.out.println(" -----------------Ajouter-les-nouveau-donner----------------");
		System.out.println(" ----------------------------nom----------------------------");
		Unit.setNom(scan.next());
		System.out.println("+----------------------------------------------------------+");
		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("+----------------------HELLO---------------------+");
		
		int choixT,choix;
		Connect con = new Connect();
		DAO_Produits DPro = new DAO_Produits();
		DAO_Categories DCat = new DAO_Categories();
		DAO_Unite DUni = new DAO_Unite();
		
		do {

			System.out.println("+--------------Choisir-quelle-table-------------+");
			System.out.println("|\t\t 1 - Produits \t\t\t|");
			System.out.println("|\t\t 2 - Categories \t\t|");
			System.out.println("|\t\t 3 - Unite \t\t\t|");
			System.out.println("|\t\t 0 - Quitter \t\t\t|");
			System.out.println("+-----------------------------------------------+");
				
			do {
				choixT = scan.nextInt();
				if (choixT == 0) {
					System.out.println("--------------------MERCI--------------------");
					return;
				}
			} while (choixT < 0 || choixT > 3);

			do {
				
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
				} while (choix < -1 || choix > 4);

				Produit = new Produits();
				categ = new Categories();
				Unit = new Unite();

				if(choixT == 1) {
					switch (choix) {
					case 1:
						Ajouter_Produits(Produit);
						DPro.Ajouter(Produit);
						break;
					case 2:
						Supprimer_Produits(Produit);
						DPro.supprimer(Produit);
						break;
					case 3:
						Modifier_Produits(Produit);
						DPro.modifier(Produit);
						break;
					case 4:
						if (Lister_Produit() == 1) DPro.lister(Produit);
						else {
							DPro.lister_Catg_Ajou(Produit);
							DPro.lister_Catg(Produit, Lister_Produit_Cate());
						}
						break;
					}
				}else if (choixT == 2) {
					switch (choix) {
					case 1:
						Ajouter_Categories(categ);
						DCat.Ajouter(categ);
						break;
					case 2:
						Supprimer_Categories(categ);
						DCat.supprimer(categ);
						break;
					case 3:
						Modifier_Categories(categ);
						DCat.modifier(categ);
						break;
					case 4:
						DCat.lister(categ);
						break;
					}
				}else if (choixT == 3) {
					switch (choix) {
					case 1:
						Ajouter_Unite(Unit);
						DUni.Ajouter(Unit);
						break;
					case 2:
						Supprimer_Unite(Unit);
						DUni.supprimer(Unit);
						break;
					case 3:
						Modifier_Unite(Unit);
						DUni.modifier(Unit);
						break;
					case 4:
						DUni.lister(Unit);
						break;
					}
				}
			} while (choix != -1 && choix != 0 && choixT != 0);
		}while(choix != 0);
		
		con.connexion().close();
		
		System.out.println("+-----------------------------------------------+");
		System.out.println("|                     MERCI                     |");
		System.out.println("+-----------------------------------------------+");
		
	}

}
