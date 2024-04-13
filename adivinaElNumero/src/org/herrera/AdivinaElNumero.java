package org.herrera;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rd= Math.random()*6+1;
		Scanner sc = new Scanner(System.in);
		int numSecreto =(int)rd;
		int contador=1;
		int numUsuario;
		
		System.out.println("Escribe el número");
		numUsuario=sc.nextInt();
		if(numSecreto==numUsuario) {
			System.out.println("A la primera");
			
		}
		while(numSecreto!=numUsuario) {
			contador++;
			System.out.println("Error prueba otra vez");
			numUsuario=sc.nextInt();
			
		}
		System.out.println("BIEN!!! Has usado: "+contador+" intento/s");
	}

}
