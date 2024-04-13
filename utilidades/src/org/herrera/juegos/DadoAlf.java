package org.herrera.juegos;

public class DadoAlf extends DadoEx{
	
	private String letras;
	private int velocidad;
	
	public DadoAlf(int numCaras) {
		super(numCaras);
		
	}
	
	public DadoAlf(int numcaras,int velocidad) {
		super(numcaras);
		this.setVelocidad(velocidad);
	}

	public void setVelocidad(int velocidad) {
		if(velocidad<0 || velocidad>100) throw new RuntimeException("Número de velocidad negativa"); 

		this.velocidad = 1000/velocidad;
	}


	
	public DadoAlf(String letras) {
		if(letras.contentEquals("")) throw new RuntimeException("String Vacío"); 

		this.letras=letras;
	}
	
	
	public char lanzarAlf() {
		
		
		
		

		
		return letras.charAt((int)(Math.random()*letras.length()));
	}

}