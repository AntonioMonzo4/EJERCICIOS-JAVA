package org.herrera;

import javax.swing.JOptionPane;

public class CuadroDeDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String opciones []= {"cero","uno","dos","tres","cuatro","cinco","seis"};
		int eleccion = JOptionPane.showOptionDialog(null,"Elija el ejemplo que desea visualizar","information",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[5]);
		
		switch(eleccion) {
		
		case 0:
			JOptionPane.showMessageDialog(null, "alert","alert",JOptionPane.ERROR_MESSAGE);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "information","information",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showConfirmDialog(null, "choose one", "choose one", JOptionPane.YES_NO_OPTION);
			break;
		case 3:
			JOptionPane.showInternalConfirmDialog(null, "please choose one","information",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			Object[] options = {"OK","CANCEL"};
			JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			break;
		case 5:
			String inputValue =JOptionPane.showInputDialog("Please input a value");
			break;
		case 6://BIS 2
			Object[] possibleValues = {"First","Second","Third"};
			Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
			break;
		
		}
	}

}
