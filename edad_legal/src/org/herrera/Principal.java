package org.herrera;

import javax.swing.JOptionPane;

/**
 * @author AntonioMonzo
 *
 */

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		preguntaEdad();
	}
	/**
	 * Pregunta la edad mediante un JOptionPane y tras comparar la edad introducida con una estructura if else 
	 * muestra los distintos mensajes por pantalla
	 */
	
	static void preguntaEdad() {
		;
		String edad =JOptionPane.showInputDialog("Porfavor introduce tu edad: ");
		if(Integer.valueOf(edad)<0) {
			
			JOptionPane.showMessageDialog(null,"EDAD INCORRECTA: todavía no existes","",JOptionPane.ERROR_MESSAGE);
			
		}else if(Integer.valueOf(edad)<18) {
			
			JOptionPane.showMessageDialog(null,"Eres menor de edad","",JOptionPane.ERROR_MESSAGE);

		}else if(Integer.valueOf(edad)>=18 && Integer.valueOf(edad)<120) {
			
			JOptionPane.showMessageDialog(null,"Entra a jugar al casino");
			
		}else if(Integer.valueOf(edad)>=120) {
			

			JOptionPane.showMessageDialog(null,"EDAD INCORRECTA: deberías haber muerto hace mucho","",JOptionPane.ERROR_MESSAGE);
			
		}
	}

}
