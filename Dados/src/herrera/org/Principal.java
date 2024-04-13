package herrera.org;

import java.awt.Toolkit;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Dado d1 = new Dado(), d12 = new Dado(12);
		
		DadoEx dadoSonoro= new DadoEx(4,(int)(Math.random()*500+1));
		
		DadoEx dS= new DadoEx(3,200);
		
		DadoAlf da= new DadoAlf("ABC");

		DadoAlf dy = new DadoAlf(150);
		
		
		System.out.println("Has sacado el número(d1): "+d1.lanzar());
		System.out.println("Has sacado el número(d2): "+d12.lanzar());
		System.out.println("Has sacado el número(da): "+da.lanzarAlf());
		System.out.println("Has sacado el número(da): "+dy.lanzar());
		

	
		

		dadoSonoro.cantaCara();
		
		Thread.sleep(5000);

		dS.cantaCara();
		
	}

}
