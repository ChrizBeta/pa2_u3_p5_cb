package com.example.demo.ventas.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.repository.IFacturaRepo;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

@Service
public class FacturaServiceImpl implements IFacturaService{
	
	@Autowired
	private IFacturaRepo facturaRepo;

	@Override
	public Factura buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarPorNumero(numero);
	}

	@Override
	public void guardar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.insertar(factura);
	}

	@Override
	public List<Factura> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Factura> buscarRightJoin() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarRightJoin();
	}

	@Override
	public List<Factura> buscarLeftJoin() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarLeftJoin();
	}

	@Override
	public List<Factura> buscarFullJoin() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarFullJoin();
	}

	@Override
	public List<Factura> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarWhereJoin();
	}

	@Override
	public List<Factura> buscarFetchJoin() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarFetchJoin();
	}

	@Override
	public void modificar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.actualizar(factura);
		
	}

	@Override
	public int modificarFechas(LocalDate fechaNueva, LocalDate fechaActual) {
		// TODO Auto-generated method stub
		return this.facturaRepo.actualizarFechas(fechaNueva, fechaActual);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.facturaRepo.eliminar(id);
	}

	@Override
	public int borrarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.facturaRepo.eliminarPorNumero(numero);
		
	}

	@Override
	public List<FacturaDTO> buscarFacturasDTO() {
		// TODO Auto-generated method stub
		return this.facturaRepo.seleccionarFacturasDTO();
	}

}
