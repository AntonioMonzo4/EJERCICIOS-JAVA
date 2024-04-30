package herrera.org;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class HiloDescifrador extends JWindow implements Runnable {

	static Dimension dimPantalla = Toolkit.getDefaultToolkit().getScreenSize(); // Devuelve las medidas de la pantalla
	static int y=10;
	private static int cont=0;
	int dado=-1;
	static int ancho= dimPantalla.width;
			
			
			
	
	public HiloDescifrador(Color color) {

		// CREAR VENTANA
		this.getContentPane().setBackground(color);
		this.setLocation(0, y);
		y=y+100;
		this.setSize(80, 80);
		this.setVisible(true);
		

	}
	
	public HiloDescifrador(String ruta) {

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

		cont++;
		int x = 0; // Inicio del recorrido

		

		while (x < ancho - this.getWidth()) {

			x += 5;

			this.setLocation(x, this.getY());
			try {
				Thread.sleep((int) (Math.random() * 30));
			} catch (InterruptedException e) {

			}

		}
		
		ancho=0;

		/*try {
			Thread.sleep(2000);// Espera 2 segundos antes de desaparecer
		} catch (InterruptedException e) {}
		*/
		System.out.println(Thread.currentThread().getName()+ " HA LLEGADO");
		cont--;
		
		dado=(int)Math.random()*6+1;
		
		if(cont==0) {
			synchronized(Principal.monitor){
				Principal.monitor.notify();
			}
			
		}	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dispose();// Desaparece

	}

	public int getDato() {
		return dado;
	}
}
