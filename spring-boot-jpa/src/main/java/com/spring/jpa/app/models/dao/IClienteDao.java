package com.spring.jpa.app.models.dao;

import java.util.List;

import com.spring.jpa.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
}
