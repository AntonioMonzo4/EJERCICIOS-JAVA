import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Hereda de TimerTask para poder simular la tarea repetitiva de modificar los precios de valor de referencia del producto
public class Controlador extends TimerTask{

	static final int MAX_PRODUCTOS_PRODUCTOR_PEQUENO = 5;
	//Se genera aleatoriamente el número de Ha, para simular el posible cambio de este valor en cada año fiscal
	private int maxHaProductorPeq = new Random().nextInt(10) + 2;
	private List<Cliente> listaClientes = new ArrayList <Cliente>();
	private List<Distribuidor> listaDistribuidores = new ArrayList <Distribuidor>();
	private List<Producto> listaProductos = new ArrayList <Producto>();
	private List<Productor> listaProductores = new ArrayList <Productor>();
	private List<Pedido> listaPedidos = new ArrayList <Pedido>();
	private Logistica logistica = new Logistica();
	private List<Logistica> listaEmpresasLogistica = new ArrayList <Logistica>();
	private List<HistoricoPreciosProducto> historicoPreciosProducto = new ArrayList <>();
	private static final String[] arrayNombres = new String[] {"Juan", "Antonio", "Fernanda", "Jimmy", "Ana"};
	private static final String[] arrayApellidos = new String[] {"Sanchez", "Fernandez", "Lopez", "Perez", "Gonzalez"};
	private static final String[] arrayProductos = new String[] {"Zanahoria-true", "Calabaza-true", "Aceituna-false", "Pepino-true", "Lechuga-true",
			"Manzana-true", "Pera-true", "Naranja-true", "Melon-true", "Sandia-true", "Tomate-true", "Albaricoque-true", "Cereza-true", "Berenjena-true", "Limon-true",
			"Cacahuete-false", "Pistacho-false", "Arroz-false", "Garbanzos-false", "Miel-false"};



	@Override
	public void run() {
		System.out.println("Comienza la modificación de valor de referencia de los productos...");
		modificarValoresReferenciaProductos();
		System.out.println("Valores de referencia actualizados ");
	}


	public void cargaDatos(){
		
		this.cargaProductos(20);
		this.cargaClientes(20);
		this.cargaDistribuidores(20);
		this.cargaProductores(20);
		this.cargaEmpresasLogistica(5);
		this.cargaPedidos();
	}


	public void logicaDistribuidor(int idDistribuidor){
		Distribuidor distribuidorActual = this.listaDistribuidores.stream().filter(d-> d.getId() == idDistribuidor).findFirst().orElse(null);
		//Añadir un 5%
		Menu menu = new Menu();

		int opcionLeida = menu.subMenuDistribuidorCliente();
		if(opcionLeida == 1){

			//Listar los productos para seleccionar uno
			int idProductoComprado = menu.mostrarMenuProductos(this.listaProductos);
			if(idProductoComprado > 0){
				//Recuperamos el objeto Producto de nuestra lista de Productos
				Producto productoComprado = this.listaProductos.stream().filter(p-> p.getId() == idProductoComprado).findFirst().orElse(null);
				//Pedimos cantidad en Kg del producto
				int kgComprados =  menu.pedirCantidadProductoDistribuidor(productoComprado.getStock());
				//Actualizamos el stock del producto
				productoComprado.setStock(productoComprado.getStock() - kgComprados);
				//Pedimos distancia envío
				int distanciaEnvio = menu.pedirDistanciaEnvio();
				//Pedimos fecha entrega
				Date fechaEntrega = menu.pedirFechaEntrega();
				//Seleccionamos empresa Logística que realiza el envío
				int idEmpresaLogistica = menu.pedirEmpresaLogistica(this.listaEmpresasLogistica);
				//Calculamos precio de logística y de producto para el Distribuidor
				double precioTotal = this.logistica.precioComprador(productoComprado, distanciaEnvio, kgComprados, 1);
				//Se añade el nuevo pedido
				this.listaPedidos.add(new Pedido(this.listaPedidos.size() + 1,idDistribuidor,idProductoComprado,idEmpresaLogistica,distanciaEnvio,kgComprados,productoComprado.getValorRefKilogramo(),distribuidorActual.getDireccionEnvio(),fechaEntrega,precioTotal,false)
				);

			}

		}else if(opcionLeida == 2){
			//Estado de pedidos
			this.listarPedidosDistribuidor(distribuidorActual.getId());
		}

	}

	public void logicaCliente(int idCliente){
		Cliente clienteActual = this.listaClientes.stream().filter(d-> d.getId() == idCliente).findFirst().orElse(null);
		Menu menu = new Menu();
		int opcionLeida = menu.subMenuDistribuidorCliente();
		if(opcionLeida == 1){
			//Listar los productos para seleccionar uno
			int idProductoComprado = menu.mostrarMenuProductos(this.listaProductos);
			if(idProductoComprado > 0){
				//Recuperamos el objeto Producto de nuestra lista de Productos
				Producto productoComprado = this.listaProductos.stream().filter(p-> p.getId() == idProductoComprado).findFirst().orElse(null);
				//Pedimos cantidad en Kg del producto
				int kgComprados =  menu.pedirCantidadProductoCliente(productoComprado.getStock());
				//Actualizamos el stock del producto
				productoComprado.setStock(productoComprado.getStock() - kgComprados);
				//Pedimos distancia envío
				int distanciaEnvio = menu.pedirDistanciaEnvio();
				//Pedimos la fecha de entrega
				Date fechaEntrega = menu.pedirFechaEntrega();
				//Seleccionamos empresa Logística que realiza el envío
				int idEmpresaLogistica = menu.pedirEmpresaLogistica(this.listaEmpresasLogistica);
				//Calculamos precio de logística y de producto para el Distribuidor (10% IVA incluido)
				double precioTotal = this.logistica.precioComprador(productoComprado, distanciaEnvio, kgComprados, 1.10);
				//Se añade el nuevo pedido
				this.listaPedidos.add(new Pedido(this.listaPedidos.size() + 1,idCliente,idProductoComprado,distanciaEnvio,idEmpresaLogistica,kgComprados,productoComprado.getValorRefKilogramo(),clienteActual.getDireccionEnvio(),fechaEntrega,precioTotal,false)
				);
			}

		}else if(opcionLeida == 2){
			//Estado de pedidos
			this.listarPedidosCliente(clienteActual.getId());
		}

	}

	public void logicaProductor(int idLeido){
		Productor productorActual = this.listaProductores.stream().filter(d-> d.getId() == idLeido).findFirst().orElse(null);
		//Menu menu = new Menu();
		//menu.subMenuProductor();

	}

	public void mostrarInformes(){
		Menu menu = new Menu();
		Informes informes = new Informes();
		int opcionLeida = menu.subMenuInformes();
		switch (opcionLeida) {
			case 1:
				informes.informeVentasTotales(this.listaPedidos, this.listaProductos);
				break;
			case 2:
				//informes.;
				break;
			case 3:
				//informes.();
				break;
			case 4:
				informes.informeBeneficiosCooperativa(this.listaPedidos, this.listaProductos);
				break;
			case 5:
				informes.informeEvolucionPrecios(this.listaProductos, this.historicoPreciosProducto);
				break;
			case 0:
				//finaliza ejecución del main
				return;
			default:
				System.out.println("La opción eligida no extiste");

		}


	}


	public int listarClientes() {

		for(Cliente cliente: this.listaClientes) {
			System.out.println(cliente.getId()+"- "+cliente.getNombre());
		}

		return this.listaClientes.size();

	}



	public int listarProductos() {
		for(Producto producto: this.listaProductos) {
			System.out.println(producto.getId()+".- "+producto.getNombre() +" - "+producto.getValorRefKilogramo());
		}
		return this.listaProductos.size();

	}

	public int listarProductores() {
		for(Productor productor: this.listaProductores) {
			System.out.println(productor.getId()+".- "+productor.getNombre());
		}
		return this.listaProductores.size();
	}

	public int listarDistribuidores() {
		for(Distribuidor distribuidor: this.listaDistribuidores) {
			System.out.println(distribuidor.getId()+ ".- "+distribuidor.getNombre());
		}
		return this.listaDistribuidores.size();
	}

	public void modificarValoresReferenciaProductos() {
		if(!this.listaProductos.isEmpty()){
			Random random = new Random();
			for(Producto producto: this.listaProductos) {
				//Generamos 0 (suma) o 1 (resta) aletariamente para indicar si el precio sube o baja
				int sumarRestar = random.nextInt(2);
				//Se genera el % a aplicar, será entre 1% y 7% del valor anterior del producto
				int porcentaje = random.nextInt(8);
				double aumentoPrecio = producto.getValorRefKilogramo() * porcentaje/100;
				double nuevoValorRefKg = sumarRestar == 0 ? producto.getValorRefKilogramo() + aumentoPrecio : producto.getValorRefKilogramo() - aumentoPrecio;
				//Actualizamos el valor
				producto.setValorRefKilogramo(nuevoValorRefKg);
				//añadimos el cambio de precio al histórico
				this.historicoPreciosProducto.add(new HistoricoPreciosProducto(producto.getId(), producto.getNombre(), nuevoValorRefKg));
			}
		}

	}




	/** -------------------
	 	 Métodos privados
	  --------------------- */

	private void cargaProductos(int numProductos){
		Random random = new Random();
		for(int i=1; i<=numProductos; i++) {
			int indiceProducto = random.nextInt(this.arrayProductos.length);
			double rendimientoHc = new Random().nextDouble() * 20;
			double valorRefKg =  Math.round((random.nextDouble() * 5) * 100.0) / 100.0;
			String nombreProducto = this.arrayProductos[indiceProducto].split("-")[0];
			boolean esPerecedero = Boolean.parseBoolean(this.arrayProductos[indiceProducto].split("-")[1]);
			int stockProducto = random.nextInt(10000) + 1000;
			this.listaProductos.add(new Producto(i, nombreProducto, rendimientoHc, valorRefKg, esPerecedero, stockProducto));
			//Establecemos el primer precio en el histórico
			this.historicoPreciosProducto.add(new HistoricoPreciosProducto(i, nombreProducto, valorRefKg));
		}

	}

	private void cargaClientes(int numClientes){
		Random random = new Random();
		//Se comprueba que se hayan cargado los productos previamente, si no hay productos, los clientes no pueden tener productos asociados
		if(this.listaProductos.size()>0) {
			for(int j=1; j<=numClientes; j++) {

				int numProductosCliente = random.nextInt(5)+1;
				int indiceArraysNombres = random.nextInt(this.arrayNombres.length);
				int indiceArraysApellido = random.nextInt(this.arrayApellidos.length);

				List<Integer> idProductosComprados= new ArrayList<Integer>();

				for(int i= 0; i<numProductosCliente;i++) {
					int idProducto = random.nextInt(this.listaProductos.size())+1;
					idProductosComprados.add(idProducto);

				}

				this.listaClientes.add(new Cliente(j, this.arrayNombres[indiceArraysNombres]+" "+this.arrayApellidos[indiceArraysApellido], idProductosComprados, "Dirección de envío cliente" + j));

			}
			System.out.println("Lista de clientes cargada correctamente");
		}else{
			System.out.println("No se han podido cargar los clientes porque no existen productos");
		}

	}

	private void cargaDistribuidores(int numDistribuidores){
		Random random = new Random();
		for(int i=1; i<=numDistribuidores; i++) {
			List<Integer> idProductosComprados= new ArrayList<Integer>();
			int numProductosDistribuidor = random.nextInt(10)+1;

			for(int j= 0; j<numProductosDistribuidor; j++) {
				int idProducto = random.nextInt(this.listaProductos.size())+1;
				idProductosComprados.add(idProducto);

			}
			this.listaDistribuidores.add(new Distribuidor(i, "Dist" + i, idProductosComprados, "Dirección de envío distribuidor" + i));
		}
		System.out.println("Lista de Distribuidores cargada correctamente");
	}

	private void cargaProductores(int numProductores){
		Random random = new Random();
		for(int i=1; i<=numProductores; i++) {
			int indiceInferiorSublistaProductos = random.nextInt(10)+1;
			int indiceSuperiorSublistaProductos = random.nextInt(10)+1;
			//Se generan aleatoriamente las Ha del productor pequeño, entre 1 y el máximo de ese año fiscal
			int haProdPeq = random.nextInt(this.maxHaProductorPeq)+1;
			int haProdGrande = random.nextInt(100) + this.maxHaProductorPeq + 1;
			if(indiceInferiorSublistaProductos >= indiceSuperiorSublistaProductos){
				indiceInferiorSublistaProductos = 0;
			}
			List<Producto> productosProductor = this.listaProductos.subList(indiceInferiorSublistaProductos, indiceSuperiorSublistaProductos);
			Productor nuevoProductor;
			if(productosProductor.size() > MAX_PRODUCTOS_PRODUCTOR_PEQUENO){
				nuevoProductor = new ProductorGrande(i, "ProductorGrande" + i, haProdGrande, productosProductor);
			}else{
				nuevoProductor = new ProductorPequeno(i, "ProductorPequeno" + i, haProdPeq, productosProductor);
			}
			//int iD, String nombre, double redimientoHa, double valorRefKilogramo, boolean esPerecedero
			this.listaProductores.add(nuevoProductor);
		}

		System.out.println("Lista de Productores cargada correctamente");
	}




	/**
	 * Método que crea un pedido por cada compra de cliente y distribuidor
	 */
	private void cargaPedidos(){
		int idPedido = 1;
		Random random = new Random();

		//Creamos los pedidos correspondientes a los Clientes que han comprado
		for (Cliente cliente : this.listaClientes) {
			//Iteramos sobre los productos comprados por el cliente para generar el pedido
			for (Integer idProductoComprado : cliente.getIdProductosComprados()) {
				//Genero alternativamente una fecha de envio aleatoria en los últimos 4 años o en los últimos 10 días
				Date fechaPedido = this.fechaRandom(idProductoComprado%2 == 0 ? 10 : (365*4));
				int idEmpresaLogistica = random.nextInt(5) + 1;
				int distanciaEnvio = random.nextInt(200)+1;
				int kgComprados = random.nextInt(100)+1;
				//Recuperamos el objeto Producto de nuestra lista de Productos
				Producto productoComprado = this.listaProductos.stream().filter(p-> p.getId() == idProductoComprado).findFirst().orElse(null);
				//Calculamos precio de logística y de producto para el Distribuidor (10% IVA incluido)
				double precioPedido = this.logistica.precioComprador(productoComprado, distanciaEnvio, kgComprados, 1.10);

				this.listaPedidos.add(new Pedido(idPedido++,
						cliente.getId(),
						idProductoComprado,
						idEmpresaLogistica,
						distanciaEnvio,
						kgComprados,
						productoComprado.getValorRefKilogramo(),
						"Dirección " + idProductoComprado,
						fechaPedido,
						precioPedido,
						true)
				);
			}
		}

		//Creamos los pedidos correspondientes a los Distribuidores que han comprado
		for (Distribuidor distribuidor : this.listaDistribuidores) {
			//Iteramos sobre los productos comprados por el cliente para generar el pedido
			for (Integer idProductoComprado : distribuidor.getIdProductosComprados()) {
				//Genero alternativamente una fecha de envio aleatoria en los últimos 4 años o en los últimos 10 días
				Date fechaPedido = this.fechaRandom(idProductoComprado % 2 == 0 ? 10 : (365*4));
				int idEmpresaLogistica = random.nextInt(5) + 1;
				int distanciaEnvio = random.nextInt(200)+1;
				int kgComprados = random.nextInt(5000)+1000;
				//Recuperamos el objeto Producto de nuestra lista de Productos
				Producto productoComprado = this.listaProductos.stream().filter(p-> p.getId() == idProductoComprado).findFirst().orElse(null);
				//Calculamos precio de logística y de producto para el Distribuidor
				double precioPedido = this.logistica.precioComprador(productoComprado, distanciaEnvio, kgComprados, 1);
				this.listaPedidos.add(new Pedido(idPedido++,
						distribuidor.getId(),
						idProductoComprado,
						idEmpresaLogistica,
						distanciaEnvio,
						kgComprados,
						productoComprado.getValorRefKilogramo(),
						"Dirección " + idProductoComprado,
						fechaPedido,
						precioPedido,
						false)
				);
			}
		}


		System.out.println("Lista de Pedidos cargada correctamente");

	}


	//Genera fecha aleatoria entre hoy y los días atrás recibido como parámetro
	private Date fechaRandom(int diasAtras) {
		long milisegundosDia = TimeUnit.DAYS.toMillis(1);
		long ahora = new Date().getTime();
		Date fechaXDiasAtras = new Date(ahora - milisegundosDia * diasAtras);
		long comienzoMillis = fechaXDiasAtras.getTime();
		//long finMillis = new Date().getTime();
		long randomMillisSinceEpoch = ThreadLocalRandom
				.current()
				.nextLong(comienzoMillis, ahora);

		return new Date(randomMillisSinceEpoch);

	}


	private void listarPedidosDistribuidor(int idDistribuidor) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Distribuidor distribuidor = this.listaDistribuidores.stream().filter(c-> c.getId() == idDistribuidor).findFirst().orElse(null);
		List<Pedido> listaPedidosDistribuidor = this.listaPedidos.stream().filter(p-> p.getIdCliente() == idDistribuidor && !p.isEsCliente()).collect(Collectors.toList());

		System.out.println("Lista de pedidos para el distribuidor " + distribuidor.getNombre() + " con ID " + idDistribuidor);
		System.out.println("----------------------------------------------------------------------------------------");
		for(Pedido pedido: listaPedidosDistribuidor) {
			Producto producto = this.listaProductos.stream().filter(c-> c.getId() == pedido.getIdProducto()).findFirst().orElse(null);
			System.out.println("ID: " + pedido.getIdPedido());
			System.out.println("Producto: " + producto.getNombre() + "(" + producto.getId() + ")");
			System.out.println("Distancia: " + pedido.getDistanciaEnvio());
			System.out.println("Dirección: " + pedido.getDireccion());
			System.out.println("Kg Comprados: " + pedido.getKgProducto() + " Kg");
			System.out.println("Fecha Realización: " + sdf.format(pedido.getFechaPedido()));
			System.out.println("----------------------------------------------------------------------------------------");

		}

	}


	private void listarPedidosCliente(int idCliente) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Cliente clienteActual = this.listaClientes.stream().filter(c-> c.getId() == idCliente).findFirst().orElse(null);
		List<Pedido> listaPedidosCliente = this.listaPedidos.stream().filter(p-> p.getIdCliente() == idCliente && p.isEsCliente()).collect(Collectors.toList());

		System.out.println("Lista de pedidos para el cliente " + clienteActual.getNombre() + " con ID " + idCliente);
		System.out.println("----------------------------------------------------------------------------------------");
		for(Pedido pedido: listaPedidosCliente) {
			Producto producto = this.listaProductos.stream().filter(c-> c.getId() == pedido.getIdProducto()).findFirst().orElse(null);
			System.out.println("ID: " + pedido.getIdPedido());
			System.out.println("Producto: " + producto.getNombre() + "(" + producto.getId() + ")");
			System.out.println("Distancia: " + pedido.getDistanciaEnvio());
			System.out.println("Dirección: " + pedido.getDireccion());
			System.out.println("Kg Comprados: " + pedido.getKgProducto() + " Kg");
			System.out.println("Fecha Realización: " + sdf.format(pedido.getFechaPedido()));
			System.out.println("----------------------------------------------------------------------------------------");

		}

	}

	private void cargaEmpresasLogistica(int numEmpresas){
		for(int i=1; i<=numEmpresas; i++) {
			this.listaEmpresasLogistica.add(new Logistica(i, "EmpresaLogistica" + i));
		}
	}



}