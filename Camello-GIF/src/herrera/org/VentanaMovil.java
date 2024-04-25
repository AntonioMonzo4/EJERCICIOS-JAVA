package herrera.org;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class VentanaMovil extends JWindow implements Runnable {

	Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize(); // Devuelve las medidas de la pantalla
	static int y=10;

	public VentanaMovil(Color color) {

		// CREAR VENTANA
		this.getContentPane().setBackground(color);
		this.setLocation(0, y);
		y=y+100;
		this.setSize(80, 80);
		this.setVisible(true);

	}
	
	public VentanaMovil(String ruta) {

		// CREAR VENTANA
		this.setBackground(new Color(0,0,0,0));
		
		JLabel label = new JLabel(new ImageIcon(ruta),JLabel.RIGHT);
		this.add(label);
		
		this.setLocation(0, y);
		y=y+150;
		this.setSize(191, 150);
		this.setVisible(true);

	}

	@Override
	public void run() {

		int x = 0; // Inicio del recorrido


		while (x < dimPantalla.width - this.getWidth()) {

			x += 10;

			this.setLocation(x, this.getY());
			try {
				Thread.sleep((int) (Math.random() * 30));
			} catch (InterruptedException e) {

			}

		}

		/*try {
			Thread.sleep(2000);// Espera 2 segundos antes de desaparecer
		} catch (InterruptedException e) {}
		*/
		this.dispose();// Desaparece
		System.out.println(Thread.currentThread().getName()+ " HA LLEGADO");

	}

}
