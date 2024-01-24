package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPacienteRepo;
import com.example.demo.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepo iPacienteRepo;

	@Override
	public void guardar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.insertar(paciente);
		
	}

	@Override
	public void modificar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepo.actualizar(paciente);
		
	}
	
	
	

}
