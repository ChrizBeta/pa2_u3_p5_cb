package com.example.demo.ventas.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.ventas.repository.IClienteRepo;
import com.example.demo.ventas.repository.modelo.Cliente;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;

	@Transactional(value = TxType.REQUIRES_NEW)
	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Nombre hilo: " + Thread.currentThread().getName());
		try {

			this.clienteRepo.insertar(cliente);
			TimeUnit.SECONDS.sleep(1);


		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}

	@Override
	@Transactional(value = TxType.SUPPORTS)
	public void pruebaSupports() {
		// TODO Auto-generated method stub

		System.out.println("Este es un metodo Supports");
		System.out.println("Prueba Supports: " + TransactionSynchronizationManager.isActualTransactionActive());

	}

	@Override
	@Transactional(value = TxType.NEVER)
	public void pruebaNever() {
		// TODO Auto-generated method stub
		System.out.println("Este es un metodo Never");
		System.out.println("Prueba Never: " + TransactionSynchronizationManager.isActualTransactionActive());

	}

}
