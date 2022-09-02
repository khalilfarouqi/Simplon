import java.time.LocalDate;

public class EmployeHoraire extends Employes {
	
	private Double taux_horaire, heures_prestées;
	int min_heures;

	
	public Double getTaux_horaire() {
		return taux_horaire;
	}
	public void setTaux_horaire(Double taux_horaire) {
		this.taux_horaire = taux_horaire;
	}

	public Double getHeures_prestées() {
		return heures_prestées;
	}
	public void setHeures_prestées(Double heures_prestées) {
		this.heures_prestées = heures_prestées;
	}

	
	public EmployeHoraire() {}
	public EmployeHoraire(Double taux_horaire, Double heures_prestées) {
		this.taux_horaire = taux_horaire;
		this.heures_prestées = heures_prestées;
	}
	public EmployeHoraire(String Noms, String Prenom, LocalDate Date_de_naissance, Double taux_horaire, Double heures_prestées,int min_heures) {
		super(Noms, Prenom, Date_de_naissance);
		this.taux_horaire = taux_horaire;
		this.heures_prestées = heures_prestées;
		this.min_heures = min_heures;
	}
	
	
	public void calculer_salaire() {
		if (heures_prestées > min_heures) super.setSalaire_Emp((min_heures * taux_horaire) + ((heures_prestées - min_heures) * (taux_horaire * 1.5)));
		else super.setSalaire_Emp(taux_horaire * heures_prestées);
	}
	
	
	@Override
	public String toString() {
		calculer_salaire();
		return super.toString();
	}
	

}
