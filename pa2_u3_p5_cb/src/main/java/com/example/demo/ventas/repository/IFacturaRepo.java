package com.example.demo.ventas.repository;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaRepo {

	public Factura seleccionarPorNumero(String numero);
	public void insertar(Factura factura);
	
	public List <Factura> seleccionarInnerJoin();
	
	public List <Factura> seleccionarRightJoin();
	
	public List <Factura> seleccionarLeftJoin();
	
	public List <Factura> seleccionarFullJoin();
	
	public List <Factura> seleccionarWhereJoin();
	
	public List <Factura> seleccionarFetchJoin();
	
}
