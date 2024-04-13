// Clase base. No se reescriben sus métodos: no es clase abstracta
public class Persona {
    private final String nombre; 
    private int edad;
    
    public Persona (String nombre) {
    	this.nombre = nombre;
    }
    
    public String getNombre () {
    	return nombre;
    }
    
    public int getEdad () {
    	return edad;
    }
    
    public void setEdad (int edad) {
    	this.edad = edad;
    }
}
