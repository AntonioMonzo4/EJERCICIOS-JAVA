package org.herrera.mates;

public class Primos {

	// En esta variable guardarán los hilos los divisores que encuentren.
	public static long divisor;
	// Para bloquear el hilo principal mientras trabajan sus hijos
	public static Object monitor = new Object();
	
/** 
  Divide entre todos los números impares (multihilo)
*/
	public static long getDivisorEx(long numero) {
		if (numero % 2 == 0)
			return 2;

		// inicializo la variable de "retorno" para los hilos 
		divisor = -1;
		// hilo para la sucesión 3 7 11 15 ...
		TareaDivisiones tarea3 = new TareaDivisiones(numero, 3);
		Thread hilo3 = new Thread(tarea3);
		// hilo para la sucesión 5 9 13 17 ...
		TareaDivisiones tarea5 = new TareaDivisiones(numero, 5);
		Thread hilo5 = new Thread(tarea5);

		hilo3.start();
		hilo5.start();

		// Espero a que acaben los hilos
		synchronized (monitor) {
			try {
				monitor.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Los hilos me han guardado en esta variable el menor divisor
		return divisor;
	}
	
/** 
  Divide entre todos los números impares (monohilo)
*/
	public static long getDivisor(long numero) {
		if (numero % 2 == 0)
			return 2;   // divisible por 2

		long raiz = (long) Math.ceil(Math.sqrt(numero));

		for (long div = 3; div <= raiz; div += 2)
			if (numero % div == 0)
				return div;   // compuesto

		return numero;   // PRIMO
	}

}
