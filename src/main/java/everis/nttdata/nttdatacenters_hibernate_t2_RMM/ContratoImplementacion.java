package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class ContratoImplementacion implements ContratoDAO {

	private Session session;
	
	public ContratoImplementacion(Session session) {
		this.session = session;
	}
	
	@Override
	public Object buscarPorId(long id) {
		return session.get(Contrato.class, id);
	}

	@Override
	public List<Object> recuperarTodos() {
		return session.createQuery("SELECT * FROM contratos").list();
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
		session.createQuery("DELETE FROM contratos WHERE codigo_contrato='"+id+"'");
	}

	@Override
	public Contrato buscarPorIdCliente(long id) {
		Query consulta = session.createQuery("SELECT * FROM contratos WHERE codigo_cliente='"+id+"'");
		//recuperar objeto
		return null;
	}

}
