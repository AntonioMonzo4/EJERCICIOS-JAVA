// F�jate. El main tambi�n puede lanzar la excepci�n en lugar de recogeral. Prueba el programa. Qu� crees que pasar�?
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsNuevaExcepcionMain {
		public static void main (String[] args) throws NuevaExcepcion {
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
	      /*
	      catch (NuevaExcepcion nuevaE) {
	    	   System.out.println("Error: " + nuevaE.getMessage());
	    	   System.out.println("Vuelva a introducir los datos.");
	    	   //nuevaE.printStackTrace();
	    	}
	       */
	      finally {
	    	  System.out.println("Despu�s del bloque try-cath. ");  
	    	  sc.close();
	      }
	}
		// Consideramos error que la divisi�n pueda resultar negativa
		// NuevaEcepcion. Hemos creado esa clase previamente
		private static int divide(int numer, int denom) throws NuevaExcepcion
			{
			   int resul = numer/denom;
			   if (resul < 0) {
			      throw new NuevaExcepcion ("Excepci�n en m�todo divide");    
			   }
			   return resul;
			} 

	 }