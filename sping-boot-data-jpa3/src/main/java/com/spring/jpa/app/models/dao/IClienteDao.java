package com.spring.jpa.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.app.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{


}
