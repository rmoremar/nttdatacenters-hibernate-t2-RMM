package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.util.List;

public interface InterfazDAO {
	
	Object buscarPorId(long id);

	List<Object> recuperarTodos();

	void crear(Object objeto);

	void actualizar(Object objeto);

	void eliminar(Object objeto);

	void eliminarPorId(long id);
}
