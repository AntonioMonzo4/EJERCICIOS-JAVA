package org.herrera.seres;

public class EdadException extends Exception {

	public EdadException(){
		super("No puede tener una edad menor que 0.");

	}
}
