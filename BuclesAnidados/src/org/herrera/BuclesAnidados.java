package org.herrera;

import java.util.Scanner;

public class BuclesAnidados {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Cuantas filas quieres?: ");
		
		int n=sc.nextInt();
		
		
		for(int i=1;i<n;i++) {
			System.out.println();
			for(int j=1;j<i+1;j++) {
				
				System.out.print("*");
				
			}
		}
	}

}
