package Class;

import java.sql.*;

public class Connect {
	
	public Connect() {}
	
	public Connection connexion() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestion_produits", "postgres", "khalil");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
