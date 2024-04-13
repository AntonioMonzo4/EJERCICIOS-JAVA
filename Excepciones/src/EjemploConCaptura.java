import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploConCaptura {
	
   public static void main (String[] args) {
      int numerador, denominador, cociente;
      boolean badEntrada = true;
      Scanner sc = new Scanner (System.in);
      
      do {
    	  try {
		      System.out.print ("Numerador: ");
		      numerador = sc.nextInt(); 
		      System.out.print ("Denominador: ");
		      denominador = sc.nextInt();
		      cociente = divide (numerador, denominador);
		      System.out.println ("Cociente: " + cociente);
		      badEntrada = false;
    	  }
    	  catch (ArithmeticException aE) {
    		   // Código para tratar división por cero.
    		  System.out.println("Error: No se puede dividir por 0");
    		  System.out.println("Vuelva a introducir los datos");
    	  }
            
          catch (InputMismatchException iE) {
              // Código para tratar entrada inválida.
        	  System.out.println("Error: Debe proporcionar enteros");
        	  System.out.println("Vuelva a introducir los datos");
        	  sc.nextLine(); //Descarga del buffer de teclado
          }
    	  /*catch (IllegalArgumentException illegalE) {
    		  System.out.println("Error: Debe introducir números positivos");
    	  }*/
    	  catch (IllegalArgumentException illegalE) {
		  System.out.println("Error: Debe introducir números positivos "+illegalE.getMessage());
	  	  }
    	  catch (MiExcepcion nuevaE) {
    		   System.out.println("Error: " + nuevaE.getMessage());
    		   System.out.println("Vuelva a introducir los datos");
    		   nuevaE.printStackTrace();
    		}
   	  
      } while(badEntrada);
      
      sc.close();
   }
   
   private static int divide(int numer, int denom) throws MiExcepcion {
	   int resul;

      /*if (numer < 0 || denom < 0)
          throw new IllegalArgumentException ("Excepción en método divide");*/
      
      /*try {
 		      if (numer < 0 || denom < 0) {
 		          throw new IllegalArgumentException ("Excepción en método divide");
 		      }
 	      }
       catch (IllegalArgumentException iE) {
           System.out.println("Error: División negativa");
           throw new IllegalArgumentException ("Relanza", iE); 
        }*/
	         
	   if (numer < 0)
	         throw new MiExcepcion ("No se amdmiten numeradores negativos");
	   
       resul = numer/denom;
       return resul;
      }

}