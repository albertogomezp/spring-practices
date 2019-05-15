package com.spring.jpa.app.models.service;

import java.util.List;

import com.spring.jpa.app.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	
	public void save(Producto producto);
	
	public Producto findOne(Integer codpro);
	
	public void delete(Integer codpro);
}
