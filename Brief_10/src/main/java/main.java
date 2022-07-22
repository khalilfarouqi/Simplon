import implimentation_DAO.*;
import models.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Impliment_Employe metier = new Impliment_Employe();
		
		Employe employe = new Employe();
		employe.setID(1);
		
		metier.lister_Tous(employe);
		
//		List<Livre> livres = metier.chercherLivresParMC("");
		System.out.println(employe.toString());
		
	}

}
