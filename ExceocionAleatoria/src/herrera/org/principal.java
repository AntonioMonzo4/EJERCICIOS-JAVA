package herrera.org;

import java.io.IOException;
import java.sql.SQLException;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		try {
			exceptional();
		} catch (ArithmeticException f) {
			System.out.println(f);
		} catch (RuntimeException x) {
			System.out.println(x);
		}  catch (SQLException h) {
			System.out.println(h);
		}catch (IOException g) {
			System.out.println(g);
		}catch (Exception e) {
			System.out.println(e);
		}catch (ThreadDeath ñ) {
			System.out.println(ñ);
		}catch (Error k ) {
			System.out.println(k);
		}
	}

	public static void exceptional() throws Exception {
		int dado=(int) (Math.random()*8+1);
		System.out.println(dado);
		switch (dado) {
		case 1: {
	
			System.out.println(" Se produjo excepción genérica");
			throw new  Exception();    
			
		}
		case 2: {
			
			throw new RuntimeException(" Se produjo excepción runtime"); 
		
		}case 3: {
	
			throw  new ArithmeticException(" Algún cálculo da error"); 
		
		}case 4: {
	
			System.out.println("Ha muerto un hilo");     
			throw new ThreadDeath();
			
		}case 5: {
	
			throw new IOException("IOException");
			
		}case 6: {
	
			throw new SQLException("SQLException");
			
		}case 7: {
	
			throw new Error("Error");
			
		}case 8: {
			System.out.println("Todo Okey");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + dado);
		}
	}
}
