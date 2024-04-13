package es.uned.lsi.eped.DataStructures;

/* Representa una pila de elementos. Una pila es una            * 
 * especialización de una secuencia, que mantiene el orden de   *
 * almacenamiento de sus elementos y una política de acceso     *
 * Last In First Out (LIFO).                                    */
public interface StackIF <E> extends SequenceIF<E>{
	
	/* Devuelve el elemento situado en la cima de la pila       *
	 * @Pre !isEmpty ();                                        *
	 * @return la cima de la pila                               */
	public E getTop ();
	
	/* Incluye un elemento en la cima de la pila. Modifica el   *
	 * tamaño de la misma.                                      *
	 * @param elem el elemento que se quiere añadir en la cima  */
	public void push (E elem);    
	
	/* Elimina la cima de la pila. Modifica el tamaño de la     * 
	 * pila.                                                    *
	 * @Pre !isEmpty ();                                        */
	public void pop ();            
}
