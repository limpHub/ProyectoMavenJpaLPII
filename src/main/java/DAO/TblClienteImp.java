package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;


public class TblClienteImp implements ICliente {

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//regisdtramos en la bd
		emanager.persist(cliente);
		//msj por consola
		System.out.println("Cliente registrado");
		//confimacmos transaccion
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
	}// fin RegistrarCliente

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}// fin ActualizarCliente


	@Override
	public void ElminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}// fin ElminarCliente

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}// fin BuscarCliente

	@Override
	public List<TblCliente> ListarCliente() {
		// TODO Auto-generated method stub
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("ProyectoMavenJpaLPII");
		//gestionamos las entidades
		EntityManager  em=fab.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos la data de la base de datos
		List<TblCliente> listado=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		//confirmamos la transaccion
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado
		//nuevo comentario
		//otro comentario
		return listado;
	}// fin ListarCliente

}// fin a la clase
