package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepo;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.insertar(propietario);
		
	}

	@Override
	public void quitar(String identificacion) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(identificacion);
		
	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.seleccionar(identificacion);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.seleccionarTodos();
	}

}
