
public class Maquina {
    final static int MAXIMO = 10;

	public static void main(String[] args) {
		Pieza[] listado;
		int n = 0;
		double area;

		//Medidas de las piezas en centímetros
		listado = new Pieza[MAXIMO];
		listado[0] = new Rectangulo(3.15, 2.7, "Pieza-1R");
		listado[1] = new Rectangulo(7.5, 6.3, "Pieza-2R");
		listado[2] = new Circulo(2.4, "Pieza-3C");
		listado[3] = new Triangulo(7, 1.1, "Pieza-4T");
		listado[4] = new Triangulo(1, 3.5, "Pieza-5T");
		listado[5] = new Circulo(16.4, "Pieza-6C");
		listado[6] = new Pieza("Pieza-7?");

		System.out.println("INICIO DEL PROCESADO DE PIEZAS:\n");

		//Podemos usar listado[n].getNombre() porque la clase Pieza (tipo de listado[n]) tiene
		//el método getNombre(). Sin embargo no podemos usar directamente el método calculaArea()
		//sobre listado[n] porque Pieza no tiene ese método, por tanto, debemos hacer un
		//"Down Casting" a la subclase que realmente está almacenada en listado[n].
		while(listado[n] != null) {
		    System.out.print("La pieza " + listado[n].getNombre() + " tiene un área de: ");
            if(listado[n] instanceof Rectangulo)
                area = ((Rectangulo)listado[n]).calculaArea();
            else if (listado[n] instanceof Circulo)
            	area = ((Circulo)listado[n]).calculaArea();
            else if (listado[n] instanceof Triangulo)
            	area = ((Triangulo)listado[n]).calculaArea();
            else
            	area = 0;
            n++;
            System.out.print(String.format("%.3f", area));
            System.out.println(" cm2");
		}
		System.out.println("\nTODAS LAS PIEZAS HAN SIDO PROCESADAS");
	}

}
