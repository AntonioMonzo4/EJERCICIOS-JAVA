package herrera.org;

import java.awt.Color;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread hilo= new Thread(new VentanaMovil(Color.GREEN));
		//hilo.start();
		
	
		

		Thread hilo4= new Thread(new VentanaMovil("img/c.gif"));
		hilo4.start();
		
		Thread hilo3= new Thread(new VentanaMovil("img/c.gif"));
		hilo3.start();
		
		Thread hilo2= new Thread(new VentanaMovil("img/c.gif"));
		hilo2.start();
		
		Thread hilo= new Thread(new VentanaMovil("img/c.gif"));
		hilo.start();
		
		Thread hilo5= new Thread(new VentanaMovil("img/c.gif"));
		hilo5.start();
		
		Thread hilo6= new Thread(new VentanaMovil("img/c.gif"));
		hilo6.start();
		
		System.out.println("YA HAN TERMINADO TODOS LOS HILOS");
		
		

		
	}

}
