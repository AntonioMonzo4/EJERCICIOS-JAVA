//Clase que contiene un m�todo de la clase Animal y le da uso sencillo 
public class Leon extends Animal {
	@Override
	public void queSoy() {
	    System.out.print ("Soy un le�n, por tanto... ");
	    super.queSoy();
	}
}
