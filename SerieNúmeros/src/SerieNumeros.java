
import java.util.Scanner;

public class SerieNumeros {	
	public static void main(String[] args) {
		//Diseñar y codificar en java una aplicación que lea del terminal una serie de números enteros terminada
		//en 0, y que muestre por pantalla la media, el mayor y el menor de dicha serie sin incluir el 0.        
		double contador=0;
		double suma=0;
		double numeroLeido;
		double media=0;
		double menor=100;
		double mayor=0;
		Scanner sc = new Scanner(System.in);							
		System.out.println("Dame el primer numero: ");
		numeroLeido=sc.nextInt();	
		if(numeroLeido==0){
			System.out.println("No se pueden hacer los cálculos porque no ha introducido números");
		    System.out.print("Se han leido: "+ contador);
		}
		else{
			while(numeroLeido!=0){				
			suma+=numeroLeido;
			contador++;
			media=suma/contador;
			if(numeroLeido<=menor){menor=numeroLeido;}
			else if(numeroLeido>=mayor){mayor=numeroLeido;}			
			System.out.println("Dame el proximo numero: ");	
			numeroLeido=sc.nextInt();			
		}		
	        System.out.println("Se han leido:"+ contador);
	        System.out.println("la media es: " + media);
	        System.out.println("el menor es: " + menor);
	        System.out.println("el mayor es: " + mayor);
		}
		sc.close();
		}
		
}
