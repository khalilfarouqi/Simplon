package connexion;

import java.sql.*;

public class Connect {
	static Connection Conn = null;

    public Connect() {}

    public static Connection connexion() {
        try {
        	Class.forName("org.postgresql.Driver");

            if(Conn == null) Conn =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/To-do_List", "postgres", "khalil");

        } catch (Exception e) {
			System.out.println(e.getMessage() + " Cannection message");
        }

        return Conn;
    }

}
