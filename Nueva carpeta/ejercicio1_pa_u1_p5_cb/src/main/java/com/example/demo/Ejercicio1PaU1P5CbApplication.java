package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.IMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class Ejercicio1PaU1P5CbApplication implements CommandLineRunner{
	
	
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1PaU1P5CbApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
	
		Vehiculo vehi = new Vehiculo();		
		vehi.setMarca("Kia");
		vehi.setModelo("Sportage");
		vehi.setPlaca("PCK6693");
		vehi.setPrecio(new BigDecimal(25000));
		vehi.setTipo("manual");
		this.iVehiculoService.guardar(vehi);		
		System.out.println(this.iVehiculoService.buscar("PCK6693"));
		
		vehi.setModelo("Picanto");
		vehi.setPlaca("PFG6799");
		this.iVehiculoService.modificar(vehi);
		System.out.println(this.iVehiculoService.buscar("PFG6799"));
		
		Propietario pro = new Propietario();
		pro.setApellido("Betancourt");		
		pro.setFechaNacimiento(LocalDate.of(2000, 5, 15));
		pro.setIdentificacion("1722781000");
		pro.setNombre("Christian");
		this.iPropietarioService.guardar(pro);
		System.out.println(this.iPropietarioService.buscar("1722781000"));
		
		
		this.iMatriculaService.registrar("1722781000", "PFG6799");
		System.out.println(this.iMatriculaService.buscar("Matri1"));
		
		
		
		
	}

}
