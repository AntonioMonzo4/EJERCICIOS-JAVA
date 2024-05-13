package org.herrera.mates;
/**
 * Esta tarea realiza divisiones en una sucesión a incrementos de 4
 * hasta que llega a un límite que hemos llamado "raíz"
 */
public class TareaDivisiones implements Runnable {
	private long numero; // número del que buscamos divisor
	private long div0;   // primer divisor que comprobamos. Luego vamos de 4 en 4.
	private static long raiz = -1;
	private static int hilosVivos = 2;

	public TareaDivisiones(long numero, long div0) {
		this.numero = numero;
		this.div0 = div0;
		// la raíz la debe inicializar el primer hilo que llega
		if (raiz == -1)
			raiz = (long) Math.ceil(Math.sqrt(numero));
	}

	@Override
	public void run() {
		long div;

		// Sólo un hilo debe inicializar el divisor. En principio, suponemos que es primo.
		if (Primos.divisor == -1)
			Primos.divisor = numero;

		// hacemos divisiones entre div0, div0+4, div0+8,...
		for (div = div0; div <= raiz; div += 4)	{
			if (numero % div == 0) {
				// Si este hilo ha encontrado un divisor menor, lo guarda.
				if (div < Primos.divisor)
					Primos.divisor = div;
				break; // en cualquier caso, su tarea ha terminado
			}
		}
		// El otro hilo no debe buscar divisores mayores que el que ya tenemos.
		raiz = Primos.divisor;

		synchronized (Primos.monitor) {
			if (--hilosVivos == 0) {
				// Estas dos instrucciones simplemente son para dejar consistente el algoritmo
				// en previsión de futuras ejecuciones.
				hilosVivos = 2;
				raiz = -1;
				// Informamos al hilo padre de que ya hemos acabado
				Primos.monitor.notify();
			}
		}
	}
}
