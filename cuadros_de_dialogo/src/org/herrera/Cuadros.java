package org.herrera;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Cuadros {

	public static void main(String[] args) {
		
		String [] array = {"JAVA","Hola"};
		
		JButton boton = new JButton("Pulsa aquí");
		
		JColorChooser cc = new JColorChooser();
		
		JFileChooser jfc = new JFileChooser();
		
		JOptionPane.showMessageDialog(null,"Hola Mundo");
		
		JOptionPane.showMessageDialog(null,"Hooola Mundooo","título",JOptionPane.ERROR_MESSAGE);

		JOptionPane.showMessageDialog(null,"Hooola Mundooo","título",JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\descarga.png"));

		JOptionPane.showMessageDialog(null,boton,"título",JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\descarga.png"));

		JOptionPane.showMessageDialog(null,cc,"título",JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\descarga.png"));

		JOptionPane.showMessageDialog(null,jfc,"título",JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\descarga.png"));

		JOptionPane.showMessageDialog(null,array,"título",JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\descarga.png"));

	}

}
