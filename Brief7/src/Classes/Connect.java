package Classes;
import java.sql.*;

public class Connect {
	
	public Message_Box Msg_Box = new Message_Box();
	public Connect() {}
	
	public Connection Connexion() {
		
		try {

			return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/Candidat ", "postgres", "khalil");
			
			
		}catch(SQLException e) {
			Msg_Box.message_box(e);
		}
		return null;
	}
	
}
