public class Consultor extends Trabajador {
	private final double precioHora;
    private int totalHoras; //es atributo tambi�n las horas trabajadas. Evidentemente, no final
    private final static double TIPO_IRPF = 0.15;
    
    public Consultor (String nombre, int edad, String numSS, double precioHora) {
    	super (nombre, edad, numSS); // constructor de la clase Trabajador
    	this.precioHora = precioHora;
    	totalHoras = 0;
    }
    
    // M�todos sobreescritos
    @Override
    public double getSueldo () {
        return precioHora*totalHoras;	
    }
    
    @Override
    public double getSueldoNeto () {
    	return getSueldo()*(1-TIPO_IRPF);
    }
    
    // M�todo espec�fico clase Consultor
    public void agregarHoras (int horas) {
        totalHoras = totalHoras + horas;    	
    }
}
