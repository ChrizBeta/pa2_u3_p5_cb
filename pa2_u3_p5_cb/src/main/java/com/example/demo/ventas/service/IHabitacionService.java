package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Habitacion;

public interface IHabitacionService {
	
	public Habitacion buscar (Integer id);
	public void guardar (Habitacion habitacion);
	public void modificaar (Habitacion habitacion);
	public void borrar (Integer id);	
	
	public Habitacion buscarPorClase (String clase);
	
	public List<Habitacion> buscarLeftJoin(String nombre);
	public List<Habitacion> buscarFullJoin(String direccion);

}
