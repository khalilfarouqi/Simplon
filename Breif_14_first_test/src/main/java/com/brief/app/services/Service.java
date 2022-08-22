package com.brief.app.services;

import java.util.List;

public interface Service <T> {
	
	public T lister_One(long id);
	
	public List<T> lister_Tous();
	
	public void Save(T t);
	
	public void Update(T t);
	
	public void Delete(long id);
	
}