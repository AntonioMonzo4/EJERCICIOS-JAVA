
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;

public class GuardaLineas {

	public static void main(String[] args) throws Exception {
		Scanner scTeclado;
		FileReader buffLectura;
		FileWriter buffEscritura;
		Scanner controlLectura;
		PrintWriter controlEscritura;
		String txtBuscar, fichEntrada, fichSalida;
		
		scTeclado = new Scanner(System.in);
		System.out.print("Indíqueme el texto a buscar: ");
		txtBuscar = scTeclado.nextLine();
		if (!txtBuscar.isEmpty()) {
		    System.out.print("Indíqueme el fichero de entrada: ");
		    fichEntrada = scTeclado.nextLine();
		    if (!fichEntrada.isEmpty()) {
		        System.out.print("Indíqueme el fichero de salida: ");
		        fichSalida = scTeclado.nextLine();
		        if (!fichSalida.isEmpty()) {
		            buffLectura = new FileReader (fichEntrada);
		            controlLectura = new Scanner (buffLectura);
		    		buffEscritura = new FileWriter (fichSalida, false);
		            controlEscritura = new PrintWriter (buffEscritura);
				    realizaProceso(txtBuscar, controlLectura, controlEscritura);
				    controlLectura.close();
				    controlEscritura.close();
				    System.out.print("\nPROCESO TERMINADO CORRECTAMENTE");
		        }
				else {
					System.out.println("\nError: Debe indicar un nombre correcto para el fichero de salida");
					System.out.print("LA APLICACIÓN TERMINÓ CON ERRORES");
				}
			}
			else {
				System.out.println("\nError: Debe indicar un nombre correcto para el fichero de entrada");
				System.out.print("LA APLICACIÓN TERMINÓ CON ERRORES");
			}
		}
		else {
			System.out.println("\nError: Debe indicar un texto para buscar");
			System.out.print("LA APLICACIÓN TERMINÓ CON ERRORES");
		}
		scTeclado.close();
	}
	
	private static void realizaProceso(String texto, Scanner controlR, PrintWriter controlW) {
	    String linea;
		
	    while(controlR.hasNext()) {
	    	linea = controlR.nextLine();
	    	if (linea.contains(texto)) {
	    	    controlW.println(linea);	
	    	}
	    }
	}
	
}
