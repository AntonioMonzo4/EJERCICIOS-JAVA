/**
 * 
 */
package org.herrera;

/**
 * @author AntonioMonzo
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.out.println(sumaPotencias(5.25,3));
		System.out.println(sumaPotencias(2,7));
	}
	
	/**
	 * 
	 * @param numero: primer argumento es la base que queremos elevar tantas veces como el segundo argumento
	 * @param potencia: veces que elevamos el primer argumento
	 * @return devuelve la suma del primer argumento elevado tantas veces como el segundo argumento dice
	 */
	
	static double sumaPotencias(double numero,int potencia) {
		
		double resultado=0; 
		
		for(int i=0;i<=potencia;i++) {
			resultado+=Math.pow(numero, i);
		}
		
		return resultado;
	
		
		
	}

}
