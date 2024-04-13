
public class Principal {

	public static void main(String[] args) {
		MountainBike biciMonte = new MountainBike(20, 30);  //20 milímetros, 30 dientes
		SpaceBike biciEspacial = new SpaceBike(15, 30);  //15 w de potencia, 30 dientes
		Bike biciNormal = new Bike(35);  //35 dientes
		
		System.out.println("Cogemos la bicicleta de montaña:");
		biciMonte.corre();
		biciMonte.saltaObstaculo();
		biciMonte.para();
		System.out.println("\nCogemos la bicicleta espacial:");
		biciEspacial.corre();
		biciEspacial.vuela();
		biciEspacial.para();
		System.out.println("\nCogemos la bicicleta clásica:");
		biciNormal.corre();
		//biciNormal.vuela();  //Produce un error (Bike no tiene el método vuela)
		biciNormal.para();
    }

}
