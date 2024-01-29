package com.example.demo.ventas.repository;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Habitacion;

public interface IHabitacionRepo {

	public Habitacion seleccionar(Integer id);

	public void insertar(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public void eliminar(Integer id);

	public Habitacion seleccionarPorClase(String clase);

	public List<Habitacion> seleccionarLeftJoin(String nombre);
	public List<Habitacion> seleccionarFullJoin(String direccion);
}
