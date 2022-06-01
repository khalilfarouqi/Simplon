import java.sql.*;

public class Con_Data {
	public Connection con;
	
	public Con_Data() {}
	
	public Connection connect() {
		
		try {

			return (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/Candidat ", "postgres", "khalil");
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
