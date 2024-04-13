// F�jate en como se ha modificado el m�todo y en la codificaci�n del catch de NuevaExcepcion en el principal

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsNuevaExcepcion {
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
      // Despu�s de probar el programa, quita el comentario dentro del catch, ejecuta de nuevo y analiza
      // la informaci�n proporcionada por el m�todo printStackTrace()
      catch (NuevaExcepcion nuevaE) {
    	   System.out.println("Error: " + nuevaE.getMessage());
    	   System.out.println("Vuelva a introducir los datos.");
    	   //nuevaE.printStackTrace();
    	}

      finally {
    	  System.out.println("Despu�s del bloque try-cath. ");  
    	  sc.close();
      }
}
	// Consideramos error que la divisi�n pueda resultar negativa
	// NuevaEcepcion. Hemos creado esa clase previamente
	// el return solo se ejecuta si todo va bien.
		private static int divide(int numer, int denom) throws NuevaExcepcion
		{
		   int resul = numer/denom;
		   if (resul < 0) {
		      throw new NuevaExcepcion ("Excepci�n en m�todo divide");    
		   }
		   return resul;
		} 

 }
