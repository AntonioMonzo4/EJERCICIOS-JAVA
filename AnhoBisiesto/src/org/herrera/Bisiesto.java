package org.herrera;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		int anho;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el año: ");
		
		anho=sc.nextInt();
		
		if(anho%4==0 && anho%100!=0 || anho%400==0) {
			System.out.println("Es bisiesto");
			
		}else {
			System.out.println("No es bisiesto");
		}
	

	}

}
