package herrera.org;

import java.io.*; // File, FileReader, BufferedReader

public class Principal {
  public static void main(String[] args) throws Exception {
	  
	  
	  
	  File fichero = new File("/home/madrid/index.html");
	  File ficheroOut = new File("/home/madrid/index.txt");

      FileWriter fw =new FileWriter(ficheroOut);
      
      BufferedReader br = new BufferedReader(new FileReader(fichero));

      String s;
      while( (s = br.readLine()) != null) {
    	  fw.write(s.replaceAll("<[^>]*>", " ")+"\n");
          System.out.println(s);
      }
      br.close();
      fw.close();
    }
}