package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Hotel;

public interface IHotelService {

	public Hotel buscar (Integer id);
	public void guardar (Hotel hotel);
	public void modificar (Hotel hotel);
	public void borrar (Integer id);	
	
	public Hotel buscarPorDireccion (String direccion);
	
	public List <Hotel> buscarInnerJoin(String numero);
	public List <Hotel> buscarRightJoin(String clase);
	
}
