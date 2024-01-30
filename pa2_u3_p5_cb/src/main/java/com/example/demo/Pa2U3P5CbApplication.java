package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.service.IFacturaService;
import com.example.demo.ventas.service.IHabitacionService;
import com.example.demo.ventas.service.IHotelService;

@SpringBootApplication
public class Pa2U3P5CbApplication implements CommandLineRunner {

	@Autowired
	private IFacturaService facturaService;

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(
				"\n__________________________________________________ WHERE JOIN __________________________________________________ ");

		List<Factura> lista = this.facturaService.buscarWhereJoin();
		for (Factura f : lista) {
			System.out.println(f);
		}
		
		
		System.out.println(
				"\n__________________________________________________ INNER JOIN __________________________________________________ ");

		List<Factura> lista2 = this.facturaService.buscarInnerJoin();

		for (Factura f : lista2) {
			System.out.println(f.getNumero());
		}
		
		System.out.println(
				"\n__________________________________________________ FETCH JOIN __________________________________________________ ");
		
		List<Factura> lista3 = this.facturaService.buscarFetchJoin();

		for (Factura f : lista3) {
			System.out.println(f.getNumero());
		}


	}

}
