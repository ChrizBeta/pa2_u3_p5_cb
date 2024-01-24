package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica citamedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citamedica);
		
	}
	
	

}
