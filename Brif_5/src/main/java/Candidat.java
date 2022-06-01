import java.sql.*;

public class Candidat implements CRUD {
	
	private String identifiant; 
	private String nom; 
	private String prenom; 
	private String mail; 
	private String adresse; 
	private String ville; 
	private String pays;
	
	public String sql;
	public Con_Data con;
	
	
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	public Candidat	() {}
	public Candidat(String identifiant, String nom, String prenom, String mail, String adresse, String ville,String pays) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.ville = ville;
		this.pays = pays;
	} 
	
	
	public void Read() throws SQLException {
		// TODO Auto-generated method stub
		
		sql = "Select * from Info";

		con = new Con_Data();

		Statement stat = (Statement) con.connect().createStatement();
		ResultSet ResSet = stat.executeQuery(sql);

		while (ResSet.next()) {
			System.out.println("Identifiant : " + ResSet.getString("Identifiant") 
								+ "Nom : " + ResSet.getString("Nom") 
								+ "Prenom : " + ResSet.getString("Prenom") 
								+ "Mail : " + ResSet.getString("Mail") 
								+ "Adresse : " + ResSet.getString("Adresse") 
								+ "Ville : " + ResSet.getString("Ville") 
								+ "Pays : " + ResSet.getString("Pays"));
		}
		ResSet.close();
	}
	public void Create() throws SQLException {
		// TODO Auto-generated method stub
		sql = "Insert into Info values ('1','Farouqi','khalil','khalil.farouqi','Salam','Agadir','Maroc')";
		
		con = new Con_Data();
		
		PreparedStatement ps = con.connect().prepareStatement(sql);
		ps.execute();
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
	public void Delete() throws SQLException {
		// TODO Auto-generated method stub
		
		sql = "DELETE FROM Info WHERE Identifiant = '1'";
		
		con = new Con_Data();
		
		PreparedStatement ps = con.connect().prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
}
