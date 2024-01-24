package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface IDoctorService {
	
	public void guardar (Doctor doctor);
	public Doctor buscar (Integer id);
	public void quitar (Integer id);
	public void modificar (Doctor doctor);
	
	

}
