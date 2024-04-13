package 
org.herrera;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dialogo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] possibleValues = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		String selectedValue = (String) JOptionPane.showInputDialog(null, "Elige mes", "estaciones", JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);

		
		switch(selectedValue) {
		
		case "Enero":
		case "Febrero":
		case "Marzo":
			JOptionPane.showMessageDialog(null,null,"INVIERNO",0,new ImageIcon("D:\\invierno.png"));

			break;
		case "Abril":
		case "Mayo":
		case "Junio":
			JOptionPane.showMessageDialog(null,null,"PRIMAVERA",0,new ImageIcon("D:\\primavera.png"));

			break;
		case "Julio":
		case "Agosto":
		case "Septiembre":
			JOptionPane.showMessageDialog(null,null,"VERANO",0,new ImageIcon("D:\\verano.png"));

			break;
		case "Octubre":
		case "Noviembre":
		case "Diciembre":
			JOptionPane.showMessageDialog(null,null,"OTOÑO",0,new ImageIcon("D:\\otoño.png"));

			break;
		}
		
	}

}
