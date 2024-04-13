package herrera.org;

import javax.swing.JOptionPane;

public class NIF {

	public static void main(String[] args) {

		String [] NIF= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		String DNI=JOptionPane.showInputDialog(null,"Escribe tus números del DNI: ",null,JOptionPane.DEFAULT_OPTION);
		
		int numDNI=Integer.valueOf(DNI);
		JOptionPane.showMessageDialog(null, NIF[numDNI%23],"Letra",JOptionPane.DEFAULT_OPTION);
	}

}
