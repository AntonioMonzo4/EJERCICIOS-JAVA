/**
 * 
 */
package herrera.org;

import java.util.Iterator;

/**
 * 
 */
public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] array= {"h","o","l","a","_","m","u","n","d","o"};
		try {
			for (int i = 0; i < array.length; i++) {
				int f= (int)(Math.random()*1000000L);
				System.out.println(f);
				System.out.print(array[i]);
				Thread.sleep(f);
			}
			
		
		} catch (InterruptedException e) {
			System.out.println("Hilo interrumpido");
		}
	}

}
