import java.sql.*;

public class User implements CRUD  {
	
	public String sql;
	public Con_Data con;
	
	public void Read(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			sql = "Select * from Info";

			con = new Con_Data();

			Statement stat = (Statement) con.connect().createStatement();
			ResultSet ResSet = stat.executeQuery(sql);

			while (ResSet.next()) {
				
				candid.setIdentifiant(ResSet.getString("Identifiant"));
				candid.setNom(ResSet.getString("Nom"));
				candid.setPrenom(ResSet.getString("Prenom"));
				candid.setMail(ResSet.getString("Mail"));
				candid.setAdresse(ResSet.getString("Adresse"));
				candid.setVille(ResSet.getString("Ville"));
				candid.setPays(ResSet.getString("Pays"));
				
				System.out.println(candid.toString());
				
			}
			ResSet.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Create(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			con = new Con_Data();

			/*PreparedStatement ps = con.connect().prepareStatement("Insert into Info values ("
			+candid.getIdentifiant()+","+candid.getNom()+","+candid.getPrenom()+","+candid.getMail()+","+candid.getAdresse()
			+","+candid.getVille()+","+candid.getPays()+")");*/


			PreparedStatement ps = con.connect().prepareStatement("Insert into Info values (?,?,?,?,?,?,?)");
			 
			ps.setString(1, candid.getIdentifiant());
			ps.setString(2, candid.getNom());
			ps.setString(3, candid.getPrenom());
			ps.setString(4, candid.getMail());
			ps.setString(5, candid.getAdresse());
			ps.setString(6, candid.getVille());
			ps.setString(7, candid.getPays());

			ps.execute();

			con.connect().commit();
			ps.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Update(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		try {
			con = new Con_Data();
			
			sql = "UPDATE Info SET Nom = '"+ candid.getNom() +"',Prenom = '"+ candid.getPrenom() +"',Mail = '" + candid.getMail() + "',"
					+ "Adresse = '"+ candid.getAdresse() +"',Ville = '"+ candid.getVille() +"',Pays = '"+ candid.getPays() +"' "
							+ "WHERE Identifiant = '" + candid.getIdentifiant() + "'";
			
			
			PreparedStatement ps = con.connect().prepareStatement(sql);

			ps.execute();

			con.connect().commit();
			ps.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Delete(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		try {
			con = new Con_Data();
			
			sql = "DELETE FROM Info WHERE Identifiant = '" + candid.getIdentifiant() + "'";

			PreparedStatement ps = con.connect().prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		

}
