
public class Circulo extends Pieza {
	private final double radio;
    
    public Circulo(double r, String nomb) {
    	super(nomb);
    	radio = r;
    }
    
    public double calculaArea() {
    	return Math.PI*radio*radio;
    }
}
