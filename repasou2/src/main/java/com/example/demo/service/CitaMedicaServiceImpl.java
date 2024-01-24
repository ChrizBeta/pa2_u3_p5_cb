package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ICitaMedicaRepo;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;

	@Override
	public void guardar(CitaMedica citamedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.insertar(citamedica);
		
	}

	@Override
	public void agendarCita(String numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		
		CitaMedica cime= new CitaMedica();
		cime.setNumeroCita(numeroCita);
		cime.setFechaCita(fechaCita);
		cime.setValorCita(valorCita);
		cime.setLugarCita(lugarCita);
		//cime.setDoctor(cedulaDoctor);
	//	cime.setPaciente(cedulaPaciente);
		
		this.citaMedicaRepo.insertar(cime);
		
	}
	
	
	
	

}
