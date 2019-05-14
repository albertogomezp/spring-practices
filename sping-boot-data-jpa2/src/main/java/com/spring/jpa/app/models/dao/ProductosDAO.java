package com.spring.jpa.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.app.models.entity.Producto;

@Repository("IProductoDAO")
public class ProductosDAO implements IProductosDAO {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> findAll() {

		return em.createQuery("from Producto").getResultList();
	}

	/**
	 * inserta un producto
	 * 
	 * @param producto
	 */
	@Override
	@Transactional
	public void save(Producto producto) {
		if (producto.getCodPro() != null && producto.getCodPro() > 0) {
			em.merge(producto);
		} else {
			em.persist(producto);
		}

	}

	/**
	 * Busca un producto por ID
	 * 
	 * @param id id del producto
	 */
	@Override
	public Producto findOne(Integer CodPro) {
		return em.find(Producto.class, CodPro);
	}

	@Override
	public void delete(Integer codPro) {
		em.remove(findOne(codPro));

	}

}
