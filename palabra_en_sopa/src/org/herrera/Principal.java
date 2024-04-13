package org.herrera;

import javax.swing.JOptionPane;

public class Principal {
	
	/**
	 * @author AntonioMonzo
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] sopa= creaSopa(20,20);
		setPalabra(sopa,"*****",5,5,true);
		setPalabra(sopa,"*****",10,10,false);
		setPalabra(sopa,"46738462898740932403",10,10,false);
		showSopa(sopa);

	}
	
	/**
	 * 
	 * @param filas: número de filas del array
	 * @param columnas: número de columnas del array
	 * @return array creada
	 */
	
	static String[][] creaSopa(int filas,int columnas){
		
		String [][] sopa = new String[filas][columnas];
		String letras[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		for(int i=0;i<sopa.length;i++) {
			
			for(int j=0;j<columnas;j++) {
				sopa[i][j]=letras[(int)(Math.random()*letras.length)];
			}
		}
		
		return sopa;
		
	}
	
	/**
	 * Muestra el array que pasamos como argumento
	 * @param array
	 */
	static void showSopa(String[][] array) {
		

		for(int t=0;t<array.length;t++) {
			
			for(int x=0;x<array[0].length;x++) {
				
				if(x<array[0].length-1) {
					
					System.out.print(array[t][x]);
					
				}else if(x==array[0].length-1){
					
					System.out.println(array[t][x]);
				}
				
			}
		}
		
	}
	
	/**
	 * 
	 * @param array
	 * @param palabra
	 * @param f
	 * @param c
	 * @param cardinalidad
	 */
	static void setPalabra(String[][]array, String palabra, int f , int c , boolean cardinalidad) {
		
		String[] letras= new String [palabra.length()];
		
		for(int a=0;a<palabra.length();a++) {
			
			letras[a]= ""+palabra.charAt(a);
		}
		if((letras.length+f>array.length && cardinalidad==true )|| (letras.length+c>array[0].length && cardinalidad==false )) {
			JOptionPane.showMessageDialog(null,"La palabra no cabe en esta posición reinicia el programa y cambia argumentos","",JOptionPane.ERROR_MESSAGE);
			
			
		}else if(cardinalidad==true) {
			int i=0;
			while(i<letras.length) {
				array[f][c]=letras[i];
				i++;
				f++;
			}
		}else if(cardinalidad==false) {
			int i=0;
			while(i<letras.length) {
				array[f][c]=letras[i];
				i++;
				c++;
			}
		}
	}
		

}
