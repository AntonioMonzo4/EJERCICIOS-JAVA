package herrera.org;

import java.util.Scanner;

public class TableroBuscaMinas {
	//final static int TAMAÑO=32;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minas;
		int tamaño;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño de las filas y columnas: ");
		tamaño=sc.nextInt();
		
		do {
			System.out.println("Cuantas minas quieres? Recuerda menor que el total de cuadriculas: fila*columna = "+tamaño*tamaño);
			minas=sc.nextInt();
			
		}while(minas>tamaño*tamaño);
		
		
		

		int array[][]=new int[tamaño][tamaño];
		
		for(int i =0;i<array.length;i++) {
			
			for(int j=0;j<array.length;j++) {
				
			array[i][j]=0;
			}
			
			
			
		}
		//CREACIÖN DE MINAS 
		for(int j=0;j<minas;j++) {
			
			int x=(int)(Math.random()*array.length);
			int y=(int)(Math.random()*array.length);
			
			if(array[x][y]==0) {
				array[x][y]=-1;
			}else {
				j--;
			}
			
		}
		
		//Dos primeros for recorren el array de 8x8
		
		for(int i =0;i<array.length;i++) {
			
			for(int j=0;j<array.length;j++) {
				
				if(array[i][j]==-1) {
					for(int f=i-1;f<=i+1;f++) {
						
						for(int c=j-1;c<=j+1;c++) {
							
							if(f<0||f>=array.length||c<0||c>=array.length || array[f][c]==-1) {
								continue;
							}else {
								array[f][c]+=1;
								array[i][j]=-1;
							}
							
						}
					}
				}else {
						continue;
					}
				}
			}

		for(int i =0;i<array.length;i++) {
			
			for(int j=0;j<array.length;j++) {
				
				if(j<array.length-1) {
					
					if(array[i][j]==-1) {
						
						System.out.print(array[i][j]+" ");
						
					}else {
						
						System.out.print(" "+array[i][j]+" ");}
					//System.out.print(array[i][j]+" ");
				}else if(j==array.length-1){
					//System.out.println(array[i][j]);
					if(array[i][j]==-1) {
						
						System.out.println(array[i][j]+" ");
						
					}else {
						
						System.out.println(" "+array[i][j]+" ");	
					}
				}
			}
		}
	}	
}
