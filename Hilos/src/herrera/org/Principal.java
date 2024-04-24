package herrera.org;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarea tarea = new Tarea();
		Thread hilo = new Thread(tarea);
		Thread hilo2 = new Thread(() -> System.out.println("HOLA SoY eL SeGunDo HilO"));

		
		System.out.println("HP: Voy a lanzar una tarea en paralelo");
		
		hilo.start();
		
		hilo2.start();
		
		
		System.out.println("HP: ya la he lanzado");
		
		
	}

}


class Tarea implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("H: Me he ejecutado em otro hilo");
	}
	
}