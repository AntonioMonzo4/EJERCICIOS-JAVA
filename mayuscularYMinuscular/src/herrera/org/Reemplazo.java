package herrera.org;

public class Reemplazo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = new String();
		
	
		
		if(args[0].contains(args[1])) {
			x=args[0].replace(args[1], args[2]);
		}
		System.out.println(x);
	}

}
