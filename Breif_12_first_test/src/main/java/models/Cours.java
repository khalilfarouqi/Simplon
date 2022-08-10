package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;

@Entity
@Table
public class Cours implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="DateCours")
	private LocalDate dateCours;
	@Column(name="Descripton")
	private String descripton;
	
	@OneToOne
	private Professeurs prof;
	
	@ManyToMany
	@JoinTable(
			  name = "cours_etudiant", 
			  joinColumns = @JoinColumn(name = "etudiant_id"), 
			  inverseJoinColumns = @JoinColumn(name = "cours_id"))
    private List<Etudiant> etudianrt;
	

	public Professeurs getProf() {
		return prof;
	}

	public void setProf(Professeurs prof) {
		this.prof = prof;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDateCours() {
		return dateCours;
	}

	public void setDateCours(LocalDate dateCours) {
		this.dateCours = dateCours;
	}

	public String getDescripton() {
		return descripton;
	}

	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cours() {
		super();
	}

	public Cours(long id, String dateCours, String descripton) {
		super();
		this.id = id;
		this.dateCours = LocalDate.parse(dateCours);
		this.descripton = descripton;
	}

	public Cours(long id, LocalDate dateCours, String descripton, Professeurs prof) {
		super();
		this.id = id;
		this.dateCours = dateCours;
		this.descripton = descripton;
		this.prof = prof;
	}

	@Override
	public String toString() {
		return "Cours [id=" + id + ", dateCours=" + dateCours + ", descripton=" + descripton + ", prof=" + prof + "]";
	}
	
	
	
}
