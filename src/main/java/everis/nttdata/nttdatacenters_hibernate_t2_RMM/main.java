/**
 * 
 */
package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.sql.DriverManager;

import org.hibernate.Session;

/**
 * @author rmoremar
 *
 */
public class main {
	
	public static void main(String[] args) {
		Session session = 

		ClienteImplementacion clienteimpl = new ClienteImplementacion(session);
		
		ContratoImplementacion contratoimpl = new ContratoImplementacion(session);
		
		
	}

}
