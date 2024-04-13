import java.util.Collection;
import java.util.ArrayList;

public class EjemploArrayListMiProfe {

	public static void main(String[] args) {
		final int[] primos = {1, 2, 3, 4, 5, 7, 11, 13, 17, 19};
		
		final Collection<Integer> cPrim = new ArrayList<Integer> ();
		
		for(int i = 0; i < primos.length; i++) {
		   cPrim.add(primos[i]);  //Boxing automático
		}
		
		cPrim.remove(4);  //Boxing automático
		
		System.out.println("Lista de " + cPrim.size() + " números primos:");  
		
		//Recorrido con for-each y Unboxing automático
		for(int numPrimo: cPrim) {   
		   System.out.print(numPrimo + " ");  
		} 
	}

}
