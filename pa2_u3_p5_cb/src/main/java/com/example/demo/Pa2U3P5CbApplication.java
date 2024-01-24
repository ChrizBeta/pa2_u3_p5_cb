package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.DetalleFactura;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5CbApplication implements CommandLineRunner{

	
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Factura fact = new Factura();
		fact.setCedula("1722781000");
		fact.setFecha(LocalDate.now());
		fact.setNumero("0001-022-1022");
		
		DetalleFactura det1 = new DetalleFactura();
		det1.setCantidad(4);
		det1.setCodigoBarras("123456");
		det1.setFactura(fact);
		det1.setNombreProducto("CocaCola");
		
		DetalleFactura det2 = new DetalleFactura();
		det2.setCantidad(2);
		det2.setCodigoBarras("875421");
		det2.setFactura(fact);
		det2.setNombreProducto("Leche Vita");
		
		List<DetalleFactura> lista = new ArrayList<>();
		lista.add(det1);
		lista.add(det2);
		
		fact.setDetalleFacturas(lista);
		
		//this.facturaService.guardar(fact);
		
		Factura fac = this.facturaService.buscarPorNumero("0001-022-1022");
		System.out.println(fac);
	}

}
