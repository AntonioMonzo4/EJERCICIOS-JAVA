package org.herrera.seres;

public abstract class Animal extends SerVivo implements Movible {

	public Animal(int edad) throws EdadException {
		super(edad);
	}
	
	public abstract void comer();
	public void beber() {
		System.out.println("Está bebiendo");
	};

}
