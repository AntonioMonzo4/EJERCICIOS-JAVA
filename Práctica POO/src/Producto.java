/**
 * 
 * Clase que simula el objeto producto
 *
 */

public class Producto {
	
	private int id; // identificador 
	private String nombre; //nombre del producto
	private double redimientoHa; // redimiento del producto por hectarea 
	private double valorRefKilogramo;
	private boolean esPerecedero; //true si false no
	//Stock de ese producto en Kg
	private int stock;
	
	//Constructor
	
	public Producto(int id, String nombre, double redimientoHa, double valorRefKilogramo, boolean esPerecedero, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.redimientoHa = redimientoHa;
		this.valorRefKilogramo = valorRefKilogramo;
		this.esPerecedero = esPerecedero;
		this.stock = stock;
	}
	
	//Métodos getters y setters
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
	
	public double getRedimientoHa() {
		return redimientoHa;
	}
	
	public void setRedimientoHa(double redimientoHa) {
		this.redimientoHa = redimientoHa;
	}
	
	public double getValorRefKilogramo() {
		return valorRefKilogramo;
	}
	
	public void setValorRefKilogramo(double valorRefKilogramo) {
		this.valorRefKilogramo = valorRefKilogramo;
	}
	
	public boolean isEsPerecedero() {
		return esPerecedero;
	}
	
	public void setEsPerecedero(boolean esPerecedero) {
		this.esPerecedero = esPerecedero;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	


}
