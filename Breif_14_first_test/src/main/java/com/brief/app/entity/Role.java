package com.brief.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;

	@Column(name = "Nom")
	private String Nom;
	
	@OneToMany(mappedBy = "Role")
	private List<Users> users;

//	public Long getID() {
//		return ID;
//	}
//
//	public void setID(Long iD) {
//		ID = iD;
//	}
//
//	public String getNom() {
//		return Nom;
//	}
//
//	public void setNom(String nom) {
//		Nom = nom;
//	}
//
//	public List<Users> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<Users> users) {
//		this.users = users;
//	}
//
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//
//	public Role() {
//		super();
//	}
//
//	public Role(String nom) {
//		super();
//		Nom = nom;
//	}
//
//	public Role(String nom, List<Users> users) {
//		super();
//		Nom = nom;
//		this.users = users;
//	}
//
//	public Role(Long iD, String nom) {
//		super();
//		ID = iD;
//		Nom = nom;
//	}
//
//	public Role(Long iD, String nom, List<Users> users) {
//		super();
//		ID = iD;
//		Nom = nom;
//		this.users = users;
//	}
//
//	@Override
//	public String toString() {
//		return "Role [ID=" + ID + ", Nom=" + Nom + ", users=" + users + "]";
//	}
	
	
}
