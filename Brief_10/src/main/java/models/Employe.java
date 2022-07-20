package models;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {
	
	@Id
	@GeneratedValue
	private long ID;
	private String FirstName;
	private String LastName;
	private int Salaire;
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
	
	public int getSalaire() {
		return Salaire;
	}
	public void setSalaire(int salaire) {
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
	public Employe(long iD, String firstName, String lastName, int salaire, String role, String typeContrat) {
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
