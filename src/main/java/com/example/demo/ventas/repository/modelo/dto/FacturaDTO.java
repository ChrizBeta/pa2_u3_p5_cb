package com.example.demo.ventas.repository.modelo.dto;

import java.time.LocalDate;

public class FacturaDTO {

	private String numero;
	private LocalDate fecha;
	
	
	
	public FacturaDTO() {
		
	}

	public FacturaDTO(String numero, LocalDate fecha) {
		super();
		this.numero = numero;
		this.fecha = fecha;
	}
	
	//GET Y SET 
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "FacturaDTO [numero=" + numero + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
}
