package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.Habitacion;
import com.example.demo.ventas.repository.modelo.Hotel;
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
				"\n__________________________________________________ INNER JOIN __________________________________________________ ");
		List<Hotel> lista = this.hotelService.buscarInnerJoin("A1");
		for (Hotel h : lista) {
			System.out.println(h);
		}

		System.out.println(
				"\n__________________________________________________ RIGHT JOIN __________________________________________________ ");
		List<Hotel> lista1 = this.hotelService.buscarRightJoin("Economica");
		for (Hotel h : lista1) {
			System.out.println(h);
		}

		System.out.println(
				"\n__________________________________________________ LEFT JOIN __________________________________________________ ");
		List<Habitacion> lista2 = this.habitacionService.buscarLeftJoin("Hilton Colon");
		for (Habitacion ha : lista2) {
			System.out.println(ha);
		}

		System.out.println(
				"\n__________________________________________________ FULL JOIN __________________________________________________ ");
		List<Habitacion> lista3 = this.habitacionService.buscarFullJoin("Av. Colon");
		for (Habitacion ha : lista3) {
			System.out.println(ha);
		}

	}

}
