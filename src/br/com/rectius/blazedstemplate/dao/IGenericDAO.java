package br.com.rectius.blazedstemplate.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public interface IGenericDAO<T> {
	
	@Transactional
	public List<T> findAll();
	
	@Transactional
	public List<T> findByName(String name);
	
	@Transactional
	public T findById(int id);
	
	@Transactional
	public T create(T item);
	
	@Transactional
	public boolean update(T item);
	
	@Transactional
	public boolean remove(T item);

}
