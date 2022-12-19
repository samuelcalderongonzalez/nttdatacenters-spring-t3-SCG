package nttdata.services;

import java.util.List;

import org.springframework.stereotype.Service;

import nttdata.persistence.Cliente;

/**
 * Cliente Servicio
 * 
 * @author Samuel Calderón González
 *
 */
@Service
public interface ClienteManagementServiceI {
	/**
	 * Inserta nuevo cliente
	 * 
	 * @param newCliente
	 */
	public void insertNewCliente(final Cliente newCliente);

	/**
	 * Actualiza cliente existente
	 * 
	 * @param updatedCliente
	 */
	public void updateCliente(final Cliente updatedCliente);

	/**
	 * Borra cliente
	 * 
	 * @param deletedCliente
	 */
	public void deleteCliente(final Cliente deletedCliente);

	/**
	 * Busca cliente
	 * 
	 * @param cliente
	 * @return
	 */
	public Cliente searchCliente(final Cliente cliente);

	/**
	 * Busca todos los clientes
	 * 
	 * @return
	 */
	public List<Cliente> searchAll();

	/**
	 * Busca todos los clientes con ese nombre
	 * 
	 * @param name
	 * @return
	 */
	public List<Cliente> searchByName(final String name);

	/**
	 * Busca todos los clientes con ese apellido
	 * 
	 * @param surname
	 * @return
	 */
	public List<Cliente> searchBySurname(final String surname);

}
