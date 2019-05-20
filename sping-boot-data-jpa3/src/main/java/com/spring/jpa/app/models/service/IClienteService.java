package com.spring.jpa.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.spring.jpa.app.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	// Un page tambien es un iterable como list
	public Page<Cliente> findAll(Pageable pageable );

	public void save(Cliente cliente);
	
	public Cliente findOne(Long id);
	
	public void delete(Long id);
}
