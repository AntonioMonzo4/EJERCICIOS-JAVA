package herrera.org;

import java.util.Scanner;

public class SumaDeVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuántas veces?");
		veces=sc.nextInt();
		int [] array1 = new int[veces];
		int [] array2 = new int[veces];
		int [] array3 = new int[veces];
		
		for(int i= 0;i<veces;i++) {
			array1[i]=(int)(Math.random()*6+1);
			array2[i]=(int)(Math.random()*6+1);
			array3[i]=array1[i]+array2[i];
		}
	
		for(int j= 0;j<veces;j++) {
			System.out.print(array1[j]+" ");

		
		 
		}
		System.out.println();
		for(int j= 0;j<veces;j++) {


			System.out.print(array2[j]+" ");

		 
		}
		System.out.println();
		for(int j= 0;j<veces;j++) {
	



			System.out.print(array3[j]+" ");
		 
		}
		
		
		
	}

}
