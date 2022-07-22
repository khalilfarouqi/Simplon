import implimentation_DAO.*;
import models.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employe employe = new Employe();
		employe.setID(1);

		Impliment_Employe metier = new Impliment_Employe();
		metier.lister_Tous(employe);
		
//		List<Livre> livres = metier.chercherLivresParMC("");
		System.out.println(employe.toString());
		
	}

}
