package Class;

public class Categories {
	
	public int Id_Categories;
	public String Nom;
	
	
	public int getId_Categories() {
		return Id_Categories;
	}
	public void setId_Categories(int id_Categories) {
		Id_Categories = id_Categories;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	
	public Categories() {
		super();
	}
	public Categories(int id_Categories, String nom) {
		super();
		Id_Categories = id_Categories;
		Nom = nom;
	}
	
	@Override
	public String toString() {
		return "Categories [Id_Categories=" + Id_Categories + ", Nom=" + Nom + "]";
	} 
	
	
}
