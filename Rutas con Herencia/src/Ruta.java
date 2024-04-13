
public class Ruta {
    private final String nombre;
    private final Coordenada[] coordenadas;
    private int numRealCoordenadas;
    
    public Ruta (String nombre, int numMaximoCoordenadas) {
    	this.nombre = nombre;
    	coordenadas = new Coordenada[numMaximoCoordenadas];
    	numRealCoordenadas = 0;
    }
    
    public void addCoordenada (Coordenada c) {
        coordenadas[numRealCoordenadas] = c;
        numRealCoordenadas++;
    }
    
    public String getRuta() {
    	String txtRuta = "Ruta " + nombre + ":\n";
    	
    	for (int n = 0; n < numRealCoordenadas; n++) {
    	    //txtRuta = txtRuta + coordenadas[n].getCoordenada() + "\n";
    	    txtRuta = txtRuta + coordenadas[n].getPunto() + "\n";
    	}
    	
    	return txtRuta;
    }
    
}
