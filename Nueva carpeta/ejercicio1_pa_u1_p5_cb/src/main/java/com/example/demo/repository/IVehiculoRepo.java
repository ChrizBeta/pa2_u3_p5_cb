package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	
	public Vehiculo seleccionar (String placa);
	public void insertar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public void eliminar (String placa);
	
	public List<Vehiculo> seleccionarTodos();

}
