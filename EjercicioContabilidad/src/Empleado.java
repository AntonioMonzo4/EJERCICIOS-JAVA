
public class Empleado extends Trabajador {
    private final String fechaContrato;
    private final double sueldoAnualB;
    private final static double TIPO_IRPF = 0.19;
    
    public Empleado (String nombre, int edad, String numSS, String fecha, double sueldo) {
    	super (nombre, edad, numSS); // constructor de la clase Trabajador
    	fechaContrato = fecha;
    	sueldoAnualB = sueldo;
    }
    
    // métodos sobreescritos
    @Override
    public double getSueldo () {
        return sueldoAnualB;	
    }
    
    @Override
    public double getSueldoNeto () {
    	return sueldoAnualB*(1-TIPO_IRPF);
    }
    
    // Método específico de Empleado
    public String getFechaContrato () {
        return fechaContrato;    	
    }
}
