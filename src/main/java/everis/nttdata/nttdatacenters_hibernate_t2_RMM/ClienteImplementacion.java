package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.util.List;

import org.hibernate.Session;

public class ClienteImplementacion implements ClienteDAO {

	private Session session;
	
	public ClienteImplementacion(Session session) {
		this.session = session;
	}
	@Override
	public Object buscarPorId(long id) {
		return session.get(Cliente.class, id);
	}

	@Override
	public List<Object> recuperarTodos() {
		return session.createQuery("SELECT * FROM clientes").list();
	}

	@Override
	public void crear(Object objeto) {
		session.save(objeto);
		
	}

	@Override
	public void actualizar(Object objeto) {
		session.update(objeto);
	}

	@Override
	public void eliminar(Object objeto) {
		session.delete(objeto);
		
	}

	@Override
	public void eliminarPorId(long id) {
		session.createQuery("DELETE FROM clientes WHERE codigo_cliente='"+id+"'");
	}

	@Override
	public List<Cliente> buscarPorNombre(String nombre) {
		return session.createQuery("DELETE FROM clientes WHERE nombre='"+nombre+"'").list();
	}

	@Override
	public Cliente buscarPorApellidos(String apellidos) {
		// TODO Auto-generated method stub
		return null;
	}

}
