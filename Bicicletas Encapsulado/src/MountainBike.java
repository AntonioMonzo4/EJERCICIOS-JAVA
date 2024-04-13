
public class MountainBike extends Bike {
    private final int grosorRueda;   //grosor de la rueda en milímetros (entre 20 y 30)
    
    public MountainBike(int gros, int dient) {//Constructor 
    	super(dient);
    	grosorRueda = gros;
    }
    
    public void saltaObstaculo() {
        double alturaSalto = ((double)getTamPlato())/grosorRueda;
        System.out.println("La bicicleta ha saltado " + alturaSalto + " metros");
    }
}
