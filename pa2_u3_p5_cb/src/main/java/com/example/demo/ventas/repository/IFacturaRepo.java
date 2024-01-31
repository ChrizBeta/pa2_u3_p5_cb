package com.example.demo.ventas.repository;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaRepo {

	public Factura seleccionarPorNumero(String numero);
	public void insertar(Factura factura);
	
	public void actualizar(Factura factura);
	public int actualizarFechas(LocalDate fechaNueva, LocalDate fechaActual);
	public void eliminar (Integer id);
	public int eliminarPorNumero (String numero);
	
	public List <Factura> seleccionarInnerJoin();
	
	public List <Factura> seleccionarRightJoin();
	
	public List <Factura> seleccionarLeftJoin();
	
	public List <Factura> seleccionarFullJoin();
	
	public List <Factura> seleccionarWhereJoin();
	
	public List <Factura> seleccionarFetchJoin();
	
	public List <FacturaDTO> seleccionarFacturasDTO();
	
}
