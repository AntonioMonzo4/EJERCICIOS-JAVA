// Puede haber tantos catch como excepciones queramos gestionar.
// Los dos primeros catch recoge las dos excepciones que pueden ocurrir. Las dos son específicas.
// No sería necesario el tercer catch general (pero si lo pones, ponlo al final)
// Se recogen todas, no se lanza ninguna. No es necesario el finally.

import java.util.InputMismatchException; //debo incluir esta. La otra se incluye por defecto.
import java.util.Scanner;

public class ConCaptura2 {
	public static void main (String[] args) {
	{
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
      }
      catch (InputMismatchException iE) {
            System.out.println("Error: Debe proporcionar enteros. Ejecute de nuevo");
      }
      catch (Exception e) { // Excepción general que engloba a todas
          System.out.println("Error: Problema indefinido. Ejecute de nuevo");
      }
      sc.close();                              
	}
	}
      private static int divide(int numer, int denom) {
             return numer/denom; 
     }
}


