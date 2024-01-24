package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDoctorRepo;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public void guardar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.insertar(doctor);
		
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepo.seleccionar(id);
	}

	@Override
	public void quitar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepo.eliminar(id);
		
	}

	@Override
	public void modificar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.actualizar(doctor);
		
	}
	
	

}
