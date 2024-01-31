package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;
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
				"\n------------------------------------------- UPDATE -------------------------------------------");

		
		int cantidad = this.facturaService.modificarFechas(LocalDate.of(2020, 1, 15), LocalDate.of(2024, 1, 20));
		System.out.println("Cantidad de registros actualizados");
		System.out.println(cantidad);

		
		System.out.println(
				"\n------------------------------------------- DELETE -------------------------------------------");
		int cantidad2 =this.facturaService.borrarPorNumero("001-001-001-001");
		System.out.println("Cantidad de registros eliminados");
		System.out.println(cantidad2);
		
		System.out.println(
				"\n------------------------------------------- DTO -------------------------------------------");
		List<FacturaDTO> listaDTO = this.facturaService.buscarFacturasDTO();
		for (FacturaDTO fdto : listaDTO) {
			System.out.println(fdto);
		}
		System.out.println("");


	}

}
