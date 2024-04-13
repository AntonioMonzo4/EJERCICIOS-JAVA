// Novedades. Estudia y prueba:
// 1.- F�jate en el m�todo divide. Lanzamos una excepci�n.
// 2.- F�jate en el mensaje que se muestra si se recoge una excepci�n de clase ArithmeticException. Accedemos a
//     un m�todo del objeto aE que nos proporciona el mensaje del sistema (atributo del objeto).
// 3.- Prueba el programa con denominador 0, numerador letra y cociente negativo. Qu� sucede??
// 4.- Quita el comentario al finally y f�jate en la diferencia (ejecuci�n en el caso de cociente negativo)
// 5.- Qu� debes hacer para que se recoja la excepci�n de cociente negativo?

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanzamiento {
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
      catch (InputMismatchException iE) {
          System.out.println("Error: Debe proporcionar enteros. Ejecute de nuevo");
      }
      catch (ArithmeticException aE) {
            System.out.println("Error :"+ aE.getMessage());
      }
      //finally {
      System.out.println("Despu�s del bloque try-cath. ");  
      sc.close();
      //}
}
	// Consideramos error que la divisi�n pueda resultar negativa
	// Lanzamos una excepci�n IllegalArgumentException
		private static int divide(int numer, int denom) {
		   int resul = numer/denom;
		   if (resul < 0) {
		      throw new IllegalArgumentException 
		                         ("Excepci�n en m�todo divide");    
		   }
		   return resul;
		} 

 }
