package nttdata.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Clase Cliente
 * 
 * @author Samuel Calderón González
 *
 */
@Entity
@Table(name = "Cliente")
public class Cliente extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String nif;
	/**
	 * Constructor con todos los parámetros
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param nif
	 */
	public Cliente(String nombre, String apellidos, String fechaNacimiento, String nif) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nif = nif;
	}
	/**
	 * Constructor vacío
	 */
	public Cliente() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "C_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "C_NOMBRE")
	public String getNombre() {
		return nombre;
	}	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "C_APELLIDOS")
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "C_FECHA_NAC")
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "C_NIF")
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", nif=" + nif + "]";
	}

}
