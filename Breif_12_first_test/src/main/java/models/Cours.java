package models;

import java.io.Serializable;
import java.time.LocalDate;

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

	public Cours(long id, LocalDate dateCours, String descripton) {
		super();
		this.id = id;
		this.dateCours = dateCours;
		this.descripton = descripton;
	}

	@Override
	public String toString() {
		return "Cours [id=" + id + ", dateCours=" + dateCours + ", descripton=" + descripton + "]";
	}
	
	
}
