package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo{
	
	private static List<Propietario> base = new ArrayList<Propietario>();

	@Override
	public void insertar(Propietario propietario) {
		base.add(propietario);
	}	

	@Override
	public void eliminar(String identificacion) {

		Propietario pro = this.seleccionar(identificacion);
		base.remove(pro);
	}

	@Override
	public Propietario seleccionar(String identificacion) {
		for (Propietario propietario : base) {
			if (propietario.getIdentificacion().equals(identificacion)) {
				Propietario propi = new Propietario();				
				propi.setApellido(propietario.getApellido());
				propi.setFechaNacimiento(propietario.getFechaNacimiento());
				propi.setIdentificacion(propietario.getIdentificacion());
				propi.setNombre(propietario.getNombre());
				
				return propi;
			}
		}
		System.out.println("Propietario No Existe");
		return null;
	}

	@Override
	public List<Propietario> seleccionarTodos() {
		// TODO Auto-generated method stub
		return base;
	}
	
	

}
