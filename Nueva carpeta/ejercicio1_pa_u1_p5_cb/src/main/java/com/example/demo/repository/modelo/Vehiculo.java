package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Vehiculo {

	
	private String marca;
	private String placa;
	private String modelo;
	private BigDecimal precio;
	private String tipo;

	// GET Y SET
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", precio=" + precio + ", tipo="
				+ tipo + "]";
	}

	

}
