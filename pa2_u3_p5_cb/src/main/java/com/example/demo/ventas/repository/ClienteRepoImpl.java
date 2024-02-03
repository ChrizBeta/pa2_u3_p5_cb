package com.example.demo.ventas.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
		
	}

}
