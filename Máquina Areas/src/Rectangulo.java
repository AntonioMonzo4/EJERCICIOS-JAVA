
public class Rectangulo extends Pieza {
    private final double lado1;
    private final double lado2;
    
    public Rectangulo(double l1, double l2, String nomb) {
    	super(nomb);
    	lado1 = l1;
    	lado2 = l2;
    }
    
    public double calculaArea() {
    	return lado1*lado2;
    }
}
