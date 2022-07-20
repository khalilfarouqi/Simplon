package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Administrateur {
	
	@Id
	@GeneratedValue
	private Long ID;
	private String User;
	private String PassWord;
	private Long ID_Emploi;
	
	public Long getID_Emploi() {
		return ID_Emploi;
	}
	public void setID_Emploi(Long iD_Emploi) {
		ID_Emploi = iD_Emploi;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	
	public Administrateur() {}
	public Administrateur(Long iD, String user, String passWord, Long iD_Emploi) {
		super();
		ID = iD;
		User = user;
		PassWord = passWord;
		ID_Emploi = iD_Emploi;
	}
	
	@Override
	public String toString() {
		return "Administrateur [ID=" + ID + ", User=" + User + ", PassWord=" + PassWord + ", ID_Emploi=" + ID_Emploi
				+ "]";
	}
	
}
