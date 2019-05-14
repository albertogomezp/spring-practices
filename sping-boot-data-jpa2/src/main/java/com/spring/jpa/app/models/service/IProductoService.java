package com.spring.jpa.app.models.service;

import java.util.List;

import com.spring.jpa.app.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	
	public void save(Producto cliente);
	
	public Producto findOne(Long id);
	
	public void delete(Long id);
}
