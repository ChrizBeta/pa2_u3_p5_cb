package com.example.demo.ventas.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.ventas.repository.modelo.Cliente;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);
	public void guardar(Factura factura, Cliente cliente);
	
	public List<Factura> buscarInnerJoin(); 
	
	public List <Factura> buscarRightJoin(); 
	
	public List<Factura> buscarLeftJoin() ;
	
	public List<Factura> buscarFullJoin(); 
	
	public List<Factura> buscarWhereJoin();
	
	public List<Factura> buscarFetchJoin();
	
	
	public void modificar(Factura factura);
	public int modificarFechas(LocalDate fechaNueva, LocalDate fechaActual);
	public void borrar (Integer id);
	public int borrarPorNumero (String numero);
	
	public List<FacturaDTO> buscarFacturasDTO();
	
	public void prueba();
	
	
}
