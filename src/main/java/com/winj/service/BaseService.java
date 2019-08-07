package com.winj.service;

import java.util.List;
import java.util.function.Function;

import io.ebean.Model;

public abstract class BaseService<T extends Model> {

	public abstract List<T> findAll(Function<List<T>, List<T>> handler);
	
	public abstract T findOne(long id, Function<T, T> handler);
	
	public abstract String insert(T entity, Function<String, String> handler);
	
	public abstract String update(T entity, Function<String, String> handler);
	
	public abstract String delete(T entity, Function<String, String> handler);
}
