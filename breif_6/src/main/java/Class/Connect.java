package Class;

import java.sql.*;

public class Connect {
	
	public Connect() {}
	
	public Connection connexion() {
		try {
			
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gestion_Produit", "postgres", "khalil");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
