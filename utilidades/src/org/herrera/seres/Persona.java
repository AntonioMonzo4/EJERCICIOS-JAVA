package org.herrera.seres;

public class Persona extends Animal {
	
	
	String nombre;
	final static public int EDADMAXIMA=120;
	

	
	
	public Persona(int edad, String nombre) throws EdadException {
		super(edad);
		if(edad>EDADMAXIMA) throw new EdadException();
		
		this.nombre = nombre;
		this.edadFin =(int) (Math.random()*(EDADMAXIMA-edad+1)+edad);

		
	}
	
	public void saludar() {
		System.out.println("Hola, me llamo "+getNombre());
	}

	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", edadFin=" + edadFin + "]";
	}


	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println(getNombre()+"-va caminando-");
		
	}
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println(getNombre()+"-está comiendo-");
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	

	
	
	
	
	
}
