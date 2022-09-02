import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employes {
	
	private String Noms, Prenom;
	private LocalDate Date_de_naissance;
	private Double Salaire_Emp;
	
	
	public String getNoms() {
		return Noms;
	}
	public void setNoms(String noms) {
		this.Noms = noms;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}
	
	public LocalDate getDate_de_naissance() {
		return Date_de_naissance;
	}
	public void setDate_de_naissance(LocalDate date_de_naissance) {
		this.Date_de_naissance = date_de_naissance;
	}

	public Double getSalaire_Emp() {
		return Salaire_Emp;
	}
	public void setSalaire_Emp(Double salaire_Emp) {
		Salaire_Emp = salaire_Emp;
	}
	
	
	public Employes() {}
	public Employes(String noms, String prenom, LocalDate date_de_naissance) {
		super();
		Noms = noms;
		Prenom = prenom;
		Date_de_naissance = date_de_naissance;
	}
	public Employes(String noms, String prenom, LocalDate date_de_naissance, Double salaire_Emp) {
		Noms = noms;
		Prenom = prenom;
		Date_de_naissance = date_de_naissance;
		Salaire_Emp = salaire_Emp;
	}
	
	
	public void calculer_salaire() {
		
	}
	
	
	public int Age() {
		return LocalDateTime.now().getYear() - Date_de_naissance.getYear();
	}
	
	
	@Override
	public String toString() {
		return "Employes [Noms=" + Noms + ", Prenom=" + Prenom + ", Date_de_naissance=" + Date_de_naissance + ", Salaire_Emp=" + Salaire_Emp + "]";
	}
	
	

}
