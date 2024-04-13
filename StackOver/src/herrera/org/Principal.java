package herrera.org;

public class Principal {

	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		
			factorial(5);
		
		} catch (StackOverflowError e) {
			System.out.println("Se agotó el stack en la llamada: " +i);
			System.out.println(e);
		}
	}

	static int factorial(int numero) {
		i++;
		int f=1;
		f=numero*factorial(numero-1);
		return f;
	}
}
