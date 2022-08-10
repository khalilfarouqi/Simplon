package dao;

public interface IDAO <T> {

	public void ajouter(T t);
	
	public void supprimer(T t);
	
	public void modifier(T t);
	
	public void lister_Tous(T t);
	
	public void lister_One(T t);
}
