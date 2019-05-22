package com.spring.jpa.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.app.models.dao.IClienteDao;
import com.spring.jpa.app.models.entity.Cliente;


@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDAO;
	
	@Transactional(readOnly = true)
	public List<Cliente> findAll(){
		return clienteDAO.findAll();
	}
	
	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDAO.save(cliente);
	}
	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		return clienteDAO.findOne(id);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		clienteDAO.delete(id);
	}
	
}
