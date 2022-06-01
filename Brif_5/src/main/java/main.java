import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	public static Candidat candid = new Candidat();
	
	public static void ajouter () {
		System.out.println(" -------------Ajouter les donner suivent------------");
		System.out.println(" --------------------Identifiant--------------------");
		candid.setIdentifiant(scan.nextLine());
		System.out.println(" ------------------------Nom------------------------");
		candid.setNom(scan.nextLine());
		System.out.println(" ----------------------Prenom-----------------------");
		candid.setPrenom(scan.nextLine());
		System.out.println(" -----------------------Mail------------------------");
		candid.setMail(scan.nextLine());
		System.out.println(" ----------------------Adresse----------------------");
		candid.setAdresse(scan.nextLine());
		System.out.println(" -----------------------Ville-----------------------");
		candid.setVille(scan.nextLine());
		System.out.println(" -----------------------Pays------------------------");
		candid.setPays(scan.nextLine());
		System.out.println(" ---------------------------------------------------");
	}
	
	public static void main(String[] args) throws SQLException {
		
		
		int choi;
		User use = new User();
		
		Con_Data con = new Con_Data();
		do {
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
			
			
			switch(choi) {
				case 1 : ajouter();
					use.Create(candid);
				break;
				case 2 : 
					use.Read(candid);
				break;
				case 3 : 
					use.Update();
				break;
				case 4 : 
					use.Delete(candid);
				break;
				case 0 : System.out.println("-----------------------Merci-----------------------");
						con.connect().close();
				break;
			}
		}while(choi != 0);
		
		
		
		
	}

}


/*while (ResSet.next()) {
	System.out.println("Identifiant : " + ResSet.getString("Identifiant") 
						+ "Nom : " + ResSet.getString("Nom") 
						+ "Prenom : " + ResSet.getString("Prenom") 
						+ "Mail : " + ResSet.getString("Mail") 
						+ "Adresse : " + ResSet.getString("Adresse") 
						+ "Ville : " + ResSet.getString("Ville") 
						+ "Pays : " + ResSet.getString("Pays"));
}*/