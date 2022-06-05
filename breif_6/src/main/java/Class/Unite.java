package Class;

public class Unite {
	public int Id_Unite;
	public String Nom;
	
	
	public int getId_Unite() {
		return Id_Unite;
	}
	public void setId_Unite(int id_Unite) {
		Id_Unite = id_Unite;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	
	public Unite() {
		super();
	}
	public Unite(int id_Unite, String nom) {
		super();
		Id_Unite = id_Unite;
		Nom = nom;
	}
	
	
	@Override
	public String toString() {
		return "Unite [Id_Unite=" + Id_Unite + ", Nom=" + Nom + "]";
	}
	
	
}
