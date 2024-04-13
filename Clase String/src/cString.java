/**
 * Clase que sirve para visualizar el uso de las clases string que son cadenas de caracteres
 * @author tonof
 *
 */
public class cString{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String texto= new String ("El Real Madrid es el mejor equipo de la historia.");
		
		System.out.println(texto);
		
		String texto1 ="\nGolazoooooo del Madrid.\n";
		
		System.out.print(texto1);
		
		//Los objetos Sting son inmutables
		
		
		//Algunos m�todos son:
		
		int tama,tama1;
		tama=texto.length();
		tama1=texto1.length();
		
		if(texto.equals(texto1)) {
			System.out.print("Las dos frases anteriores son iguales");
		}else {
			System.out.print("\nEl tama�o de ambos es distinto\n El primero mide: "+tama+"\n El segundo mide: "+tama1);
		}
		
		String remplazo = texto1.replaceAll("l Madrid", " Vin�cius");
		
		System.out.println(remplazo);
		
		String conc= texto1.concat(remplazo);
		
		System.out.println(conc);
		

	}

}
