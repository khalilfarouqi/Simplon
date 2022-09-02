package Class;

public class Produits {
	
	public int Id_Produit;
	public int Code;
	public String Nom;
	public int Qte_Stock;
	public int Prix_Uniter;
	public int id_categories;
	public int id_unite;
	
	
	public int getId_Produit() {
		return Id_Produit;
	}
	public void setId_Produit(int id_Produit) {
		Id_Produit = id_Produit;
	}
	
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public int getQte_Stock() {
		return Qte_Stock;
	}
	public void setQte_Stock(int qte_Stock) {
		Qte_Stock = qte_Stock;
	}
	
	public int getPrix_Uniter() {
		return Prix_Uniter;
	}
	public void setPrix_Uniter(int prix_Uniter) {
		Prix_Uniter = prix_Uniter;
	}
	public int getId_categories() {
		return id_categories;
	}
	public void setId_categories(int id_categories) {
		this.id_categories = id_categories;
	}
	public int getId_unite() {
		return id_unite;
	}
	public void setId_unite(int id_unite) {
		this.id_unite = id_unite;
	}
	
	
	public Produits() {
		super();
	}
	public Produits(int id_Produit, int code, String nom, int qte_Stock, int prix_Uniter, int id_categories,
			int id_unite) {
		super();
		Id_Produit = id_Produit;
		Code = code;
		Nom = nom;
		Qte_Stock = qte_Stock;
		Prix_Uniter = prix_Uniter;
		this.id_categories = id_categories;
		this.id_unite = id_unite;
	}
	@Override
	public String toString() {
		return "Produits [Id_Produit=" + Id_Produit + ", Code=" + Code + ", Nom=" + Nom + ", Qte_Stock=" + Qte_Stock
				+ ", Prix_Uniter=" + Prix_Uniter + ", id_categories=" + id_categories + ", id_unite=" + id_unite + "]";
	}
	
	
	

}
