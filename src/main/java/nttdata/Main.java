package nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nttdata.persistence.Cliente;
import nttdata.services.ClienteManagementServiceI;
/**
 * Clase main
 * 
 * @author Samuel Calderón González
 *
 */
@SpringBootApplication
public class Main implements CommandLineRunner {
	@Autowired
	private ClienteManagementServiceI clienteService;


	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		//Cliente1
		Cliente cliente = new Cliente();
		cliente.setNombre("Samuel");
		cliente.setApellidos("Calderón");
		cliente.setFechaNacimiento("2002-06-05");
		cliente.setNif("999999999");
		//Cliente2
		Cliente cliente2 = new Cliente();
		cliente.setNombre("Pablo");
		cliente.setApellidos("García");
		cliente.setFechaNacimiento("2000-07-10");
		cliente.setNif("999888899");
		//Insert clientes
		clienteService.insertNewCliente(cliente);
		clienteService.insertNewCliente(cliente2);
		//Update
		cliente.setNombre("Samuel");
		cliente.setApellidos("Calderón González");
		cliente.setFechaNacimiento("2002-06-05");
		cliente.setNif("999999999");
		
		clienteService.updateCliente(cliente);
		//Resto de métodos
		clienteService.searchByName(cliente.getNombre());
		clienteService.searchBySurname(cliente2.getApellidos());
		clienteService.searchAll();
		clienteService.searchCliente(cliente);	
		clienteService.deleteCliente(cliente2);

	}

}
