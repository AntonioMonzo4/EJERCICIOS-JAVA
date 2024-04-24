package herrera.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal apuesta = new Principal();
		apuesta.getApuesta();
		apuesta.getApuestas(6);
		

	}
	
	public static Set getApuesta() {
		
		
		HashSet<Integer> numeros = new HashSet<>();
		
		
		do {
			 numeros.add((int) (Math.random()*49)+1);

			
		} while (numeros.size()<6);
		
	
	System.out.println(numeros);
		return numeros;
		
	}
	
	public ArrayList getApuestas(int n) {
		
		ArrayList<HashSet> apuestas = new ArrayList<>();
		
		
		for(int i =0; i<n;i++) {
			apuestas.addAll(getApuesta());
		}
		
		return apuestas;
		
	}
	

}
