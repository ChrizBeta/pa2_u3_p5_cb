package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.Cliente;
import com.example.demo.ventas.service.IClienteService;
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

	@Autowired
	private IClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5CbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		System.out.println("Nombre hilo: " + Thread.currentThread().getName());
//		long tiempoInicial = System.currentTimeMillis();
//		for (int i = 1; i <= 10; i++) {
//			Cliente cliente = new Cliente();
//			cliente.setApellido("B " + i);
//			cliente.setNombre("C " + i);
//			this.clienteService.guardar(cliente);
//		}
//		long tiempoFinal = System.currentTimeMillis();
//
//		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
//		System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido + " segundos");



//		System.out.println("Nombre hilo: " + Thread.currentThread().getName());
//		long tiempoInicial = System.currentTimeMillis();
//		List<Cliente> listaCliente = new ArrayList<>();
//		for (int i = 1; i <= 100; i++) {
//			Cliente cliente = new Cliente();
//			cliente.setApellido("B " + i);
//			cliente.setNombre("C " + i);
//			listaCliente.add(cliente);
//		}
//
//		listaCliente.stream().forEach(cliente -> this.clienteService.guardar(cliente));
//		long tiempoFinal = System.currentTimeMillis();
//		long tiempoTranscurrido = (tiempoFinal - tiempoInicial) / 1000;
//		System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido + " segundos");
//	

		
		
		System.out.println("Nombre de Hilo: " + Thread.currentThread().getName());
		long tiempoInicial = System.currentTimeMillis();
		List<Cliente> listaCliente = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			Cliente cliente = new Cliente();
			cliente.setNombre("CN " + i);
			cliente.setApellido("CA " + i);
			listaCliente.add(cliente);

		}
		listaCliente.parallelStream().forEach(cliente -> this.clienteService.guardar(cliente));
		long tiempoFinal = System.currentTimeMillis();
		long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
		System.out.println("Tiempo transcurrido en segundos " + tiempoTotal);

		
		
		
	}

}
