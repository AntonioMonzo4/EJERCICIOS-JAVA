
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcion;
		String nombreRuta;
		Ruta miRuta = null;
		final Scanner sc = new Scanner(System.in);
		
		System.out.print("Ind�queme el nombre de la ruta a manejar: ");
		nombreRuta = sc.nextLine();
		
		miRuta = new Ruta (nombreRuta, 50);
		
		do {
		    opcion = menu(sc);
		    switch (opcion) {
		    case 1:
		    	if (miRuta != null) {
		    	    System.out.println("\nA�adir coordenada a ruta " + nombreRuta + ":");
			        System.out.print("Longitud: ");
			        final double longitud = sc.nextDouble();
			        System.out.print("Latitud: ");
			        final double latitud = sc.nextDouble();
			        System.out.print("Altura: ");
			        final double altura = sc.nextDouble();
			        final Coordenada nuevaCoordenada = new Coordenada (longitud, latitud, altura);
			        miRuta.addCoordenada(nuevaCoordenada);
			        System.out.println("**La coordenada ha sido a�adida a la ruta");
		    	}
		    	else {
		    		System.out.println("\n**No hay ninguna ruta.");
		    	}
			    break;
		    case 2:
		    	if (miRuta != null) {
		    	    System.out.println("\nBorrar ruta " + nombreRuta + ":");
			        miRuta = null;
			        System.out.println("**La ruta ha sido borrada");
		    	}
		    	else {
		    		System.out.println("\n**No hay ninguna ruta.");
		    	}
			    break;
		    case 3:
		    	if (miRuta != null) {
		    	    System.out.println("\nPresentar informaci�n de la ruta:");
			        System.out.println("------------------------------------");
			        System.out.print(miRuta.getRuta());
			        System.out.println("------------------------------------");
		    	}
		    	else {
		    		System.out.println("\n**No hay ninguna ruta.");
		    	}
			    break;
		    case 4:
			    System.out.println("\nAdi�s! Gracias por usar nuestra aplicaci�n.\n");
			    break;
		    }
		} while (opcion != 4);
		
		sc.close ();
	}
	
	private static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("\n************ MEN� DE OPCIONES - RUTAS ************");
		System.out.println("*                                                *");
		System.out.println("* 1.- A�adir coordenada a la ruta.               *");
		System.out.println("* 2.- Borrar la ruta.                            *");
		System.out.println("* 3.- Listar informaci�n de la ruta.             *");
		System.out.println("* 4.- Salir.                                     *");
		System.out.println("*                                                *");
		System.out.println("**************************************************\n");
		
		do {
			System.out.print("Seleccione una opci�n: ");
			opcion = sc.nextInt();
		} while ((opcion < 1)||(opcion > 4));
		
		return opcion;
	}

}
