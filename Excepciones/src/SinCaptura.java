// Prueba a escribir como numerador una letra y depués como divisor un 0 
// Analiza los mensajes de error que aparecen
import java.util.Scanner;

public class SinCaptura {
   public static void main (String[] args) {
      int numerador, denominador, cociente;      
      Scanner sc = new Scanner (System.in);
      System.out.print ("Numerador: ");
      numerador = sc.nextInt(); 
      System.out.print ("Denominador: ");
      denominador = sc.nextInt();
      cociente = divide (numerador, denominador);
      System.out.println ("Cociente: " + cociente);
      sc.close();
   }
   
   private static int divide(int numer, int denom) {
      return numer/denom; 
   }
}
