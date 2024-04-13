package org.herrera.geom;

public class Rectangulo implements FiguraGeometrica {

	private Punto p1;
	private Punto p0;
	private static int contRc=0;

	
	
	public Rectangulo(Punto p1, Punto p0) {
		// TODO Auto-generated constructor stub
		this.p1=p1;
		this.p0=p0;
		contRc++;
	}
	
	public Rectangulo(Punto p1,double base, double altura) {
		this.p1.setX(p1.getX());
		this.p1.setY(p1.getY()+altura);
		
		this.p0.setX(p1.getX()+base);
		this.p0.setY(p1.getY());
		contRc++;
		
	}
	
	
	public static void descripcion() {
		System.out.println( "Un rectángulo es una figura geométrica con 4 ángulos rectos cuyo área es lado x lado.");
	}

	public static int getContRc() {
		return contRc;
	}

	public static void setContRc(int contRc) {
		Rectangulo.contRc = contRc;
	}

	@Override
	public String toString() {
		return "Rectangulo [p1=" + p1 + ", p0=" + p0 + "]";
	}

	@Override
	public  double calcularArea() {
		// TODO Auto-generated method stub
		return Math.abs((p1.getX()-p0.getX())*(p1.getY()-p0.getY()));
	}

}
