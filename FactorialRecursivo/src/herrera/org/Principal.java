package herrera.org;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		System.out.println(factorial(n));
		
	}
	
	static int factorial(int numero) {
		int f=1;
		if(numero>0) {

			f=numero*factorial(numero-1);
		
			
		}
		return f;
	}

}
