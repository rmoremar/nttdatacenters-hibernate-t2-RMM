package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.sql.DriverManager;

import org.hibernate.Session;

/**
 * @author raul moreno martinez
 */
public class main {

	public static void main(String[] args) {
		
		Session session = null;//iniciar objeto

		ClienteImplementacion clienteimpl = new ClienteImplementacion(session);
		
		ContratoImplementacion contratoimpl = new ContratoImplementacion(session);
		
		Cliente cliente = new Cliente(1,"José","Ortega","Ramos","12345678A");
	}

}
