import java.util.Scanner;

public class cScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba un n�mero:");
		
		int lecturaN;
		lecturaN=sc.nextInt();
		
		
		System.out.println("Escriba un n�mero decimal:");
		
		double lecturaD;
		lecturaD=sc.nextDouble();
		
		sc.nextLine();//lectura previa necesaria 
		System.out.println("Escriba una frase:");
		
		String lecturaT;
		lecturaT=sc.nextLine();
		
		
		System.out.println("El n�mero: "+lecturaN+"\nEl decimal: "+lecturaD+"\nLa frase: "+lecturaT);
		
		sc.close();
		

	}

}
