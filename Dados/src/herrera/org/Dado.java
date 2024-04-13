package herrera.org;

import java.awt.Toolkit;

public class Dado {
	
	//VARIABLES MÉTODO
	
	

	private final int numCaras;
	private int velocidad;
	
	//CONSTRUCTOR -> Inicializar los objetos pueden ser varios
	
	public Dado() {
		this(6);
	}
	
	public Dado(int caras) {
		this.numCaras= caras;
		
		//this.numCaras= numCaras --> el this indica la variable de clase
	}
	public Dado(int caras,int velocidad) {
		this.numCaras= caras;
		this.setVelocidad(velocidad);
		
		//this.numCaras= numCaras --> el this indica la variable de clase
	}
	
	

	
	//MÉTODOS PÚBLICOS
	
	public int lanzar() {
		
		return ((int)(Math.random()*getNumCaras()+1));
	}
	

	public int getNumCaras() {
		return numCaras;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}
	

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
}
