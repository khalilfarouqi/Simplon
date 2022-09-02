package DAO_Pa;
import java.sql.*;

import Controllers.FormController;
import Models.*;
import javafx.scene.control.Alert;

public class DAO_Candidat implements DAO  {
	
	Message_Box Msg_Box = new Message_Box();
	
	public String sql;
	public Connect con;
	
	public void Read(Candidat candid){
		// TODO Auto-generated method stub
		
		try {
			sql = "Select * from Info";

			con = new Connect();

			Statement stat = (Statement) con.Connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				
				candid.setIdentifiant(ResSet.getString("Identifiant"));
				candid.setNom(ResSet.getString("Nom"));
				candid.setPrenom(ResSet.getString("Prenom"));
				candid.setMail(ResSet.getString("Mail"));
				candid.setAdresse(ResSet.getString("Adresse"));
				candid.setVille(ResSet.getString("Ville"));
				candid.setPays(ResSet.getString("Pays"));
			}
			
			ResSet.close();
		}catch(Exception e) {
			Msg_Box.message_box(e,"Read DAO_Candidat");
		}
	}
	public void Read_ID(Candidat candid,String Id){
		// TODO Auto-generated method stub
		
		try {
			sql = "Select * from Info where Identifiant = '" + Id + "'";

			con = new Connect();

			Statement stat = (Statement) con.Connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				
				candid.setIdentifiant(ResSet.getString("Identifiant"));
				candid.setNom(ResSet.getString("Nom"));
				candid.setPrenom(ResSet.getString("Prenom"));
				candid.setMail(ResSet.getString("Mail"));
				candid.setAdresse(ResSet.getString("Adresse"));
				candid.setVille(ResSet.getString("Ville"));
				candid.setPays(ResSet.getString("Pays"));

				Alert alert = new Alert(Alert.AlertType.INFORMATION);
				alert.setTitle("Message Here...");
			    alert.setHeaderText("Candidat Info");
			    alert.setContentText(candid.toString());
			    alert.showAndWait();
				
			}
			ResSet.close();
		}catch(Exception e) {
			Msg_Box.message_box(e,"Read_ID DAO_Candidat");
		}
	}
	
	public void Create(Candidat candid){
		// TODO Auto-generated method stub
		try {
			
			con = new Connect();
			
			PreparedStatement ps = con.Connexion().prepareStatement("Insert into Info values (?,?,?,?,?,?,?)");
			 
			ps.setString(1, candid.getIdentifiant());
			ps.setString(2, candid.getNom());
			ps.setString(3, candid.getPrenom());
			ps.setString(4, candid.getMail());
			ps.setString(5, candid.getAdresse());
			ps.setString(6, candid.getVille());
			ps.setString(7, candid.getPays());

			ps.execute();

			ps.close();
		}catch(Exception e) {
			Msg_Box.message_box(e,"Create DAO_Candidat");
		}
	}
	
	public void Update(Candidat candid){
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "UPDATE Info SET Nom = '"+ candid.getNom() +"',Prenom = '"+ candid.getPrenom() +"',Mail = '" + candid.getMail() + "',"
					+ "Adresse = '"+ candid.getAdresse() +"',Ville = '"+ candid.getVille() +"',Pays = '"+ candid.getPays() +"' "
							+ "WHERE Identifiant = '" + candid.getIdentifiant() + "'";
			
			
			PreparedStatement ps = con.Connexion().prepareStatement(sql);

			ps.execute();

			con.Connexion().commit();
			ps.close();
		}catch (Exception e) {
			Msg_Box.message_box(e,"Update DAO_Candidat");
		}
	}
	
	public void Delete(Candidat candid){
		// TODO Auto-generated method stub
		try {
			con = new Connect();
			
			sql = "DELETE FROM Info WHERE Identifiant = '" + candid.getIdentifiant() + "'";

			PreparedStatement ps = con.Connexion().prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			Msg_Box.message_box(e,"Delete DAO_Candidat");
		}
		
	}
		
	public void test_Connection(Candidat candid, String First_Name, String Last_Name) {
		try {
			sql = "Select * from Info where Nom = '" + Last_Name + "' and Prenom = '" + First_Name + "'";

			con = new Connect();

			Statement stat = (Statement) con.Connexion().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				candid.setNom(ResSet.getString("Nom"));
				candid.setPrenom(ResSet.getString("Prenom"));
			}
			
			ResSet.close();
		} catch (Exception e) {
			// TODO: handle exception
			Msg_Box.message_box(e, "Test Connection in DAO_can");
		}
	}
}
