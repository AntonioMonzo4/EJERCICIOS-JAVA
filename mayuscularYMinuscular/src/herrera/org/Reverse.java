package herrera.org;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaInversa = new String();
		System.out.println();

		for(int i=args[0].length()-1; i>=0;i--) {
			
			cadenaInversa=cadenaInversa+args[0].charAt(i);
			
		}
		System.out.println(cadenaInversa);
	}

}
