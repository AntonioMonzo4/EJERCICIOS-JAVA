package herrera.org;

import java.awt.Color;

public class Principal {

	static Object monitor = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Thread hilo= new Thread(new VentanaMovil(Color.GREEN));
		//hilo.start();
		
	
		

		Thread hilo4= new Thread(new HiloDescifrador("img/c.gif"));
		hilo4.start();
		
		Thread hilo3= new Thread(new HiloDescifrador("img/c.gif"));
		hilo3.start();
		
		Thread hilo2= new Thread(new HiloDescifrador("img/c.gif"));
		hilo2.start();
		
		Thread hilo5= new Thread(new HiloDescifrador("img/c.gif"));
		hilo5.start();
		
		Thread hilo= new Thread(new HiloDescifrador("img/c.gif"));
		hilo.start();
		
		Thread hilo6= new Thread(new HiloDescifrador("img/c.gif"));
		hilo6.start();
		
		
		
		
		synchronized(monitor){
			
		monitor.wait();//Hasta que no terminen los hilos (notify) no se puede pasar al principal
		
		}
		
		
		System.out.println();//Aqui tenemos que poner las distintas ventanas pero al crearlas de una no podemos hacerlo 
		System.out.println("YA HAN TERMINADO TODOS LOS HILOS");
		
		
		
		

		
	}

}
