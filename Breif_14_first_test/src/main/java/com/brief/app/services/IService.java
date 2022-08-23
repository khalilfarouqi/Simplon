package com.brief.app.services;

import java.util.List;

public interface IService <T> {
	
	public T lister_One(long id);
	
	public List<T> lister_Tous();
	
	public T Save(T t);
	
	public T Update(T t);
	
	public void Delete(long id);
	
}