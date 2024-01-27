package com.example.demo.ventas.service;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaService {

	public Factura buscarPorNumero(String numero);
	public void guardar(Factura factura);
	
	public List<Factura> buscarInnerJoin(); 
	
	public List <Factura> buscarRightJoin(); 
	
	public List<Factura> buscarLeftJoin() ;
	
	public List<Factura> buscarFullJoin(); 
	
}
