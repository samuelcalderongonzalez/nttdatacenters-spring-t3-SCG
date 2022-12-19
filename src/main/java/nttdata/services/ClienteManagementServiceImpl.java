package nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.persistence.Cliente;
import nttdata.persistence.ClienteDaoI;
/**
 * Cliente Servicio
 * 
 * @author Samuel Calderón González
 *
 */
@Service
public class ClienteManagementServiceImpl implements ClienteManagementServiceI {
	@Autowired
	private ClienteDaoI clienteDao;

	@Override
	public void insertNewCliente(Cliente newCliente) {
		if (newCliente != null) {
			clienteDao.insertCliente(newCliente);
		}
	}

	@Override
	public void updateCliente(Cliente updatedCliente) {
		if (updatedCliente != null) {
			clienteDao.updateCliente(updatedCliente);
		}
	}

	@Override
	public void deleteCliente(Cliente deletedCliente) {
		if (deletedCliente != null) {
			clienteDao.deleteCliente(deletedCliente);
		}
	}

	@Override
	public List<Cliente> searchAll() {
		List<Cliente> cliente = new ArrayList<Cliente>();

		cliente = clienteDao.getAllClientes();

		return cliente;
	}

	@Override
	public Cliente searchCliente(Cliente cliente) {
		return clienteDao.getCliente(cliente.getId());
	}

	@Override
	public List<Cliente> searchByName(String name) {
		List<Cliente> cliente = new ArrayList<Cliente>();
		for (Cliente c: searchAll()) {
			if(c.getNombre().equals(name))
				cliente.add(c);
		}
		return cliente;
	}

	@Override
	public List<Cliente> searchBySurname(String surname) {
		List<Cliente> cliente = new ArrayList<Cliente>();
		for (Cliente c: searchAll()) {
			if(c.getApellidos().equals(surname))
				cliente.add(c);
		}
		return cliente;
	}

}
