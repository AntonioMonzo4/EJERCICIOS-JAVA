package org.herrera.juegos;

public class Dado {

//VARIABLES MÉTODO
	
	

	protected int numCaras=6;
	
	//CONSTRUCTOR -> Inicializar los objetos pueden ser varios
	
	
	
	public Dado(int caras) {
		if(caras<=0) throw new RuntimeException("Número de caras negativas o cero"); 
		
		
		this.numCaras= caras;

		
		
		
		//this.numCaras= numCaras --> el this indica la variable de clase
	}
	

	
	//MÉTODOS PÚBLICOS
	
	public Dado() {
		// TODO Auto-generated constructor stub
	}



	public int lanzar() {
		
		return ((int)(Math.random()*getNumCaras()+1));
	}
	

	public int getNumCaras() {
		
		
		
		return numCaras;
	}

}
