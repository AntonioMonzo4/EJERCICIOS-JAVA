import java.util.Scanner;

public class ManejoArray {

	public static void main(String[] args) {
		final int NUMVALORES = 10;
		int numero, mayor = 0, menor = 0, suma, total;
		double media;
		final int[] listaNumeros = new int[NUMVALORES];
		final Scanner sc = new Scanner (System.in);
		
		suma = 0;
		for (int i = 0; i < NUMVALORES; i++) {
			System.out.print("Número: ");
		    numero = sc.nextInt();
			listaNumeros[i] = numero;
		    suma = suma + numero;
		    if (i == 0) {
		    	mayor = numero;
		    	menor = numero;
		    }
		    else {
		    	if (numero > mayor) {mayor = numero;}
		    	if (numero < menor) {menor = numero;}
		    }
		}
		media = ((double)suma)/10;
		System.out.printf("\nLa media de la secuencia introducida es: %.2f\n", media);
		System.out.println("El máximo ha sido: " + mayor);
		System.out.println("El mínimo ha sido: " + menor);
		
		//Parte 2: Recorremos el array para calcular cuántos números superan la media
		total = 0;
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > media) {total++;}
		}
		System.out.println("El número de valores mayores que la media es: " + total);
		sc.close();
	}

}
