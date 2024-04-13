package org.herrera.geom;

public class Circunferencia implements FiguraGeometrica {
	
	private Punto c;
	private double radio;
	static int contC=0;

	public Circunferencia(Punto c, double radio) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.radio=radio;
		contC++;
		
	}

	public static int getContC() {
		return contC;
	}

	public static void setContC(int contC) {
		Circunferencia.contC = contC;
	}

	public String toString() {
		return c.toStrign()+" y de radio: "+radio;
	}
	@Override
	 public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}
	

}
