package herrera.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		Map<Integer, ArrayList<Object> > mapa = new HashMap<>();
		
		ArrayList<Object> arr= new ArrayList<>();
		arr.add("Álava");
		arr.add("P.Vasco");
		arr.add("3097");

		
		mapa.put(1, arr);
		
		arr= new ArrayList<>();
		
		arr.add("Teruel");
		arr.add("Aragón");
		arr.add("14810");

		
		mapa.put(2, arr);
		
		arr= new ArrayList<>();
		
		arr.add("Huesca");
		arr.add("Aragón");
		arr.add("1980");

		
		mapa.put(3, arr);

		
		// arr.clear();
		// guarda referencia no dato CUIDADO
		
		System.out.println(mapa);
	}

}
