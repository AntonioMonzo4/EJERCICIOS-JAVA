package herrera.org;

import java.io.*; // File, FileReader, BufferedReader

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Principal {
  public static void main(String[] args) throws Exception {
	  
	  
	  
	  File fichero = new File("/home/madrid/index.html");
	  File ficheroOut = new File("/home/madrid/index.txt");

	    JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "html", "htm");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            chooser.getSelectedFile().getName());
	    }
	 
	    
      FileWriter fw =new FileWriter(ficheroOut);
      
      BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile().getAbsolutePath()));

      String s;
      while( (s = br.readLine()) != null) {
    	  fw.write(s.replaceAll("<[^>]*>", " ")+"\n");
          System.out.println(s);
      }
      br.close();
      fw.close();
    }
}