import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {

	public static void main(String[] args) {
		final int[] primos = {1, 2, 3, 4, 5, 7, 11, 13, 17, 19};
		
		final Collection<Integer> cPrim = new ArrayList<Integer> ();
		
		for(int i = 0; i < primos.length; i++) {
		   cPrim.add(primos[i]);  //Boxing automático
		}
		
		System.out.println("Elementos iniciales en ArrayList: " + cPrim);
		System.out.println("\nLista de números primos:");  
		
		//Recorrido con iterador (presentaremos los elementos
		//por pantalla y borraremos el número 4 
		final Iterator<Integer> iter = cPrim.iterator();
		while (iter.hasNext()) {
		    int numPrimo = iter.next();  //Unboxing automático
		    if (numPrimo != 4) {
		        System.out.print(numPrimo + " ");
		    }
		    else {
			    iter.remove();
			}
		}
		System.out.println("\n");
		System.out.println("Elementos finales en ArrayList: " + cPrim);
	}

}
