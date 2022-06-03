package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Class.Categories;
import Class.Connect;

public class DAO_Categories implements DAO<Categories> {

	public String sql;
	public Connect con;
	
	public void Ajouter(Categories Catg) {
		// TODO Auto-generated method stub
		try {
			sql = "Insert into categories values (?,?)";
			
			con = new Connect();
			
			PreparedStatement ps = con.connexion().prepareStatement(sql);
			 
			ps.setInt(1, Catg.getId_Categories());
			ps.setString(2, Catg.getNom());

			ps.execute();

			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void supprimer(Categories Catg) {
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "DELETE FROM categories WHERE id_categories = " + Catg.getId_Categories();

			PreparedStatement ps = con.connexion().prepareStatement(sql);
			
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void modifier(Categories Catg) {
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "UPDATE categories SET nom = '"+ Catg.getNom() + "WHERE id_categories = " + Catg.getId_Categories();
			
			
			PreparedStatement ps = con.connexion().prepareStatement(sql);

			ps.execute();

			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void lister(Categories Catg) {
		// TODO Auto-generated method stub
		try {
			sql = "Select * from categories";

			con = new Connect();

			Statement stat = (Statement) con.connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				Catg.setId_Categories(ResSet.getInt("id_categories"));
				Catg.setNom(ResSet.getString("nom"));
				
				System.out.println(Catg.toString());
			}
			
			ResSet.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
