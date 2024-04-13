import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFichero {

	public static void main(String[] args) throws FileNotFoundException {
	   int numero;
	   int suma = 0;
	   FileReader buffer = new FileReader("Numeros.dat"); //Ruta relativa
	   Scanner control = new Scanner(buffer);
	   
	   while(control.hasNext()) {
	      numero = control.nextInt();
	      suma = suma + numero;
	   }
	   
	   control.close();
	   
	   System.out.println("El resultado de la suma es: " + suma);
	}
}
