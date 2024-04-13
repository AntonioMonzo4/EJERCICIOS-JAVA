package org.herrera.seres;

public abstract class SerVivo {
	
	protected int edad;//Años del ser vivo en ese momento
	protected int edadFin;

	
	//Inicializador dinamico
	
	
	public SerVivo(int edad) throws EdadException {
		
		if (edad<0) throw new EdadException();	
		
		this.edad = edad;

		
	}
	
	
	public int cumplirAnios() {
		return this.edad++;
	}


	public int getEdad() {
		return edad;
	}



	public int getEdadFin() {
		return edadFin;
	}


	

}
