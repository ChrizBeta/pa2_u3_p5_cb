package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioRepo {
	
	public void insertar (Propietario propietario);
	public void eliminar (String identificacion);
	public Propietario seleccionar (String identificacion);
	
	public List<Propietario> seleccionarTodos();

}
