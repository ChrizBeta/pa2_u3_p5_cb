package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.ventas.repository.modelo.Cliente;
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
				"\n------------------------------------------- TRANSACCIONES -------------------------------------------");

		this.facturaService.pruebaNever();
	}

}
