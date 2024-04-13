package org.herrera;


import javax.swing.JOptionPane;



public class Contraseña1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String contraseña = "secreto";
		String conUsuario;
		
			for(int i=1;i<=3;i++) {
				conUsuario=JOptionPane.showInputDialog("Escriba la contraseña: ");
				
				if(!contraseña.equals(conUsuario)) {
					
					JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
				}else if(contraseña.equals(conUsuario)){
					JOptionPane.showMessageDialog(null, "Contraseña correcta");
					break;

				}
				
			}

		}
		
	}

