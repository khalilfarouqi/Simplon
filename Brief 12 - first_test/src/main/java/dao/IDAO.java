package dao;

import java.util.List;

public interface IDAO <T> {

	public void ajouter(T t);
	
	public void supprimer(long id);
	
	public void modifier(T t);
	
	public List<T> lister_Tous();
	
	public T lister_One(long id);
}
