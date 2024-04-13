package dado_poker_switch;

public class DadoPoker {

	public static void main(String[] args) {
		
		double x=Math.random()*6.00+1;
		
		int control=(int)x;
		
		
		switch(control) {
		case 1:
			System.out.println("AS");
			break;
		case 2:
			System.out.println("rojos");
			break;
		case 3:
			System.out.println("negros");
			break;
		case 4:
			System.out.println("Jack");
			break;
		case 5:
			System.out.println("Queen");
			break;
		case 6:
			System.out.println("King");
			break;

		
		}
			

	}

}
