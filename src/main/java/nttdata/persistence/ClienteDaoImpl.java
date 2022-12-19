package nttdata.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Cliente repositorio
 * 
 * @author Samuel Calderón González
 *
 */
@Repository
public class ClienteDaoImpl implements ClienteDaoI {
	@Autowired
	private EntityManager entityManager;
	

	@SuppressWarnings("unchecked")
	public List<Cliente> getAllClientes() {
		
		Session session = entityManager.unwrap(Session.class);
		session.getTransaction().begin();
		return (List<Cliente>) session.createQuery("FROM Cliente").list();
	}

	public Cliente getCliente(int id) {
		Session session = entityManager.unwrap(Session.class);

		return session.get(Cliente.class, id);
	}

	public void insertCliente(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);

		session.save(cliente);
		session.getTransaction().commit();
	}

	public void updateCliente(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(cliente);
		session.getTransaction().commit();
	}

	public void deleteCliente(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);

		session.delete(cliente);
		session.getTransaction().commit();
	}
}
