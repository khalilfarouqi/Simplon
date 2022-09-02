import java.time.LocalDate;

public class EmployeFixe extends Employes {
	
	private Double Saliare;
	
	
	public Double getSaliare() {
		return Saliare;
	}
	public void setSaliare(Double saliare) {
		this.Saliare = saliare;
	}
	
	
	public EmployeFixe() {}
	public EmployeFixe(Double Saliare) {
		this.Saliare = Saliare;
	}
	public EmployeFixe(Double Saliare, String Noms ,String Prenom ,LocalDate Date_de_naissance) {
		super(Noms, Prenom, Date_de_naissance);
		this.Saliare = Saliare;
	}

	
	public void calculer_salaire() {
		super.setSalaire_Emp(Saliare);
	}
	
	
	@Override
	public String toString() {
		calculer_salaire();
		return super.toString();
	}
	
	
}
