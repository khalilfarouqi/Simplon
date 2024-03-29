package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table
public class Etudiant implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="Nom")
	private String nom;
	@Column(name="Prenom")
	private String prenom;
	
	@ManyToMany
	@JoinTable(
			  name = "cours_etudiant", 
			  joinColumns = @JoinColumn(name = "etudiant_id"), 
			  inverseJoinColumns = @JoinColumn(name = "cours_id"))
    private List<Cours> cours;
	
	
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
	
	
	public Etudiant() {
		super();
	}
	
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Etudiant(String nom, String prenom, List<Cours> cours) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cours = cours;
	}
	public Etudiant(long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
