package com.ival.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ival.app.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}