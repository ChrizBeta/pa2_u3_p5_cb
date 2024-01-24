package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo buscar (String placa);
	public void guardar (Vehiculo vehiculo);
	public void modificar (Vehiculo vehiculo);
	public void quitar (String placa);
	
	public List<Vehiculo> buscarTodos();

}
