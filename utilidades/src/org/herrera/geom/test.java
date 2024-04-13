/**
 * 
 */
package org.herrera.geom;

/**
 * 
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(5,7);
		Punto p2 = new Punto(7,7);

		Recta rc= new Recta(p1,p2);
		Recta rc2= new Recta(p1,p2);
		Recta rc3= new Recta(p1,p2);
		Recta rc4= new Recta(p1,p2);
		Recta rc5= new Recta(p1,p2);
		
		Rectangulo r= new Rectangulo(p1,p2);
		Rectangulo r2= new Rectangulo(p1,p2);
		Rectangulo r3= new Rectangulo(p1,p2);
		Rectangulo r4= new Rectangulo(p1,p2);
		Rectangulo r5= new Rectangulo(p1,p2);
		Rectangulo r6= new Rectangulo(p1,p2);
		Rectangulo r7= new Rectangulo(p1,p2);
		Rectangulo r8= new Rectangulo(p1,p2);

		
		System.out.println("Hemos creado "+Recta.getContR()+" rectas.");
		System.out.println();

		System.out.println("Hemos creado "+Rectangulo.getContRc()+" rectángulos.");
		System.out.println();


		
		Rectangulo.descripcion();
		Recta.descripcion();
		FiguraGeometrica.descripcion();

		

	}

}
