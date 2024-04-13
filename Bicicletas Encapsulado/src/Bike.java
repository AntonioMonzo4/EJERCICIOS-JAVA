//Clase Bike crea el objeto con el mismo nombre que la clase indicando sus características mediante métodos 
public class Bike {
    private final int tamPlato;  //tamaño del plato en dientes (entre 30 y 50)
    
    public Bike(int dientes){    //Constructor
        tamPlato = dientes;	
    }
    
    public void corre() {   //Método que indica la velocidad a la que va la bicicleta tras el uso de un atributo pasado como parámetro
    	double velocidad = tamPlato*1.1;
    	System.out.println("La bicicleta está corriendo a " + velocidad + " Km/h");
    }
    
    public void para() {
    	System.out.println("La bicicleta ha parado");
    }
    
    public int getTamPlato() {//método que devuelve el valor del tamaño del Plato
    	return tamPlato;
    }
}
