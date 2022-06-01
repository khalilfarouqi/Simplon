import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated me
		
		Scanner scan = new Scanner(System.in);
		int choi;
		String sql;
		Candidat cond = new Candidat();
		
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
				case 1 : 
						cond.Create();
				break;
				case 2 : 
						cond.Read();
				break;
				case 3 : 
						cond.Update();
				break;
				case 4 : 
						cond.Delete();
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