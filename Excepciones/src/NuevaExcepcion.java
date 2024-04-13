public class NuevaExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	// Teor�a sobre necesidad del atributo serialVersionUID: 
	// SERIALIZACI�N es un mecanismo Java que facilita el almacenamiento y transmisi�n del estado de un objeto:
	// consiste en generar una secuencia de bytes lista para su almacenamiento y/o transmisi�n.
	// Es posible que en distintas versiones del programa, la clase ObjetoSerializable cambie, y si se
	// ha transmitido, puede no estar actualizada en el otro lado y provocar el fallo de un m�todo remoto.
	// Si sucede esto, la reconstrucci�n de la clase en el lado que recibe es imposible.
	// El atributo serialVersionUID se utiliza para garantizar la compatibilidad entre diferentes versiones de 
	// la clase implementada, ya que modifica su valor con cada actualizaci�n.
	// Eclipse da un warning si una clase que implementa la interfaz Serializable
	// (o hereda de una clase que a su vez implementa Serializable) no tiene definido este campo, y resulta que
	// la clase ra�z para todas las excepciones (Throwable) la implementa.
	// Todas las excepciones son por defecto serializables y por eso deben llevar este atributo con el valor que
	// quieras (deber�a cambiar en cada versi�n).
	// "1L" es equivalente a "(long) 1" (casting para el 1), y m�s eficiente.


	public NuevaExcepcion () {	
	}
		
	// Constructor con mensaje de error   
	public NuevaExcepcion (String mensajeError) {
	    super(mensajeError);
	}
}
