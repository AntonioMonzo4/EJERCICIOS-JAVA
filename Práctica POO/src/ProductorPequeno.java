import java.util.List;

public class ProductorPequeno extends Productor {
	
	private boolean esFederado;

	public boolean isEsFederado() {
		return esFederado;
	}

	public void setEsFederado(boolean esFederado) {
		this.esFederado = esFederado;
	}

	public ProductorPequeno(int id, String nombre, double hectareas, List<Producto> productos) {
		super(id, nombre, hectareas, productos);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
