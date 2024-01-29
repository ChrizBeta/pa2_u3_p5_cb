package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repository.IHabitacionRepo;
import com.example.demo.ventas.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService{
	
	@Autowired
	private IHabitacionRepo habitacionRepo;

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.seleccionar(id);
	}

	@Override
	public void guardar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.insertar(habitacion);
		
	}

	@Override
	public void modificaar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.actualizar(habitacion);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepo.eliminar(id);
		
	}

	@Override
	public Habitacion buscarPorClase(String clase) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.seleccionarPorClase(clase);
	}

	@Override
	public List<Habitacion> buscarLeftJoin(String nombre) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.seleccionarLeftJoin(nombre);
	}

	@Override
	public List<Habitacion> buscarFullJoin(String direccion) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.seleccionarFullJoin(direccion);
	}
	
	

}
