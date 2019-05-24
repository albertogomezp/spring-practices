package com.ival.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ival.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
