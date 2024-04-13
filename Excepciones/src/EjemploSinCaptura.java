import java.util.Scanner;

public class EjemploSinCaptura {
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
