package com.example.demo.ventas.service;

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

		try {

			this.clienteRepo.insertar(cliente);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}

	}

}
