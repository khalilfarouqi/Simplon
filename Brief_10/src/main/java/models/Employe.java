package models;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table
public class Employe {
	
	@Id
	@GeneratedValue
	private long ID;
	private String FirstName;
	private String LastName;
	private Double Salaire;
	private String Role;
	private String TypeContrat;
	 
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public Double getSalaire() {
		return Salaire;
	}
	public void setSalaire(Double salaire) {
		Salaire = salaire;
	}
	
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	public String getTypeContrat() {
		return TypeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		TypeContrat = typeContrat;
	}
	
	public Employe() {}
	public Employe(long iD, String firstName, String lastName, Double salaire, String role, String typeContrat) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		Salaire = salaire;
		Role = role;
		TypeContrat = typeContrat;
	}
	
	@Override
	public String toString() {
		return "Employe [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Salaire=" + Salaire
				+ ", Role=" + Role + ", TypeContrat=" + TypeContrat + "]";
	}
	 
	

}
