import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	public static Candidat candid;
	
	public static void ajouter () {
		System.out.println(" -------------Ajouter les donner suivent------------");
		System.out.println(" --------------------Identifiant--------------------");
		candid.setIdentifiant(scan.next());
		System.out.println(" ------------------------Nom------------------------");
		candid.setNom(scan.next());
		System.out.println(" ----------------------Prenom-----------------------");
		candid.setPrenom(scan.next());
		System.out.println(" -----------------------Mail------------------------");
		candid.setMail(scan.next());
		System.out.println(" ----------------------Adresse----------------------");
		candid.setAdresse(scan.next());
		System.out.println(" -----------------------Ville-----------------------");
		candid.setVille(scan.next());
		System.out.println(" -----------------------Pays------------------------");
		candid.setPays(scan.next());
		System.out.println(" ---------------------------------------------------");
	}
	
	public static void miss_jour() {
		System.out.println(" --------------------Misse a jour-------------------");
		System.out.println(" ----------Choisir Identifiant de candidat----------");
		candid.setIdentifiant(scan.next());
		System.out.println(" -------------Ajouter les nouveau donner------------");
		System.out.println(" ------------------------Nom------------------------");
		candid.setNom(scan.next());
		System.out.println(" ----------------------Prenom-----------------------");
		candid.setPrenom(scan.next());
		System.out.println(" -----------------------Mail------------------------");
		candid.setMail(scan.next());
		System.out.println(" ----------------------Adresse----------------------");
		candid.setAdresse(scan.next());
		System.out.println(" -----------------------Ville-----------------------");
		candid.setVille(scan.next());
		System.out.println(" -----------------------Pays------------------------");
		candid.setPays(scan.next());
		System.out.println(" ---------------------------------------------------");
		
	}
	
	public static void Supprimer() {
		System.out.println(" ---------------------Supprimer---------------------");
		System.out.println(" ----------Choisir Identifiant de candidat----------");
		candid.setIdentifiant(scan.next());
		System.out.println(" ---------------------------------------------------");
	}
	
	public static void main(String[] args) throws SQLException {
		
		
		int choi;
		DAO_Condidat use = new DAO_Condidat();
		
		Connect con = new Connect();
		do {
			
			//System.out.print("\f");
			
			System.out.println(" ----------MENU---------");
			System.out.println("|\t1-Ajouter\t|");
			System.out.println("|\t2-Afficher\t|");
			System.out.println("|\t3-Mettre a jour\t|");
			System.out.println("|\t4-Supprimer\t|");
			System.out.println("|\t0-Quitter\t|");
			System.out.println(" -----------------------");
			
			do {
				choi = scan.nextInt();
			}while(choi < 0 && choi > 4);
			
			candid = new Candidat();
			
			switch(choi) {
				case 1 : ajouter();
					use.Create(candid);
				break;
				case 2 : 
					use.Read(candid);
				break;
				case 3 : 
					miss_jour();
					use.Update(candid);
				break;
				case 4 : 
					Supprimer();
					use.Delete(candid);
				break;
				case 0 : System.out.println("-----------------------Merci-----------------------");
						con.connect().close();
				break;
			}
		}while(choi != 0);
		
		
	}

}