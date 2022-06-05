package DAO;

import java.sql.*;

import Class.Connect;
import Class.Unite;

public class DAO_Unite implements DAO<Unite>{
	
	public String sql;
	public Connect con;

	public void Ajouter(Unite unt) {
		// TODO Auto-generated method stub
		try {
			sql = "Insert into unite values (?,?)";
			
			con = new Connect();
			
			PreparedStatement ps = con.connexion().prepareStatement(sql);
			 
			ps.setInt(1, unt.getId_Unite());
			ps.setString(2, unt.getNom());

			ps.execute();

			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void supprimer(Unite unt) {
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "DELETE FROM unite WHERE id_unite = " + unt.getId_Unite();

			PreparedStatement ps = con.connexion().prepareStatement(sql);
			
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void modifier(Unite unt) {
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "UPDATE unite SET Nom = '"+ unt.getNom() + "WHERE id_unite = " + unt.getId_Unite();
			
			
			PreparedStatement ps = con.connexion().prepareStatement(sql);

			ps.execute();

			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void lister(Unite unt) {
		// TODO Auto-generated method stub
		try {
			sql = "Select * from unite";

			con = new Connect();

			Statement stat = (Statement) con.connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				unt.setId_Unite(ResSet.getInt("id_unite"));
				unt.setNom(ResSet.getString("nom"));
				
				System.out.println(unt.toString());
			}
			
			ResSet.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
