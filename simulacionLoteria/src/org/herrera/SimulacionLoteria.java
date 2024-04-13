package org.herrera;

import javax.swing.JOptionPane;

public class SimulacionLoteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numUsuarioM = JOptionPane.showInputDialog(null,"Introduce el número que juegas: ",0);
		int contador=1;
		
		int numUsuario = Integer.valueOf(numUsuarioM);
		
		int loteria=(int)(Math.random()*100000);
		do {
			if(loteria==numUsuario) {
				break;
			}
			loteria=(int)(Math.random()*100000);
			contador++;
			System.out.println(contador);
			
		}while(loteria!=numUsuario);
		
		JOptionPane.showMessageDialog(null,"Años: "+contador/52);
	}
	}


