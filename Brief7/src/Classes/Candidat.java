package Classes;


public class Candidat{
	
	private String identifiant; 
	private String nom; 
	private String prenom; 
	private String mail; 
	private String adresse; 
	private String ville; 
	private String pays;
	
	
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
	
	public Candidat(String identifiant) {
		this.identifiant = identifiant;
	}
	public Candidat(String identifiant, String nom, String prenom, String mail, String adresse, String ville,String pays) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.ville = ville;
		this.pays = pays;
	}
	
	@Override
	public String toString() {
		return "Candidat [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail
				+ ", adresse=" + adresse + ", ville=" + ville + ", pays=" + pays + "]";
	} 
	
	
	
}
