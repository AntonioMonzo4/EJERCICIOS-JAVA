package herrera.org;

import java.io.File;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ruta = new StringBuilder("/home/madrid/tmp/"); 

		
		for (int i = 1; i<=10; i++) {
			ruta.append(i+"/");
			new File(ruta.toString()).mkdirs();
			
		}
		
	}

}