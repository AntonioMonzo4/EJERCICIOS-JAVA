/**
 * 
 */
package org.herrera.seres;

/**
 * 
 */
public class Gorrion extends Animal implements Volador {
	
	final static public int EDADMAXIMA=15;


	/**
	 * @param edad
	 * @throws EdadException
	 */
	public Gorrion(int edad) throws EdadException {
		super(edad);
		// TODO Auto-generated constructor stub
		if(edad>EDADMAXIMA || edad<0) throw new EdadException();
		
		this.edadFin =(int) (Math.random()*(EDADMAXIMA-edad+1)+edad);

		
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Se mueve el pájaro-");

	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Está volando.");

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Está comiendo.");

	}
	public void piar() {
		System.out.println("Pio, pio");
	}

	@Override
	public String toString() {
		return "Gorrion [edad=" + edad + ", edadFin=" + edadFin + "]";
	}

	
	
	

}
