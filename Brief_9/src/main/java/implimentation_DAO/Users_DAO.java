package implimentation_DAO;

import java.sql.*;

import models.*;
import dao.*;
import connexion.*;

public class Users_DAO implements IDAO<Users> {
	 
	String sql;

	@Override
	public void Ajouter(Users users) {
        try {

            PreparedStatement ps = Connect.connexion().prepareStatement("Insert into users values (?,?,?,?,?)");

            ps.setInt(1, users.getID_User()+1);
            ps.setString(2, users.getFirst_Name());
            ps.setString(3, users.getLast_Name());
            ps.setString(4, users.getUser_Name());
            ps.setString(5, users.getUser_PassWord());

            ps.execute();

            ps.close();
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

	@Override
	public void supprimer(Users users) {
		// userODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Users users) {
		// userODO Auto-generated method stub
		
	}

	@Override
	public void lister(Users users) {
        try {
            sql = "Select max(id_user) from users";

            Statement stat = (Statement) Connect.connexion().createStatement();
            ResultSet ResSet = stat.executeQuery(sql);

            while (ResSet.next()) {
                users.setID_User(ResSet.getInt("max") + 1);
            }

            ResSet.close();
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

    public void test_Connection(Users users, String user_nam, String password) {
        try {
            sql = "Select * from users where user_name = '" + user_nam + "' and user_password = '" + password + "'";


            Statement stat = Connect.connexion().createStatement();
            ResultSet ResSet = stat.executeQuery(sql);

            while (ResSet.next()) {
                users.setFirst_Name(ResSet.getString("First_Name"));
                users.setLast_Name(ResSet.getString("Last_Name"));
                users.setUser_Name(ResSet.getString("user_name"));
                users.setUser_PassWord(ResSet.getString("user_password"));
            }

            ResSet.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }

}
