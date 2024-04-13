/**
 *
 * Clase encargada del desarrollo de la logï¿½stica 
 *
 */
public class Logistica {

	static final int DISTANCIA_MAXIMA_LOGISTICA_PERECEDEROS = 100;
	static final int DISTANCIA_MAXIMA_LOGISTICA_NO_PERECEDEROS = 50;

	private int idLogistica;
	private String nombreEmpresa;

	public Logistica() {
	}

	public Logistica(int idLogistica, String nombreEmpresa) {
		this.idLogistica = idLogistica;
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getIdLogistica() {
		return idLogistica;
	}

	public void setIdLogistica(int idLogistica) {
		this.idLogistica = idLogistica;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	//Métodos calculo de precios ya sea Distribuidor o Cliente final
	public double precioComprador(Producto producto, int distanciaPedido, int kgPedidos, double iva) {
		double costeLogistica=0;

		if(producto.isEsPerecedero()) {
			if(distanciaPedido<DISTANCIA_MAXIMA_LOGISTICA_PERECEDEROS) {
				//Pequeña Logística
				double precioPequenaLogistica = 0.01 * distanciaPedido * kgPedidos;
				//Coste producto. Si iva es > 1 indica que se trata de un cliente
				double precioProducto = kgPedidos * producto.getValorRefKilogramo() * (iva > 1 ? 1.15 : 1.05) * iva;
				costeLogistica = precioPequenaLogistica + precioProducto;

			}else {

				int trayectos100Km =  distanciaPedido/DISTANCIA_MAXIMA_LOGISTICA_PERECEDEROS;
				//Después de los fragmentos de 50Km, km para pequeña logística
				int kmRestantes =  distanciaPedido%DISTANCIA_MAXIMA_LOGISTICA_PERECEDEROS;
				int toneladas = kgPedidos/1000;
				//Gran Logística
				double precioPorTrayectoTonelada = 0.75 * producto.getValorRefKilogramo() * 1000;
				double precioToneladaGranLogistica = precioPorTrayectoTonelada * trayectos100Km;
				double precioKmGranLogistica = 0.05 * DISTANCIA_MAXIMA_LOGISTICA_PERECEDEROS * trayectos100Km;
				double precioGranLogisitcaTotal = (precioToneladaGranLogistica + precioKmGranLogistica) * toneladas;
				//Pequeña Logística
				double precioPequenaLogistica = 0.01 * kmRestantes * kgPedidos;
				//Coste producto
				double precioProducto = kgPedidos * producto.getValorRefKilogramo() * (iva > 1 ? 1.15 : 1.05) * iva;
				costeLogistica = precioGranLogisitcaTotal + precioPequenaLogistica + precioProducto;
			}
		}else {
			if(distanciaPedido<DISTANCIA_MAXIMA_LOGISTICA_NO_PERECEDEROS) {
				//Pequeña Logística
				double precioPequenaLogistica = 0.01 * distanciaPedido * kgPedidos;
				//Coste producto
				double precioProducto = kgPedidos * producto.getValorRefKilogramo() * (iva > 1 ? 1.15 : 1.05) * iva;
				costeLogistica = precioPequenaLogistica + precioProducto;

			}else {
				int trayectos50Km =  distanciaPedido/DISTANCIA_MAXIMA_LOGISTICA_NO_PERECEDEROS;
				//Después de los fragmentos de 50Km, km para pequeña logística
				int kmRestantes =  distanciaPedido%DISTANCIA_MAXIMA_LOGISTICA_NO_PERECEDEROS;
				int toneladas = kgPedidos/1000;
				//Gran Logística
				double precioPorTrayectoTonelada = 0.5 * producto.getValorRefKilogramo() * 1000;
				double precioToneladaGranLogistica = precioPorTrayectoTonelada * trayectos50Km;
				double precioKmGranLogistica = 0.05 * DISTANCIA_MAXIMA_LOGISTICA_NO_PERECEDEROS * trayectos50Km;
				double precioGranLogisitcaTotal = (precioToneladaGranLogistica + precioKmGranLogistica) * toneladas;
				//Pequeña Logística
				double precioPequenaLogistica = 0.01 * kmRestantes * kgPedidos;
				//Coste producto
				double precioProducto = kgPedidos * producto.getValorRefKilogramo() * (iva > 1 ? 1.15 : 1.05) * iva;
				costeLogistica = precioGranLogisitcaTotal + precioPequenaLogistica + precioProducto;
			}
		}
		return costeLogistica;
	}


}