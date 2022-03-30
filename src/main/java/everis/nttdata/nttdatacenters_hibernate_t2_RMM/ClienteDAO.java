package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.util.List;

public interface ClienteDAO extends InterfazDAO{
	
	List<Cliente> buscarPorNombre(String nombre);
	
	Cliente buscarPorApellidos(String apellidos);
}
