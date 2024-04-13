import java.util.Scanner;

public class ProcesaLineas {

	public static void main(String[] args) {
		int maxLongitud = 0;
		String linea;
		String lineaMasLarga = "";
		int contador = 0;
		int posicionLineaMax = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un texto: ");
		linea = sc.nextLine();
		while (!linea.isEmpty()) {
			contador++;
			if (linea.length() > maxLongitud) {
				maxLongitud = linea.length();
				lineaMasLarga = linea;
				posicionLineaMax = contador;
			}
			System.out.print("Introduzca un texto: ");
			linea = sc.nextLine();
		}
		
		if (maxLongitud > 0) {
			System.out.print("\nLa línea más larga es: ");
			System.out.println(lineaMasLarga);
			System.out.println("La longitud de esta línea es: " + maxLongitud);
			System.out.println("La línea fue introducida en la posición: " + posicionLineaMax);
		}
		else {
			System.out.println("\nNo introdujo ninguna línea. No se pudo realizar el proceso");
		}
		
		sc.close();

	}

}
