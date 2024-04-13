package org.herrera.juegos;

import java.awt.Toolkit;

public class DadoEx extends Dado{

	private int velocidad = 50;
	
	
	public DadoEx() {
		super(6);
	}
	
	public DadoEx(int caras,int velocidad) {
		
		super(caras);
		this.setVelocidad(velocidad);
		//this.numCaras= numCaras --> el this indica la variable de clase
	}
	
	

	
	public DadoEx(int numCaras) {
		// TODO Auto-generated constructor stub
		if(numCaras<0) throw new RuntimeException("caras<=0");
		this.numCaras=numCaras;
	}




	public int getVelocidad() {
		return velocidad;
	}
	
	public void cantaCara() throws InterruptedException {
		Toolkit tk =Toolkit.getDefaultToolkit();
		int cara = lanzar();
		for(int i=0;i<cara;cara++) {
			tk.beep();
			Thread.sleep(3000/velocidad);
		}
	}



	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		
		if(velocidad<0 || velocidad>100) throw new RuntimeException("Número de velocidad negativa"); 
		
		this.velocidad = 1000/velocidad;
	}

}
