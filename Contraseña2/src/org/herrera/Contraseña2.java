package org.herrera;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Contraseña2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String CONTRASEÑA = "secreto";
		final String CONTRASEÑA2 = "CONTRASEÑA";

		String conUsuario;
		String contraseñaU;
		final String NOMUSUARIO= "ana";
		final String NOMUSUARIO2= "juan";
		
		for(int i=1;i<=3;i++) {
			conUsuario=JOptionPane.showInputDialog("Escriba el usuario ");
			
			if((NOMUSUARIO.equals(conUsuario)||NOMUSUARIO2.equals(conUsuario))) {
				contraseñaU=JOptionPane.showInputDialog("Escriba la contraseña ");
				if((NOMUSUARIO.equals("ana")&&contraseñaU.equals(CONTRASEÑA))||(NOMUSUARIO2.equals("juan")&&CONTRASEÑA2.equals(contraseñaU))) {
					JOptionPane.showMessageDialog(null, "Contraseña correcta");
					break;
				}else {
					JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
					contraseñaU=JOptionPane.showInputDialog("Escriba la contraseña ");


				}

			}else {
				JOptionPane.showMessageDialog(null, "Usuario Incorrecto");

				conUsuario=JOptionPane.showInputDialog("Escriba el usuario ");

			}
			
		}

	}}
	


