// Es abstracta: dos métodos se reescriben en las clases que
// heredan de esta
abstract public class Trabajador extends Persona {
    private final String numSS;
    
    public Trabajador (String nombre, int edad, String numSS) {
    	super (nombre); // constructor de la clase Persona
    	this.numSS = numSS;
    	setEdad(edad); // método del clase Persona
    }
    
    public String getNumeroSS () {
    	return numSS;
    }
    
    abstract public double getSueldo ();
    
    abstract public double getSueldoNeto ();
}
