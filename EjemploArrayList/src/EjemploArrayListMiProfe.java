import java.util.Collection;
import java.util.ArrayList;

public class EjemploArrayListMiProfe {

	public static void main(String[] args) {
		final int[] primos = {1, 2, 3, 4, 5, 7, 11, 13, 17, 19};
		
		final Collection<Integer> cPrim = new ArrayList<Integer> ();
		
		for(int i = 0; i < primos.length; i++) {
		   cPrim.add(primos[i]);  //Boxing autom�tico
		}
		
		cPrim.remove(4);  //Boxing autom�tico
		
		System.out.println("Lista de " + cPrim.size() + " n�meros primos:");  
		
		//Recorrido con for-each y Unboxing autom�tico
		for(int numPrimo: cPrim) {   
		   System.out.print(numPrimo + " ");  
		} 
	}

}
