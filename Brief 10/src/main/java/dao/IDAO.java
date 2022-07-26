package dao;

import java.util.List;

import model.Employe;

public interface IDAO <T>{
	
	public List<T> listElemts();
	public T getElemts(long id );
	public void addElemts(T t);
	public void updateElemts(T t);
	public void deleteElemts(long id);
	

}
