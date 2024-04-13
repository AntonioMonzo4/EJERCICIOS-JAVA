	import java.util.InputMismatchException;
	import java.util.Scanner;


public class ConCapturaMalOrden {
		public static void main (String[] args) throws ArithmeticException, InputMismatchException {
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
	      catch (Exception e) { // Excepción general que engloba a todas
	          System.out.println("Error: Problema indefinido. Ejecute de nuevo");
	      }
	      sc.close();                                   }
	         
	      private static int divide(int numer, int denom) {
	             return numer/denom; 
	     }
	}


