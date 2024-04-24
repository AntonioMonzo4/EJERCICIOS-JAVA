package herrera.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] naipes = { "bastos-1", "bastos-2", "bastos-3", "bastos-4", "bastos-5", "bastos-6", "bastos-7",
				   "bastos-8", "bastos-9", "bastos-10", "bastos-11", "bastos-12", "copas-1", "copas-2", "copas-3",
				   "copas-4", "copas-5", "copas-6", "copas-7", "copas-8", "copas-9", "copas-10", "copas-11", "copas-12",
				   "espadas-1", "espadas-2", "espadas-3", "espadas-4", "espadas-5", "espadas-6", "espadas-7", "espadas-8",
				   "espadas-9", "espadas-10", "espadas-11", "espadas-12", "oros-1", "oros-2", "oros-3", "oros-4", "oros-5",
				    "oros-6", "oros-7", "oros-8", "oros-9", "oros-10", "oros-11", "oros-12" };
		
	
		
		List<Object> lista = new ArrayList<>();
		List<Object> mano1 = new ArrayList<>();
		List<Object> mano2 = new ArrayList<>();
	

		lista=Arrays.asList(naipes);
		Collections.shuffle(lista);
		
		
		for (int i = 0; i < 5; i++) {
			mano1.add(i, lista.get(i));
			
		}
		for (int i = 0; i < 5; i++) {
			mano2.add(i, lista.get(i+5));
			
			
		}
		
		System.out.println(mano1);
		System.out.println(mano2);
		
		Iterator it = lista.iterator();
		int i=1;
		while ( it.hasNext() ) {
			
			if(i<=12) {
				   System.out.print( " | "+it.next()+" | " );
				   i++;
			}else {
				i=1;
				System.out.println();
			}
			
		}
	}

}
