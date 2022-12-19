package nttdata.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;
/**
 * Cliente repositorio
 * 
 * @author Samuel Calderón González
 *
 */
@Repository
public interface ClienteDaoI {

	public List<Cliente> getAllClientes();

	public Cliente getCliente(int id);

	public void insertCliente(Cliente cliente);

	public void updateCliente(Cliente cliente);

	public void deleteCliente(Cliente cliente);
}
