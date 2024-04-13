import java.util.List;
import java.util.LinkedList;


public class CambiaEdad {

	public static void main(String[] args) {
		final List<Persona> amigos = new LinkedList<> ();
		int posicion;
		
		amigos.add (new Persona("Ana", 25));
		amigos.add (new Persona("Fernando", 37));
		
		System.out.println("Lista original: " + amigos);
		
		posicion = amigos.indexOf (new Persona("Ana", 0));
		if (posicion != -1) {
		   Persona aux = amigos.get (posicion);
		   aux.setEdad (aux.getEdad() + 1);
		}
        
		System.out.print("Lista modificada: ");
		for(Persona e : amigos) {
			System.out.print(e + "  ");
		}

	}

}
