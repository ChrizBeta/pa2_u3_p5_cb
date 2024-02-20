package com.example.demo.ventas.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Habitacion;
import com.example.demo.ventas.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Habitacion seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
		
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		Habitacion habitacion = this.seleccionar(id);
		
		this.entityManager.remove(habitacion);
		
	}

	@Override
	public Habitacion seleccionarPorClase(String clase) {
		Query myQuery= this.entityManager.createNativeQuery("Select * From habitacion h Where h.habi_clase = :clase",Habitacion.class);
		myQuery.setParameter("clase", clase);
		return (Habitacion) myQuery.getSingleResult();
	}

	@Override
	public List<Habitacion> seleccionarLeftJoin(String nombre) {
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery("Select h From Habitacion h Left Join h.hotel o Where o.nombre =:nombre",
				Habitacion.class);
		myQuery.setParameter("nombre", nombre);

		List<Habitacion> lista = myQuery.getResultList();
		for (Habitacion f : lista) {
			f.getHotel();
		}

		return lista;
	}

	@Override
	public List<Habitacion> seleccionarFullJoin(String direccion) {
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery("Select h From Habitacion h Full Join h.hotel o Where o.direccion =:direccion",
				Habitacion.class);
		myQuery.setParameter("direccion", direccion);

		List<Habitacion> lista = myQuery.getResultList();
		for (Habitacion f : lista) {
			f.getHotel();
		}

		return lista;
	}
	
	

}
