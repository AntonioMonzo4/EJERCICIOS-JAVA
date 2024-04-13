public class NuevaExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	// Teoría sobre necesidad del atributo serialVersionUID: 
	// SERIALIZACIÓN es un mecanismo Java que facilita el almacenamiento y transmisión del estado de un objeto:
	// consiste en generar una secuencia de bytes lista para su almacenamiento y/o transmisión.
	// Es posible que en distintas versiones del programa, la clase ObjetoSerializable cambie, y si se
	// ha transmitido, puede no estar actualizada en el otro lado y provocar el fallo de un método remoto.
	// Si sucede esto, la reconstrucción de la clase en el lado que recibe es imposible.
	// El atributo serialVersionUID se utiliza para garantizar la compatibilidad entre diferentes versiones de 
	// la clase implementada, ya que modifica su valor con cada actualización.
	// Eclipse da un warning si una clase que implementa la interfaz Serializable
	// (o hereda de una clase que a su vez implementa Serializable) no tiene definido este campo, y resulta que
	// la clase raíz para todas las excepciones (Throwable) la implementa.
	// Todas las excepciones son por defecto serializables y por eso deben llevar este atributo con el valor que
	// quieras (debería cambiar en cada versión).
	// "1L" es equivalente a "(long) 1" (casting para el 1), y más eficiente.


	public NuevaExcepcion () {	
	}
		
	// Constructor con mensaje de error   
	public NuevaExcepcion (String mensajeError) {
	    super(mensajeError);
	}
}
