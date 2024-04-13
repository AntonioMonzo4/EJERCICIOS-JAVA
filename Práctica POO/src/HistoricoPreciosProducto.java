/**
 * 
 *
 */
public class HistoricoPreciosProducto {

	private int idProducto;
	private String nombreProducto;
	private double valorRefKilogramo;

	public HistoricoPreciosProducto(int idProducto, String nombreProducto, double valorRefKilogramo) {
		this.idProducto = idProducto;
		this.valorRefKilogramo = valorRefKilogramo;
		this.nombreProducto = nombreProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getValorRefKilogramo() {
		return valorRefKilogramo;
	}

	public void setValorRefKilogramo(double valorRefKilogramo) {
		this.valorRefKilogramo = valorRefKilogramo;
	}
}