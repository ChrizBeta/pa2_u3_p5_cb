package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{
	
	private static List <Matricula> base = new ArrayList<Matricula>();

	@Override
	public void insertar(Matricula matricula) {
		base.add(matricula);
		
	}

	@Override
	public List<Matricula> seleccionarTodos() {
		// TODO Auto-generated method stub
		return base;
	}

	@Override
	public Matricula seleccionar(String codigo) {
		// TODO Auto-generated method stub
		for (Matricula matricula : base) {
			if (matricula.getCodigo().equals(codigo)) {
				Matricula matri = new Matricula();
				matri.setCodigo(matricula.getCodigo());
				matri.setFechaMatricula(matricula.getFechaMatricula());
				matri.setPropietario(matricula.getPropietario());
				matri.setValorMatricula(matricula.getValorMatricula());
				matri.setVehiculo(matricula.getVehiculo());
				return matri;
			}
		}
		System.out.println("Matricula No Existe");
		return null;
		
	}

}
