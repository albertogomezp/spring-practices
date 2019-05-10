package com.spring.jpa.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.app.models.entity.Cliente;


@Repository("IClienteDaoJPA")
public class ClienteDaoImpl implements IClienteDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Cliente> findAll() {

		return em.createQuery("from Cliente").getResultList();
	}
	
	/**
	 * inserta un cliente
	 * @param cliente
	 */
	@Override
	@Transactional
	public void save(Cliente cliente) {
			if(cliente.getId() !=null && cliente.getId()>0) {
				em.merge(cliente);
			} else {
				em.persist(cliente);
			}
		
	}

	/**
	 * Busca un usuario por ID
	 * @param id id del usuario
	 */
	@Override
	@Transactional(readOnly=true)
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		
		em.remove(findOne(id));
		
	}

}
