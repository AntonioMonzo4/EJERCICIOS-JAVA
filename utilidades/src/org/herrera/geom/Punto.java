package org.herrera.geom;

public class Punto {
	
	private double x;
	private double y;

	public Punto(double x,double y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	
		
	}
	
	public void mover(double newX, double newY) {
		this.x=newX;
		this.y=newY;
	}
	public void trasladar(double dx, double dy) {
		this.x+=dx;
		this.y+=+dy;
	}
	
	public Punto sumar(Punto p) {
		System.out.println(p.getX());
		
		Punto suma= new Punto(x, y);
		
		suma.x=p.x+this.x;
		suma.y+=p.y+this.y;
		
		return suma;
	}

	public double getModulo() {
		return Math.sqrt((Math.pow(this.x, 2)+Math.pow(this.y, 2)));
	}
	
	
	public double getDistancia(Punto p) {
		return Math.sqrt((Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2)));
	}
	
	
	public double getAngulo(Punto p) {
		
		return (180*Math.atan(p.getX()/p.getY())/Math.PI);
	}
	
	public String toStrign() {
		return "Punto: ("+this.x+","+this.y+")  ";
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	
}
