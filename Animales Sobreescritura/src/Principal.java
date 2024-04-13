//Clase principal del programa que creara los nuevos objetos que se han creado a su vez en otras clases 
public class Principal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Gato animal2 = new Gato();
		Leon animal3 = new Leon();
		
		animal1.queSoy();
		animal2.queSoy();
		animal3.queSoy();
    }

}
