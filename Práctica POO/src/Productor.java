/**
 * Clase productor con sus respectivos atributos 
 */

import java.util.List;

public class Productor{

	private int id; //identificador
	private String nombre; //nombre del productor
	private double hectareas; //catidad de hectareas que posee 
	private List<Producto> productos; // lista de productos de cada productor 

	
	//Constructor

	public Productor(int id, String nombre, double hectareas, List<Producto> productos) {
		this.id = id;
		this.nombre = nombre;
		this.hectareas = hectareas;
		this.productos = productos;
	}


	//Metodos getters y setters para la obtencion de los atributos 
	
	public double getHectareas() {
		return hectareas;
	}

	public void setHectareas(double hectareas) {
		this.hectareas = hectareas;
	}


	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	};

}

