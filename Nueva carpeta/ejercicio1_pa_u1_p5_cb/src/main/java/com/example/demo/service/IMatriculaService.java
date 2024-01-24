package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaService {
	public void guardar (Matricula matricula);
	public Matricula buscar (String codigo);
	public List <Matricula> buscarTodos();
	public void registrar (String identificacion, String placa);
	


}
