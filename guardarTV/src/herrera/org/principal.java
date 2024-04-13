package herrera.org;

import java.io.File;
import java.io.IOException;

public class principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File dir1 = new File("/home/madrid/prueba");
		
		guardaTarjetaVisita(dir1);
	}
	
	static void guardaTarjetaVisita(File dir) throws IOException {

		File[] listado = dir.listFiles();
		
		
		for(File f : listado) {
			if(f.isDirectory() && !f.isHidden()) {

				new File(f.getPath()+"/TarjetaVisita.txt").createNewFile();
				guardaTarjetaVisita(f);
				System.out.println(f.getName());
				
				
			}
		}
		
	}

}
