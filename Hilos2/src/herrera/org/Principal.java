package herrera.org;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JWindow;

public class Principal {
	static Thread hiloPrincipal;
	static Thread[] hilos;

	public static void main(String[] args) throws InterruptedException {

		hiloPrincipal = Thread.currentThread();
		// TODO Auto-generated method stub
		Coche c1 = new Coche(Color.green, 10);
		Coche c2 = new Coche(Color.gray, 60);
		Coche c3 = new Coche(Color.red, 110);
		Coche c4 = new Coche(Color.blue, 160);
		Coche c5 = new Coche(Color.PINK, 210);
		Coche c6 = new Coche(Color.CYAN, 260);
		Coche c7 = new Coche(Color.yellow, 310);

		Thread hilo1 = new Thread(c1);
		Thread hilo2 = new Thread(c2);
		Thread hilo3 = new Thread(c3, "hilo3"); // nombre cambiando el constructor
		Thread hilo4 = new Thread(c4);
		Thread hilo5 = new Thread(c5);
		Thread hilo6 = new Thread(c6);
		Thread hilo7 = new Thread(c7);

		hilos = new Thread[] { hilo1, hilo2, hilo3, hilo4, hilo5, hilo6, hilo7 };

		System.out.println("Lanzo hilos");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();
		hilo7.start();

		try {
			Thread.sleep(500000);

		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("HP: DESPERTE");
		}

		System.out.println("HP: trabajando");

	}

}

class Coche extends JWindow implements Runnable {

	int x = 0, y;
	int ancho;

	public Coche(Color color, int y) {
		// TODO Auto-generated method stub
		this.y = y;
		ancho = Toolkit.getDefaultToolkit().getScreenSize().width;
		this.setBounds(x, 10, 80, 40);
		this.getContentPane().setBackground(color);
		this.setVisible(true);

	}

	@Override
	public void run() {
		Thread hiloActual = Thread.currentThread();
		int handicap = 0;// ventaja
		System.out.println(hiloActual.getName() + " empieza. ");

		if (hiloActual.getName().equals("Thread-5")) {
			handicap = 3;
		}
		if (hiloActual.getName().equals("Thread-0")) {
			handicap = -9;
		}
		while (x < ancho - 80) {
			x += 10 + handicap;
			this.setLocation(x, y);
			try {
				Thread.sleep((int) Math.random() * 2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		this.setLocation(ancho - 80, y);
		System.err.println(hiloActual.getName() + "  termina. ");

		int cont = 0;

		this.dispose();

		for (Thread h : Principal.hilos) {
			if (h.isAlive())
				cont++;
			if (cont > 1)
				break;

		}
		if (cont == 1) {
			Principal.hiloPrincipal.interrupt();

		}

	}

}
