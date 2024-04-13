//Clase Bike crea el objeto con el mismo nombre que la clase indicando sus caracter�sticas mediante m�todos 
public class Bike {
    private final int tamPlato;  //tama�o del plato en dientes (entre 30 y 50)
    
    public Bike(int dientes){    //Constructor
        tamPlato = dientes;	
    }
    
    public void corre() {   //M�todo que indica la velocidad a la que va la bicicleta tras el uso de un atributo pasado como par�metro
    	double velocidad = tamPlato*1.1;
    	System.out.println("La bicicleta est� corriendo a " + velocidad + " Km/h");
    }
    
    public void para() {
    	System.out.println("La bicicleta ha parado");
    }
    
    public int getTamPlato() {//m�todo que devuelve el valor del tama�o del Plato
    	return tamPlato;
    }
}
