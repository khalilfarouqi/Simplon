package Models;

import java.sql.*;

public class Connect {
	
	static Connection Conn = null;
	
	public Connect() {}
	
	public static Connection connexion() {
		
		try {
			
			if(Conn == null) Conn =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestion_produits", "postgres", "khalil");
		
		} catch (Exception e) {
			Message_Box Msg_Box = new Message_Box();
			Msg_Box.message_box(e, "Connexion");
		}
		
		return Conn;
	}
}
