/**
 * La clase menu contiene los menus que se visualizan por pantalla
 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {

	static final int MAX_KG_COMPRA_CLIENTE_FINAL = 100;
	static final int MIN_KG_COMPRA_DISTRIBUIDOR = 1000;
	static final int MAX_DISTANCIA_ENVIO = 1000;
	
	/**
	 * Muestra el menu principal
	 * 
	 */
	public int mostarMenuPrincipal() {
		Scanner opcionLeida = new Scanner(System.in);
		
		System.out.println("Elija una opción: ");
		System.out.println("-------------------------------");
		System.out.println("1- Distribuidor	              -" );
		System.out.println("2- Cliente                    -" );
		System.out.println("3- Productor                  -" );
		System.out.println("4- Informes                   -" );
		System.out.println("0- Salir                      -" );
		System.out.println("-------------------------------");

		
		return opcionLeida.nextInt();
	}
	
	/**
	 * Muestra el submenu derivado de la primera elección del menu principal
	 * 
	 */

	public int subMenuDistribuidorCliente() {

		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = 0;
		//Se muestra el menú mientras no teclee una de las opciones que se muestran (1,2 ó 3)
		while(!Arrays.asList(1,2,3).contains(opcionLeida)) {
			System.out.println("-------------------------------");
			System.out.println("1-Comprar producto            -");
			System.out.println("2-Estado de pedidos           -");
			System.out.println("3-Atrás                       -");
			System.out.println("-------------------------------");
			opcionLeida = subOpcion.nextInt();
		}
		return opcionLeida;

	}


	public int subMenuIdentificacion(int tipoDeUsuario, Controlador controlador) {
		int listaSize = 0;
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = -1;
		while((opcionLeida < 1 || opcionLeida > listaSize) && opcionLeida != 0){
			System.out.println("-------------------------------");
			System.out.println("Seleccione uno: ");
			switch (tipoDeUsuario) {
				case 1:
					listaSize = controlador.listarDistribuidores();
					break;
				case 2:
					listaSize = controlador.listarClientes();
					break;
				case 3:
					listaSize = controlador.listarProductores();
					break;
				default:
					System.out.println("La opción eligida no extiste");
			}
			System.out.println("0 - Salir");
			System.out.println("-------------------------------");
			opcionLeida = subOpcion.nextInt();
		}

		return opcionLeida;

	}
	
	public int subMenuInformes() {
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = -1;
		//Se muestra el menú mientras no teclee una de las opciones que se muestran (1,2,3,4,5)
		while((opcionLeida < 1 || opcionLeida > 5) && opcionLeida != 0) {
			System.out.println("-------------------------------");
			System.out.println("1-Ventas totales              -");
			System.out.println("2-Importes productores        -");
			System.out.println("3-Importes logística          -");
			System.out.println("4-Beneficios Cooperativa      -");
			System.out.println("5-Evolución Precios           -");
			System.out.println("0-Salir                       -");
			System.out.println("-------------------------------");
			opcionLeida = subOpcion.nextInt();
		}
		return opcionLeida;
	}


	public int subMenuProductor() {

		Scanner subOpcion= new Scanner(System.in);

		//TODO Implementar
		return subOpcion.nextInt();

	}


	public int mostrarMenuProductos(List<Producto> listaProductos) {
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = -1;
		while((opcionLeida < 1 || opcionLeida > listaProductos.size()) && opcionLeida != 0){
			System.out.println("-------------------------------");
			System.out.println("Elija el producto a comprar: ");
			for(Producto producto: listaProductos) {
				System.out.println(producto.getId()+".- "+producto.getNombre() +" - "+producto.getValorRefKilogramo());
			}

			System.out.println("0 - Atrás");
			System.out.println("-------------------------------");
			opcionLeida = subOpcion.nextInt();
		}

		return opcionLeida;

	}

	public int pedirCantidadProductoCliente(int kgStock) {
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = 0;
		System.out.println("Por favor, escriba la cantidad de producto en Kg a comprar (máximo 100Kg): ");
		while(opcionLeida > MAX_KG_COMPRA_CLIENTE_FINAL || opcionLeida > kgStock){
			opcionLeida = subOpcion.nextInt();
			if(opcionLeida > kgStock){
				System.out.println("Puede comprar como máximo " + kgStock + "Kg, por favor, pruebe con otra cantidad menor: ");
			}else if(opcionLeida < MAX_KG_COMPRA_CLIENTE_FINAL){
				System.out.println("No puede comprar más de 100Kg, por favor, escriba una cantidad válida:");
			}
		}

		return opcionLeida;
	}

	public int pedirCantidadProductoDistribuidor(int kgStock) {
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = 0;
		System.out.println("Por favor, escriba la cantidad de producto en Kg a comprar (mínimo 1000Kg): ");
		while(opcionLeida < MIN_KG_COMPRA_DISTRIBUIDOR || opcionLeida > kgStock){
			opcionLeida = subOpcion.nextInt();
			if(opcionLeida > kgStock){
				System.out.println("Puede comprar como máximo " + kgStock + "Kg, por favor, pruebe con otra cantidad menor: ");
			}else if(opcionLeida < MIN_KG_COMPRA_DISTRIBUIDOR){
				System.out.println("No puede comprar menos de 1000Kg, por favor, escriba una cantidad válida: ");
			}
		}

		return opcionLeida;
	}
	public int pedirDistanciaEnvio() {
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = 9999;
		System.out.println("Por favor, escriba la distancia en Km hasta el destino (máximo "  + MAX_DISTANCIA_ENVIO + " Km): ");
		while(opcionLeida > MAX_DISTANCIA_ENVIO){
			opcionLeida = subOpcion.nextInt();
			if(opcionLeida > MAX_DISTANCIA_ENVIO){
				System.out.println("No puede solicitar envío a más de " + MAX_DISTANCIA_ENVIO + " Km, por favor, escriba una distancia válida:");
			}
		}
		return opcionLeida;
	}

	public int pedirEmpresaLogistica(List<Logistica> listaLogistica) {
		Scanner subOpcion = new Scanner(System.in);
		int opcionLeida = -1;
		while((opcionLeida < 1 || opcionLeida > listaLogistica.size()) && opcionLeida != 0){
			System.out.println("-------------------------------");
			System.out.println("Seleccione la empresa de logística que realiza el envío: ");
			for(Logistica logistica: listaLogistica) {
				System.out.println(logistica.getIdLogistica()+".- "+logistica.getNombreEmpresa());
			}

			System.out.println("0 - Atrás");
			System.out.println("-------------------------------");
			opcionLeida = subOpcion.nextInt();
		}

		return opcionLeida;

	}

	public Date pedirFechaEntrega() {
		Scanner subOpcion = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaLeida = null;
		boolean continuarLeyendo = true;
		Date hoy = new Date();
		while(continuarLeyendo){
			try{
				System.out.println("Introduzca la fecha de entrega con formato dd/mm/yyyy");
				String opcionLeida = subOpcion.nextLine();
				fechaLeida = df.parse(opcionLeida);
				continuarLeyendo = false;
				//Si se introduce una fecha anterior a hoy, volver a pedir
				if(fechaLeida.before(hoy)){
					System.out.println("No podemos viajar al pasado, introduzca una fecha válida");
					continuarLeyendo = true;
				}else{
					long ahora = new Date().getTime();
					long milisegundosDia = TimeUnit.DAYS.toMillis(1);
					Date fecha10Dias = new Date(ahora + milisegundosDia * 10);
					//Si fecha intriducida es antes de los próximos 10 días
					if(fechaLeida.before(fecha10Dias)){
						System.out.println("Se necesitan 10 días para satisfacer el pedido, pruebe con una fecha posterior a " + df.format(fecha10Dias));
						continuarLeyendo = true;
					}
				}

			} catch (Exception e){
				System.out.println("Formato de fecha no válido");
				continuarLeyendo = true;
			}
		}

		return fechaLeida;
	}

	public Date pedirFechaInforme(String desdeHasta) { //Valores posibles de desdeHasta son: "Desde" y "Hasta"

		Scanner subOpcion = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaLeida = null;
		boolean continuarLeyendo = true;
		Date hoy = new Date();
		while(continuarLeyendo){
			try{
				System.out.println(desdeHasta + " que fecha desea mostrar los informes (formato dd/mm/yyyy): ");
				String opcionLeida = subOpcion.nextLine();
				fechaLeida = df.parse(opcionLeida);
				continuarLeyendo = false;
				//Si se introduce una fecha anterior a hoy, volver a pedir
				if(fechaLeida.after(hoy)){
					System.out.println("Los pedidos del futuro aún no se han realizado, por favor introduzca una fecha válida");
					continuarLeyendo = true;
				}

			} catch (Exception e){
				System.out.println("Formato de fecha no válido");
				continuarLeyendo = true;
			}
		}

		return fechaLeida;
	}
	

	


}

