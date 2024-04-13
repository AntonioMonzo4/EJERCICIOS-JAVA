public class Principal {

	public static void main(String[] args) {
		
		final Nomina empresa = new Nomina();  // Contiene un array de Trabajadores.
		                                      // Se usa el constructor por defecto
		
		// Introduzco trabajadores en mi base de datos.
		// No se instancian TRABAJADORES, solo Empleados o Consultores
		empresa.insertar(new Empleado ("Andrés", 25, "12345(R)", "12/2/2020", 22000));
		empresa.insertar(new Empleado ("Julio", 22, "22222(T)", "10/5/2020", 27560));
		empresa.insertar(new Empleado ("Marta", 37, "11223(A)", "2/1/2019", 31327.58));
		empresa.insertar(new Consultor ("Valeria", 21, "77654(E)", 7.58));
		empresa.insertar(new Consultor ("Luis", 33, "22344(D)", 12.36));
		
		
		// Agregamos 150 horas al consultor de numSS "22344(D)" 
		// agregarHoras() es un método de la clase Consultor, no usamos el agregarHoras() de Nomina
		((Consultor)empresa.buscar("22344(D)")).agregarHoras(150);
		
		// Agregamos 200 horas al consultor de numSS "77654(E)" 
		// Usamos el método agregarHoras() de Nomina 	
		empresa.agregarHoras ("77654(E)", 200);
		
		// Un año más en la edad de cada trabajador 
		// para este bucle, hemos cambiado a protected los atributos numTrabajadores y trabajadores
		// de la clase Nómina
		for (int i = 0; i < empresa.numTrabajadores; i++) {
		  empresa.trabajadores[i].setEdad(empresa.trabajadores[i].getEdad()+1);
		}
		
		// Obtenemos el array con los trabajadores que están en nomina
		Trabajador[] misTrabajadores = empresa.getTrabajadores();
		
		//Listamos los trabajadores de la empresa.
		System.out.println ("\nListado de los trabajadores de mi empresa: ");
		for (int i = 0; i < misTrabajadores.length; i++) {
			System.out.print ("** Trabajador " + (i+1) + ": ");
		    System.out.print (misTrabajadores[i].getNombre() + " -- ");       //Persona
		    System.out.print (misTrabajadores[i].getEdad() + " -- ");         //Persona
		    System.out.print (misTrabajadores[i].getNumeroSS() + " -- ");     //Trabajador
		    
		    // Los métodos getSueldo() y getSueldoNeto() tienen diferente comportamiento
		    // dependiendeo de si el trabajador es un empleado o un consultor: polimorfismo
		    System.out.printf ("%.2f -- ", (misTrabajadores[i]).getSueldo()); // Sobreeescrito
		    System.out.printf ("%.2f -- ", (misTrabajadores[i]).getSueldoNeto()); // Sobreescrito
		    
		    // Particularidad para una subclase: Si es una empleado, muestra la fecha de contrato
		    // Uso instanceof y Downcasting
		    if (misTrabajadores[i] instanceof Empleado)
		     System.out.println (""
		     		+ "Empleado con fecha de contrato"+ ((Empleado)(misTrabajadores[i])).getFechaContrato());
		    else
		    	System.out.println ("");
		}
	}	
}