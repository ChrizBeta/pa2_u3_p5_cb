package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioService {

	public void guardar (Propietario propietario);
	public void quitar (String identificacion);
	public Propietario buscar (String identificacion);
	
	public List<Propietario> buscarTodos();

	
}
