/**
 * 
 */
package org.herrera.geom;

/**
 * 
 */
public class Recta implements FiguraGeometrica {
	
	private Punto p0;
	private Punto p1;
	private static int contR=0;

	/**
	 * 
	 */
	public Recta(Punto p0, Punto p1) {
		// TODO Auto-generated constructor stubç
		this.p0=p0;
		this.p1=p1;
		contR++;
	}
	public static void descripcion() {
		
		System.out.println( "Una recta es la unión de dos puntos. ");
	}

	public static int getContR() {
		return contR;
	}

	public static void setContR(int contR) {
		Recta.contR = contR;
	}

	public String toString() {
		return p0.toStrign()+" y "+p1.toStrign();
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
