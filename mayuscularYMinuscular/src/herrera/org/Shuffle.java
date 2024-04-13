package herrera.org;

public class Shuffle {

	public static void main(String[] strings) {
		// TODO Auto-generated method stub
	
		System.out.println();
		char[] c=strings[0].toCharArray();
		
		char[] g=c;
		
		char c2;

		
		for(int i=0;i<strings[0].length();i++) {
			int t =(int) (Math.random()*c.length);
			c2=c[i];
			c[i]=g[t];
			g[t]=c2;
			
			
		}
		for(int j=0;j<c.length;j++)
		System.out.print(c[j]);

	}

}
