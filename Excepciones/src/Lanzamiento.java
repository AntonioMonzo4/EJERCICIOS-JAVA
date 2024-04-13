// Novedades. Estudia y prueba:
// 1.- Fíjate en el método divide. Lanzamos una excepción.
// 2.- Fíjate en el mensaje que se muestra si se recoge una excepción de clase ArithmeticException. Accedemos a
//     un método del objeto aE que nos proporciona el mensaje del sistema (atributo del objeto).
// 3.- Prueba el programa con denominador 0, numerador letra y cociente negativo. Qué sucede??
// 4.- Quita el comentario al finally y fíjate en la diferencia (ejecución en el caso de cociente negativo)
// 5.- Qué debes hacer para que se recoja la excepción de cociente negativo?

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
      System.out.println("Después del bloque try-cath. ");  
      sc.close();
      //}
}
	// Consideramos error que la división pueda resultar negativa
	// Lanzamos una excepción IllegalArgumentException
		private static int divide(int numer, int denom) {
		   int resul = numer/denom;
		   if (resul < 0) {
		      throw new IllegalArgumentException 
		                         ("Excepción en método divide");    
		   }
		   return resul;
		} 

 }
