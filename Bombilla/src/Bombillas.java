// uso de la clase Bombilla
public class Bombillas {
		public static void main(String[] args)
		{
			// Crear dos objetos Bombilla, estado "OFF"
			Bombilla bSalon = new Bombilla("OFF");
			Bombilla bCocina = new Bombilla("OFF");
			// Imprimir estado objetos (valor atributo on_off)
			System.out.println ("La bombilla del salón está a  "+ bSalon.getEstado());
			System.out.println ("La bombilla de ls cocina está a  "+ bCocina.getEstado());
			// Invocar método encender
			bSalon.encender();
			bCocina.encender();
			// Imprimir estado objetos (valor atributo on_off)
			System.out.println ("La bombilla del salón está a  "+ bSalon.getEstado());
			System.out.println ("La bombilla de ls cocina está a  "+ bCocina.getEstado());
	   }
	}