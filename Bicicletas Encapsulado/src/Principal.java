
public class Principal {

	public static void main(String[] args) {
		MountainBike biciMonte = new MountainBike(20, 30);  //20 mil�metros, 30 dientes
		SpaceBike biciEspacial = new SpaceBike(15, 30);  //15 w de potencia, 30 dientes
		Bike biciNormal = new Bike(35);  //35 dientes
		
		System.out.println("Cogemos la bicicleta de monta�a:");
		biciMonte.corre();
		biciMonte.saltaObstaculo();
		biciMonte.para();
		System.out.println("\nCogemos la bicicleta espacial:");
		biciEspacial.corre();
		biciEspacial.vuela();
		biciEspacial.para();
		System.out.println("\nCogemos la bicicleta cl�sica:");
		biciNormal.corre();
		//biciNormal.vuela();  //Produce un error (Bike no tiene el m�todo vuela)
		biciNormal.para();
    }

}
