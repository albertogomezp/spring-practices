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
	private IProductosDAO clienteDAO;
	
	@Transactional(readOnly = true)
	public List<Producto> findAll(){
		return clienteDAO.findAll();
	}
	
	@Override
	@Transactional
	public void save(Producto cliente) {
		clienteDAO.save(cliente);
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findOne(Long id) {
		return clienteDAO.findOne(id);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		clienteDAO.delete(id);
	}
	
}
