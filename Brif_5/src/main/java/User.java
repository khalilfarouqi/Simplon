import java.sql.*;

public class User implements CRUD  {
	
	public String sql;
	public Con_Data con;
	
	public void Read(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		
		sql = "Select * from Info";

		con = new Con_Data();

		Statement stat = (Statement) con.connect().createStatement();
		ResultSet ResSet = stat.executeQuery(sql);
		
		//Candidat cand = new Candidat();
		candid = new Candidat();
		while (ResSet.next()) {
			/*System.out.println("Identifiant : " + ResSet.getString("Identifiant") 
								+ "Nom : " + ResSet.getString("Nom") 
								+ "Prenom : " + ResSet.getString("Prenom") 
								+ "Mail : " + ResSet.getString("Mail") 
								+ "Adresse : " + ResSet.getString("Adresse") 
								+ "Ville : " + ResSet.getString("Ville") 
								+ "Pays : " + ResSet.getString("Pays"));*/
			candid.setIdentifiant(ResSet.getString("Identifiant"));
			candid.setNom(ResSet.getString("Nom"));
			candid.setPrenom(ResSet.getString("Prenom"));
			candid.setMail(ResSet.getString("Mail"));
			candid.setAdresse(ResSet.getString("Adresse"));
			candid.setVille(ResSet.getString("Ville"));
			candid.setPays(ResSet.getString("Pays"));
			
			candid.toString();
		}
		ResSet.close();
	}
	public void Create(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		//sql = "Insert into Info values ('1','Farouqi','khalil','khalil.farouqi','Salam','Agadir','Maroc')";

		con = new Con_Data();

		PreparedStatement ps = con.connect().prepareStatement("Insert into Info values (?,?,?,?,?,?,?)");

		//Candidat cand = new Candidat();
		 
		/*ps.setString(1, main.candid.getIdentifiant());cand.getIdentifiant()
		ps.setString(2, cand.getNom());
		ps.setString(3, cand.getPrenom());
		ps.setString(4, cand.getMail());
		ps.setString(5, cand.getAdresse());
		ps.setString(6, cand.getVille());
		ps.setString(7, cand.getPays());*/

		ps.execute();

		con.connect().commit();
		ps.close();
	}
	public void Update() throws SQLException {
		// TODO Auto-generated method stub
		
		sql = "UPDATE Info SET Adresse = 'Al Houda' WHERE Identifiant = '1'";
		
		con = new Con_Data();
		
		PreparedStatement ps = con.connect().prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	public void Delete(Candidat candid) throws SQLException {
		// TODO Auto-generated method stub
		
		sql = "DELETE FROM Info WHERE Identifiant = '1'";
		
		con = new Con_Data();
		
		PreparedStatement ps = con.connect().prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
}
