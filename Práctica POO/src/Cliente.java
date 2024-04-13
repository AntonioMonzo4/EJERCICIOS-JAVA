
/**
 * la clase cliente es la encargada del desarrollo del cliente final asi como sus atributos y m�todos 
 */
import java.util.List;

public class Cliente {

	private int id; //identificador
	private String nombre; //nombre del Cliente
	private List<Integer> idProductosComprados; //lista de los productos comprados por el cliente
	private String direccionEnvio;


	//Constructor
	public Cliente(int id, String nombre, List<Integer> idProductosComprados, String direccionEnvio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idProductosComprados = idProductosComprados;
		this.direccionEnvio = direccionEnvio;
	}

	//Métodos getters y setters para la obtenci�nn de los atributos

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
	return nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public List<Integer> getIdProductosComprados() {
		return idProductosComprados;
	}

	public void setIdProductosComprados(List<Integer> idProductosComprados) {
		this.idProductosComprados = idProductosComprados;
	}

	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}
}
