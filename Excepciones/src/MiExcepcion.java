
public class MiExcepcion extends Exception {
		
	private static final long serialVersionUID = 1L;
	
	// Constructor por defecto   
	public MiExcepcion () {}
	// Constructor con mensaje de error   
	public MiExcepcion (String mensajeError) {
		super(mensajeError);
	}
}

