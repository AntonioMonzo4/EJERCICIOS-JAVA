/**
 * 
 */
package org.herrera.seres;

/**
 * 
 */
public class Superman extends Persona implements Volador, Movible {

	public Superman(int edad, String nombre) throws EdadException {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Es un pájaro, es un avión no es: "+this.getNombre());
		
	}
	
	public void mover() {
		System.out.println("Va a la velocidad de un tren.");
	}
	public void comer() {
		System.out.println("ÑAM ÑAM");
	}

}
