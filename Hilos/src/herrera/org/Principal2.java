package herrera.org;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caballo c1 = new Caballo(1);
		Caballo c2 = new Caballo(2);
		Caballo c3 = new Caballo(3);
		Caballo c4 = new Caballo(4);

		Thread hilo = new Thread(c1);
		Thread hilo2 = new Thread(c2);
		Thread hilo3 = new Thread(c3);
		Thread hilo4 = new Thread(c4);

		hilo.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();

		
	}

	
	

}
class Caballo implements Runnable {
	int dorsal;
	
	public Caballo(int dorsal) {
		this.dorsal=dorsal;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int distancia =0 ;
		while (distancia <1e6) {
			distancia++;
			if(distancia % 10000==0) {
				System.out.print(dorsal);
			}
		}

		System.err.println("\nHa llegado "+dorsal);
	}
}