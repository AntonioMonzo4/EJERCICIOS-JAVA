// Introducci�n try-cath-finally
// 1.- El primer catch recoge la excepci�n que queremos controlar (en este caso solo nos damos cuenta
//     de la excepci�n que tiene lugar al intentar dividir por 0. )
//     Prueba el programa tal y como est�: Qu� pasa si, como numerador, se introduce una letra? F�jate en la sentencia
//     de la l�nea 34, se ejecuta?
// 2.- Quita los comentarios al finally y ejecuta escribiendo una letra como numerador. 
//     Se ejecuta la sentencia de la l�nea 34?
// 3.- Quita los comentarios al segundo catch: te aseguras de que el programa no termina abruptamente. 
//     Las excepcionees m�s espec�ficas, primero.
//     Ejecuta escribiendo una letra como numerador.

import java.util.Scanner;

public class ConCaptura1 {
	public static void main (String[] args) {
		int numerador, denominador, cociente;
		Scanner sc = new Scanner (System.in);
		try {
			System.out.print ("Numerador: ");
			numerador = sc.nextInt(); 
			System.out.print ("Denominador: ");
			denominador = sc.nextInt();
			cociente = divide (numerador, denominador);
			System.out.println ("Cociente: " + cociente);
		}
		catch (ArithmeticException aE) {
			System.out.println("Error: No se puede dividir por 0. Ejecute de nuevo.");
			//throw aE;
		}
		/*catch (Exception e) { // Excepci�n general que engloba a todas
          System.out.println("Error: Problema indefinido. Ejecute de nuevo");
      }*/
		//finally {
		System.out.println("Despu�s del bloque try-catch");
		sc.close();                                   
		//   }
	}
	
	private static int divide(int numer, int denom) {
		return numer/denom; 
	}
}


