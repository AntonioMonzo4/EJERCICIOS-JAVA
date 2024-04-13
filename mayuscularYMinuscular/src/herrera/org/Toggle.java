package herrera.org;

public class Toggle {


	public static void main(String s) {
		// TODO Auto-generated method stub
	
		for(int i=0;i<s.length();i++) {
			
			if(("" +s.charAt(i)).toUpperCase().equals(("" +s.charAt(i)))) {
				System.out.print(("" +s.charAt(i)).toLowerCase());
			}else if(("" +s.charAt(i)).toLowerCase().equals(("" +s.charAt(i)))) {
				System.out.print(("" +s.charAt(i)).toUpperCase());
			}
			 	
		}
		System.out.println();
		
	}
	

}
