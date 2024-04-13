
public class Coordenada extends Punto {
    private final double altura;
    
    public Coordenada (double longitud, double latitud, double altura) {
    	super(longitud, latitud);
    	this.altura = altura;
    }
    
    /*public String getCoordenada () {
    	String coord = "longitud, latitud: " + getPunto() + " altura: " + altura;
    	
    	return coord;
    }*/
    
    @Override
    public String getPunto () {
    	String coord = "longitud, latitud: " + super.getPunto() + " altura: " + altura;
    	return coord;
    }
}
