/**
 * 
 */
package org.herrera.seres;

/**
 * 
 */
public class Tigre extends Animal implements Movible {

	
	final static public int EDADMAXIMA=30;

	/**
	 * @param edad
	 * @throws EdadException
	 */
	public Tigre(int edad) throws EdadException {
		super(edad);
		// TODO Auto-generated constructor stub
		if(edad>EDADMAXIMA || edad<0) throw new EdadException();
		this.edadFin =(int) (Math.random()*(EDADMAXIMA-edad+1)+edad);

	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Está al acecho");

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Qué rico una zebra a la plancha");
		
	}

	@Override
	public String toString() {
		return "Tigre [edad=" + edad + ", edadFin=" + edadFin + "]";
	}
	

}
