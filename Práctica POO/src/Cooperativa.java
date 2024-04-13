import java.util.Timer;

/**
 * La clase cooperativa es la cual utilizaremos como main para el desarrollo de la pr�ctica
 * 
 *
 */

public class Cooperativa {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Controlador controlador = new Controlador();
		//Cargamos todos los datos de la aplicación(clientes, productos, productores..)
		controlador.cargaDatos();
		int opl = -1;
		int idLeido; //Opción subMenu

		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(controlador, 0, 60000); //60s

		while(opl != 0) {
			opl= menu.mostarMenuPrincipal();
			if(opl != 0){
				idLeido=menu.subMenuIdentificacion(opl, controlador);
				//Si no ha elegido salir en el submenu
				if(idLeido > 0 || idLeido == -1){
					switch (opl) {
						case 1:
							controlador.logicaDistribuidor(idLeido);
							break;
						case 2:
							controlador.logicaCliente(idLeido);
							break;
						case 3:
							controlador.logicaProductor(idLeido);
							break;
						case 4:
							controlador.mostrarInformes();
							break;
						case 0:
							//finaliza ejecución del main
							return;
						default:
							System.out.println("La opción eligida no extiste");

					}
				}

			}

		}

	}

}
