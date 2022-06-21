package DAO_Breif;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Models.*;

public class DAO_Users implements DAO<Users>{
	
	private String sql;
	private Message_Box Msg_Box = new Message_Box();
	
	public void Ajouter(Users users) {
		// TODO Auto-generated method stub
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
			Msg_Box.message_box(e,"Create DAO_Candidat");
		}
	}

	
	public void supprimer(Users users) {
		// TODO Auto-generated method stub
		
	}

	
	public void modifier(Users users) {
		// TODO Auto-generated method stub
		
	}

	
	public void lister(Users users) {
		// TODO Auto-generated method stub
		try {
			sql = "Select max(id_user) from users";

			Statement stat = (Statement) Connect.connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				users.setID_User(ResSet.getInt("max") + 1);
			}
			
			ResSet.close();
		}catch(Exception e) {
			Msg_Box.message_box(e,"Read DAO_Candidat");
		}
	}	
	
	public void test_Connection(Users users, String user_nam, String password) {
		try {
			sql = "Select * from users where user_name = '" + user_nam + "' and user_password = '" + password + "'";

			
			Statement stat = Connect.connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				users.setUser_Name(ResSet.getString("user_name"));
				users.setUser_PassWord(ResSet.getString("user_password"));
			}
			
			ResSet.close();
		} catch (Exception e) {
			// TODO: handle exception
			Msg_Box.message_box(e, "Test Connection in DAO_users");
		}
	}

}
