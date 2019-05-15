package com.spring.jpa.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.app.models.dao.IProductosDAO;
import com.spring.jpa.app.models.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductosDAO productosDAO;
	
	@Transactional(readOnly = true)
	public List<Producto> findAll(){
		return productosDAO.findAll();
	}
	
	@Override
	@Transactional
	public void save(Producto producto) {
		productosDAO.save(producto);
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findOne(Integer codpro) {
		return productosDAO.findOne(codpro);
	}
	@Override
	@Transactional
	public void delete(Integer codpro) {
		productosDAO.delete(codpro);
	}
	
}
