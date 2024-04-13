import java.util.Date;

/**
 * 
 *Clase que representa un pedido 
 *
 */
public class Pedido {

	private int idPedido;
	private int idCliente;
	private int idProducto;
	private int idEmpresaLogistica;
	private String direccion;
	private int distanciaEnvio;
	private int kgProducto;
	private double valorRefKilogramo;
	private Date fechaPedido;
	private double precio;
	//True indica que es pedido  de cliente, false indica que es pedido de distribuidor
	private boolean esCliente;

	public Pedido(int idPedido, int idCliente, int idProducto, int idEmpresaLogistica, int distanciaEnvio, int kgProducto, double valorRefKilogramo, String direccion, Date fechaPedido, double precio, boolean esCliente) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.idProducto = idProducto;
		this.idEmpresaLogistica = idEmpresaLogistica;
		this.direccion = direccion;
		this.distanciaEnvio = distanciaEnvio;
		this.kgProducto = kgProducto;
		this.valorRefKilogramo = valorRefKilogramo;
		this.fechaPedido = fechaPedido;
		this.precio = precio;
		this.esCliente = esCliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdEmpresaLogistica() {
		return idEmpresaLogistica;
	}

	public void setIdEmpresaLogistica(int idEmpresaLogistica) {
		this.idEmpresaLogistica = idEmpresaLogistica;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDistanciaEnvio() {
		return distanciaEnvio;
	}

	public void setDistanciaEnvio(int distanciaEnvio) {
		this.distanciaEnvio = distanciaEnvio;
	}

	public int getKgProducto() {
		return kgProducto;
	}

	public void setKgProducto(int kgProducto) {
		this.kgProducto = kgProducto;
	}

	public double getValorRefKilogramo() {
		return valorRefKilogramo;
	}

	public void setValorRefKilogramo(double valorRefKilogramo) {
		this.valorRefKilogramo = valorRefKilogramo;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsCliente() {
		return esCliente;
	}

	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}
}
