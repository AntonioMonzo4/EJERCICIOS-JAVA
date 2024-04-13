package org.herrera.juegos;


import java.awt.Toolkit;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Dado d1 = new Dado(), d12 = new Dado(12);
		
		
		DadoEx dadoSonoro= new DadoEx(4,7);
		
		DadoEx dS= new DadoEx(3,2);
		
		DadoAlf da= new DadoAlf("ABC");
		
		//DadoAlf dav= new DadoAlf("");


		DadoAlf dy = new DadoAlf(150);
		
		DadoAlf dj= new DadoAlf(12,5);
		
		//Dado dn = new Dado(-1);
		
		System.out.println("Has sacado el número(d1): "+d1.lanzar());
		System.out.println("Has sacado el número(d2): "+d12.lanzar());
		System.out.println("Has sacado el número(da): "+da.lanzarAlf());
		System.out.println("Has sacado el número(da): "+dy.lanzar());
		System.out.println("Has sacado el número(da): "+dj.lanzar());
		
		
		

	
		

		dadoSonoro.cantaCara();
		
		Thread.sleep(5000);

		dS.cantaCara();
		
	}


}
