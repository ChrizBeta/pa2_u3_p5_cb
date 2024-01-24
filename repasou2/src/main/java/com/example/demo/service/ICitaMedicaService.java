package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
	
	public void guardar (CitaMedica citamedica);
	
	public void agendarCita(String numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);

}
