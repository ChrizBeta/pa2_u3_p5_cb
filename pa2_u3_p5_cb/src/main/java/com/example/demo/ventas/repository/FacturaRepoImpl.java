package com.example.demo.ventas.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.repository.modelo.dto.FacturaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Factura seleccionarPorNumero(String numero) {

		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f Where f.numero = :numero",
				Factura.class);
		myQuery.setParameter("numero", numero);
		Factura fact = myQuery.getSingleResult();
		fact.getDetalleFacturas().size();
		return fact;
	}

	@Override
	
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(factura);
	}

	@Override
	public List<Factura> seleccionarInnerJoin() {

		// SQL: Select * From factura f inner join detalle factura d on
		// f.fact_id=d.deta_id_factura
		// JPQL: Select f From Factura f Inner Join f.detalleFactura d

		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f Join f.detalleFacturas d",
				Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarRightJoin() {
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f Right Join f.detalleFacturas d",
				Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarLeftJoin() {
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f Left Join f.detalleFacturas d",
				Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarFullJoin() {
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("Select f From Factura f full Join f.detalleFacturas d",
				Factura.class);

		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}

		return lista;
	}

	@Override
	public List<Factura> seleccionarWhereJoin() {
		
		// JPQL: SELECT f FROM Factura f, DetalleFactura d WHERE f.id = d.factura.id 
		
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("SELECT f FROM Factura f, DetalleFactura d WHERE f = d.factura", Factura.class);
		
		List<Factura> lista = myQuery.getResultList();
		for (Factura f : lista) {
			f.getDetalleFacturas().size();
		}
	
		
		return lista;
	}

	@Override
	public List<Factura> seleccionarFetchJoin() {
		
		//JPQL: SELECT f FROM Factura f JOIN FETCH f.detalleFactura d
		
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("SELECT f FROM Factura f JOIN FETCH f.detalleFacturas d",Factura.class);
		
		
		return myQuery.getResultList();
	}

	
	
	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.merge(factura);
		
	}

	@Override
	public int actualizarFechas(LocalDate fechaNueva, LocalDate fechaActual) {
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createQuery("UPDATE Factura f SET f.fecha = :fechaNueva WHERE f.fecha >= :fechaActual");
		myQuery.setParameter("fechaNueva", fechaNueva);
		myQuery.setParameter("fechaActual", fechaActual);		
		return myQuery.executeUpdate();		
	}
	
	public Factura seleccionar (Integer id) {	
		return this.entityManager.find(Factura.class, id);
	}

	@Override
	public void eliminar(Integer id) {		
		Factura fact = this.seleccionar(id);
		this.entityManager.remove(fact);
		
	}

	@Override
	public int eliminarPorNumero(String numero) {
		
		//DELETE FROM Factura f WHERE f.numero = :numero  
		// TODO Auto-generated method stub
		
		Query myQuery = this.entityManager.createQuery("DELETE FROM Factura f WHERE f.numero = :numero ");
		myQuery.setParameter("numero", numero);
		return myQuery.executeUpdate();
		
	}

	@Override
	public List<FacturaDTO> seleccionarFacturasDTO() {
		// TODO Auto-generated method stub
		TypedQuery<FacturaDTO> myQuery = this.entityManager.createQuery("SELECT NEW com.example.demo.ventas.repository.modelo.dto.FacturaDTO(f.numero, f.fecha) FROM Factura f",FacturaDTO.class);
		
		
		return myQuery.getResultList();
	}
	
	
	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Factura buscar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Factura> seleccionarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Factura> myQuery = this.entityManager.createQuery("SELECT f from Factura f",Factura.class);
		
		
		return myQuery.getResultList();
	}
	

}
