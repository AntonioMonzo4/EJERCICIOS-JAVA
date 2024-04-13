
public class Triangulo extends Pieza {
	private final double base;
    private final double altura;
    
    public Triangulo(double b, double h, String nomb) {
    	super(nomb);
    	base = b;
    	altura = h;
    }
    
    public double calculaArea() {
    	return base*altura/2;
    }
}
