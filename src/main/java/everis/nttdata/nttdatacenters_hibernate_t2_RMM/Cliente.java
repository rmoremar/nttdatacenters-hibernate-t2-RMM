package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes", schema = "nttdata_hibernate_taller")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigo_cliente", unique = true, nullable = false)
	private long codigo_cliente;

	@Column(name = "nombre", unique = false, nullable = false)
	private String nombre;

	@Column(name = "primer_apellido", unique = false, nullable = false)
	private String primer_apellido;

	@Column(name = "segundo_apellido", unique = false, nullable = false)
	private String segundo_apellido;

	@Column(name = "dni", unique = true, nullable = false, length = 9)
	private String dni;

	public Cliente() {
		super();
	}

	public Cliente(long codigo_cliente, String nombre, String primer_apellido, String segundo_apellido, String dni) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre = nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.dni = dni;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Contrato> contratos;

	public long getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

}
