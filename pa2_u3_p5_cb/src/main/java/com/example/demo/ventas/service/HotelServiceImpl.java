package com.example.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repository.IHotelRepo;
import com.example.demo.ventas.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionar(id);
	}

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertar(hotel);
		
	}

	@Override
	public void modificar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.actualizar(hotel);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.eliminar(id);
		
	}

	@Override
	public Hotel buscarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarPorDireccion(direccion);
	}

	@Override
	public List<Hotel> buscarInnerJoin(String numero) {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarInnerJoin(numero);
	}

	@Override
	public List<Hotel> buscarRightJoin(String clase) {
		// TODO Auto-generated method stub
		return this.hotelRepo.seleccionarRightJoin(clase);
	}
	

}
