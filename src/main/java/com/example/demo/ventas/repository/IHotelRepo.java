package com.example.demo.ventas.repository;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Hotel;

public interface IHotelRepo {

	public Hotel seleccionar (Integer id);
	public void insertar (Hotel hotel);
	public void actualizar (Hotel hotel);
	public void eliminar (Integer id);		
	
	public Hotel seleccionarPorDireccion (String direccion);
	
	public List <Hotel> seleccionarInnerJoin(String numero);
	public List <Hotel> seleccionarRightJoin(String clase);
	
	
}
