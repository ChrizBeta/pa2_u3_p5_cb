package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	
	
	private static List<Vehiculo> base = new ArrayList<Vehiculo>();

	@Override
	public Vehiculo seleccionar(String placa) {
		for (Vehiculo vehiculo : base) {
			if (vehiculo.getPlaca().equals(placa)) {
				Vehiculo vehi = new Vehiculo();
				vehi.setMarca(vehiculo.getMarca());
				vehi.setModelo(vehiculo.getModelo());
				vehi.setPlaca(vehiculo.getPlaca());
				vehi.setPrecio(vehiculo.getPrecio());
				vehi.setTipo(vehiculo.getTipo());
				return vehi;
			}
		}
		System.out.println("Vehiculo No Existe");
		return null;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		base.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);

	}

	@Override
	public void eliminar(String placa) {

		Vehiculo vehi = this.seleccionar(placa);
		base.remove(vehi);
	}

	@Override
	public List<Vehiculo> seleccionarTodos() {
		return base;
	}

}
