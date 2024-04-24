package herrera.org;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JWindow;

public class Principal3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Coche c1 = new Coche(Color.green, 10);
		Coche c2 = new Coche(Color.gray, 60);
		Coche c3 = new Coche(Color.red, 110);
		Coche c4 = new Coche(Color.blue, 160);
		Coche c5 = new Coche(Color.PINK, 210);
		Coche c6 = new Coche(Color.CYAN, 260);
		Coche c7 = new Coche(Color.yellow, 310);

//COCHES 2		

		/*
		 * Coche2 c21 = new Coche2(Color.DARK_GRAY,60); Coche2 c22 = new
		 * Coche2(Color.white,160); Coche2 c23 = new Coche2(Color.MAGENTA,260); Coche2
		 * c24 = new Coche2(Color.orange,360); Coche2 c25 = new Coche2(Color.green,460);
		 * Coche2 c26 = new Coche2(Color.CYAN,560); Coche2 c27 = new
		 * Coche2(Color.yellow,660);
		 */

		Thread hilo1 = new Thread(c1);
		Thread hilo2 = new Thread(c2);
		Thread hilo3 = new Thread(c3, "hilo3"); // nombre cambiando el constructor
		Thread hilo4 = new Thread(c4);
		Thread hilo5 = new Thread(c5);
		Thread hilo6 = new Thread(c6);
		Thread hilo7 = new Thread(c7);

//COCHES 2
		/*
		 * Thread hilo21 = new Thread(c21); Thread hilo22 = new Thread(c22); Thread
		 * hilo23 = new Thread(c23); Thread hilo24 = new Thread(c24); Thread hilo25 =
		 * new Thread(c25); Thread hilo26 = new Thread(c26); Thread hilo27 = new
		 * Thread(c27);
		 */

		System.out.println("Lanzo hilos");
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();
		hilo7.start();
		hilo7.join();//Parar el hilo principal
		System.out.println("HP: trabajando");

//COCHES 2
		/*
		 * hilo21.start(); hilo22.start(); hilo23.start(); hilo24.start();
		 * hilo25.start(); hilo26.start(); hilo27.start();
		 * 
		 */

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
		System.out.println(hiloActual.getName()+ " empieza. ");

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
		
		this.setLocation(ancho-80, y);
		System.out.println(hiloActual.getName()+"  termina. ");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dispose();

	}

}

/*
 * class Coche2 extends JWindow implements Runnable{
 * 
 * int x,y=0; int ancho;
 * 
 * public Coche2 (Color color , int x){ // TODO Auto-generated method stub
 * this.x=x; ancho= Toolkit.getDefaultToolkit().getScreenSize().height;
 * this.setBounds(x,10,80,40); this.getContentPane().setBackground(color);
 * this.setVisible(true);
 * 
 * }
 * 
 * @Override public void run() { while(y<ancho-80) { y+=5; this.setLocation(x,
 * y); try { Thread.sleep((int)Math.random()*2); } catch (InterruptedException
 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * 
 * } try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } this.dispose();
 * 
 * 
 * }
 */
