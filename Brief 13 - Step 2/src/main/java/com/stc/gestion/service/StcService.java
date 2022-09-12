package com.stc.gestion.service;

import java.util.List;

@SuppressWarnings("hiding")
public interface StcService<T,Long> {
	
	List<T> getAll();
	T save(T object);
	T getById(long id);
	T update(T object,long id);
	void delete(long id);

}
