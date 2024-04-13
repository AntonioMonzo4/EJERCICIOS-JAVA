
public class SpaceBike extends Bike {
    private final int potenciaVuelo;   //Potencia para volar (entre 10 y 20 watios)
    
    public SpaceBike(int pot, int dient) {
    	super(dient);
    	potenciaVuelo = pot;
    }
    
    public void vuela() {
        int velocidadVuelo = potenciaVuelo*10;
        System.out.println("La bicicleta está volando a " + velocidadVuelo + " Km/h");
    }
}
