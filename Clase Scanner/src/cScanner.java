import java.util.Scanner;

public class cScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba un número:");
		
		int lecturaN;
		lecturaN=sc.nextInt();
		
		
		System.out.println("Escriba un número decimal:");
		
		double lecturaD;
		lecturaD=sc.nextDouble();
		
		sc.nextLine();//lectura previa necesaria 
		System.out.println("Escriba una frase:");
		
		String lecturaT;
		lecturaT=sc.nextLine();
		
		
		System.out.println("El número: "+lecturaN+"\nEl decimal: "+lecturaD+"\nLa frase: "+lecturaT);
		
		sc.close();
		

	}

}
