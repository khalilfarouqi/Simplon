package models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table
public class Professeurs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="Nom")
	private String nom;
	@Column(name="Prenom")
	private String prenom;
	
	@OneToMany
	private List<Cours> cour;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Professeurs() {}
	
	public Professeurs(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Professeurs(long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	@Override
	public String toString() {
		return "Professeurs [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
