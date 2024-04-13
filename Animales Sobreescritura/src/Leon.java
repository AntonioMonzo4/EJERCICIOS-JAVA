//Clase que contiene un método de la clase Animal y le da uso sencillo 
public class Leon extends Animal {
	@Override
	public void queSoy() {
	    System.out.print ("Soy un león, por tanto... ");
	    super.queSoy();
	}
}
