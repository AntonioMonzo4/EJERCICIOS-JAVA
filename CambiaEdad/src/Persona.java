
public class Persona {

	private final String nombre;
    private int edad;
    
    public Persona (String n, int e) {
        nombre = n;
    	edad = e;
    }
    
    public void setEdad (int e) {
    	edad = e;
    }
    
    public int getEdad () {
    	return edad;
    }
    
    @Override
    public boolean equals(Object o) {
        boolean iguales = false;
      
        if ((o != null) && (o instanceof Persona) &&
            (nombre.equals(((Persona)o).nombre))) {
    	    iguales = true;
        }
        
        return iguales; 
    }
    
    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }	
  
}

