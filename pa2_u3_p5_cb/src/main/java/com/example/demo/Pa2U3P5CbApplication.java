package com.example.demo;

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
		
		System.out.println("\n__________________________________________________ INNER JOIN __________________________________________________ ");
		
		List <Factura> lista = this.facturaService.buscarInnerJoin();
		for (Factura f: lista) {
			System.out.println(f);
		}
		
		System.out.println("\n__________________________________________________ RIGHT JOIN __________________________________________________ ");
		List <Factura> lista1= this.facturaService.buscarRightJoin();
		for (Factura f: lista1) {
			System.out.println(f);
		}
		
		System.out.println("\n__________________________________________________ LEFT JOIN __________________________________________________ ");
		List <Factura> lista2= this.facturaService.buscarLeftJoin();
		for (Factura f: lista2) {
			System.out.println(f);
		}
		
		System.out.println("\n__________________________________________________ FULL JOIN __________________________________________________ ");
		List <Factura> lista3= this.facturaService.buscarLeftJoin();
		for (Factura f: lista3) {
			System.out.println(f);
			for(DetalleFactura d: f.getDetalleFacturas()) {
				System.out.println(d);
			}
		}
		
		
		
		
	}

}
