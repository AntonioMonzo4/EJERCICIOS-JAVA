// Herencia, clases abstractas,polimorfismo
public class Nomina {
    private static final int MAX_TRABAJADORES = 1000;
	protected Trabajador[] trabajadores = new Trabajador[MAX_TRABAJADORES];
	protected int numTrabajadores = 0;
	/* 
	 * Las dos líneas de arriba han sustituido a estas:
	       private Trabajador[] trabajadores = new Trabajador[MAX_TRABAJADORES];
	       private int numTrabajadores = 0;
	       
	   para hacer visibles los atributos trabajadores y numTrabajadores
	   (ver en Principal el fragmento de código para incrementar la edad de todos los trabajadores
	*/
    
	
	
	//  No se define constructor, no es necesario. Se utilizará el Constructor por defecto
	
	//Métodos.
	public boolean insertar (Trabajador trabajador) {
		boolean todoOK = false;
		if (numTrabajadores < MAX_TRABAJADORES) {
			trabajadores[numTrabajadores] = trabajador;
			numTrabajadores++;
			todoOK = true;
		}
		return todoOK;
	}
	
	public Trabajador buscar (String numSS) {
		Trabajador encontrado = null;
		int n = 0;
		while ((n < numTrabajadores) && (encontrado == null)) {
			if (trabajadores[n].getNumeroSS().equals(numSS)) {
				encontrado = trabajadores[n]; 
			}
			n++;
		}
		return encontrado;
	}
	
	public Trabajador[] getTrabajadores () {
		//devolver un array de tamaño  igual al número real de trabajadores.
		Trabajador[] arrayDevolver = new Trabajador[numTrabajadores];
		for(int n = 0; n < numTrabajadores; n++) {
			arrayDevolver[n] = trabajadores[n];
		}
		return arrayDevolver;
	}
	
	// El método asegura que se le agregan horas a un Consultor
	public boolean agregarHoras (String numSS, int horas) {
		Trabajador buscado = buscar(numSS);
		boolean todoOK = false;
		// OJO, uso instanceof y Downcasting
		if ((buscado != null) && (buscado instanceof Consultor)) {
			((Consultor) buscado).agregarHoras(horas);
			todoOK = true;
		}
		return todoOK;
	}
}