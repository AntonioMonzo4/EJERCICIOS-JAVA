import java.util.Collection;
import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primos = {1, 2, 3, 4, 5, 7, 11, 13, 17, 19};
		Collection<Integer> cPrim = new ArrayList<Integer> ();
		
		for(int i = 0; i < primos.length; i++) {
		   cPrim.add(primos[i]);  //Boxing autom�tico
		}
		//No se puede usar for-each con add o remove
		/*for(int i: primos) {   
			cPrim.add(primos[i]);
		}*/
		//Borrado directo del valor 4
		cPrim.remove(4);  //Boxing autom�tico
		
		//Recorrido de ArrayList imprimiendo lista y borrando un valor
		/*System.out.println("Recorrido cPrimo con Iterador borrando el valor 4:");
		Iterator<Integer> iter = cPrim.iterator();
		while (iter.hasNext()) {
		   int nPrimo = iter.next();  //Unboxing
		   if (nPrimo != 4)
		      System.out.print(nPrimo + " ");
		   else 
			   iter.remove();
		}*/
		
		System.out.println("\nLista de " + cPrim.size() + " n�meros primos:");  
		//Recorrido con for-each y Unboxing autom�tico
		for(int numPrimo: cPrim) {   
		   System.out.print(numPrimo + " ");  
		} 

	}

}