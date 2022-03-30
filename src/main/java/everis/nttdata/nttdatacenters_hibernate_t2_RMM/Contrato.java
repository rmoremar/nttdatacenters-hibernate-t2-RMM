package everis.nttdata.nttdatacenters_hibernate_t2_RMM;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="contratos")
public class Contrato {
	
	@Id
	@GeneratedValue(strategy=GererationType.AUTO)
	@Column(name="codigo_contrato",unique=true,nullable=false)
	private long codigo_contrato;
	
	@Column(name="fecha_vigencia",unique=false,nullable=false)
	private Date fecha_vigencia;
	
	@Column(name="fecha_caducidad",unique=false,nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_caducidad;
	
	@Column(name="precio_mensual",unique=false,nullable=false)
	@Temporal(TemporalType.DATE)
	private Double precio_mensual;
	
	@ManyToOne
	@JoinColumn(name = "codigo_cliente")
	private Cliente cliente;


	public long getCodigo_contrato() {
		return codigo_contrato;
	}


	public void setCodigo_contrato(long codigo_contrato) {
		this.codigo_contrato = codigo_contrato;
	}


	public Date getFecha_vigencia() {
		return fecha_vigencia;
	}


	public void setFecha_vigencia(Date fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}


	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}


	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}


	public Double getPrecio_mensual() {
		return precio_mensual;
	}


	public void setPrecio_mensual(Double precio_mensual) {
		this.precio_mensual = precio_mensual;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
