//Clase que contiene un método de la clase Animal y le da uso sencillo 
public class Gato extends Animal {
	@Override
	public void queSoy() {
	    System.out.print ("Soy un gato, por tanto... ");
	    super.queSoy();
	}
}
