import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraFichero {

	public static void main(String[] args) throws IOException {
	   FileWriter buffer = new FileWriter("contactos.dat", true); 
	   PrintWriter control = new PrintWriter(buffer);
	   control.print("Pedro  ");
	   control.println(7345);
	   control.print("Ana  ");
	   control.println(2323);
	   control.close();
	   System.out.println("Escritura en fichero finalizada.");
	}
}
