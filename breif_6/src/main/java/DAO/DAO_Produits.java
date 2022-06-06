package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Class.Connect;
import Class.Produits;

public class DAO_Produits implements DAO<Produits> {

	public String sql;
	public Connect con;
	
	public void Ajouter(Produits Prod) {
		// TODO Auto-generated method stub
		try {
			sql = "Insert into Produits values (?,?,?,?,?,?,?)";
			
			con = new Connect();
			
			PreparedStatement ps = con.connexion().prepareStatement(sql);
			 
			ps.setInt(1, Prod.getId_Produit());
			ps.setInt(2, Prod.getCode());
			ps.setString(3, Prod.getNom());
			ps.setInt(4, Prod.getQte_Stock());
			ps.setInt(5, Prod.getPrix_Uniter());
			ps.setInt(6, Prod.getId_categories());
			ps.setInt(7, Prod.getId_unite());

			ps.execute();

			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void supprimer(Produits Prod) {
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "DELETE FROM Produits WHERE id_Produits = " + Prod.getId_Produit();

			PreparedStatement ps = con.connexion().prepareStatement(sql);
			
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void modifier(Produits Prod) {
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "UPDATE Produits SET code = "+ Prod.getCode() + ",nom = '" + Prod.getNom() + "',QteStock = " +  Prod.getQte_Stock() 
			+ ",PrixUniter = " + Prod.getPrix_Uniter() + ",id_categories = " + Prod.getId_categories() + ",id_unite = " + Prod.getId_unite() 
			+ " WHERE id_Produits = " + Prod.getId_Produit();
			
			
			PreparedStatement ps = con.connexion().prepareStatement(sql);

			ps.execute();

			ps.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void lister(Produits Prod) {
		// TODO Auto-generated method stub
		try {
			sql = "Select * from produits";

			con = new Connect();

			Statement stat = (Statement) con.connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				Prod.setId_Produit(ResSet.getInt("id_produit"));
				Prod.setCode(ResSet.getInt("code"));
				Prod.setNom(ResSet.getString("nom"));
				Prod.setQte_Stock(ResSet.getInt("QteStock"));
				Prod.setPrix_Uniter(ResSet.getInt("PrixUniter"));
				Prod.setId_categories(ResSet.getInt("id_categories"));
				Prod.setId_unite(ResSet.getInt("id_unite"));
				
				System.out.println(Prod.toString());
			}
			
			ResSet.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
