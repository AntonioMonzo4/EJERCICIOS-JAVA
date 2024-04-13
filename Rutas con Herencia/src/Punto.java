
public class Punto {
    private final double x;
    private final double y;
    
    public Punto (double x, double y) {
    	this.x = x;
    	this.y = y;
    }
    
    public double distanciaA (Punto otro) {
    	double distancia;
    	
    	distancia = Math.sqrt(Math.pow(x-otro.x, 2) + Math.pow(y-otro.y, 2));
    	
    	return distancia;
    }
    
    public String getPunto () {
    	String txtPunto = "(" + x + ", " + y + ")";
    	
    	return txtPunto;
    }
}
