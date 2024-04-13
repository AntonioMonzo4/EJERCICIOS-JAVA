import java.util.List;


public class Distribuidor {

	private int id;
	private String nombre;
	private List<Integer> idProductosComprados; //lista de los productos comprados por el distribuidor
	private String direccionEnvio;

	//Constructor 
	public Distribuidor(int id, String nombre,  List<Integer> idProductosComprados, String direccionEnvio) {
		this.id = id;
		this.nombre = nombre;
		this.idProductosComprados = idProductosComprados;
		this.direccionEnvio = direccionEnvio;
	}

	//Metodos getters y setters


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