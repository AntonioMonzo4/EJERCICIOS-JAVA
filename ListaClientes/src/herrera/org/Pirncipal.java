package herrera.org;

import java.util.ArrayList;
import java.util.HashSet;


public class Pirncipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clientes = { "Adrián Rodríguez", "Eneko Ortiz", "Florian Lejeune", "Álvaro Vallés", "Florian Lejeune",
			    "Asier Gago", "Junior Bita", "Kiko Femenía", "Andoni Gorosabel", "Eneko Ortiz", "César de la Hoz",
			    "Asier Gago", "Aleksandar Sedlar", "Ander Sánchez", "Antonio Blanco", "Carlos Benavídez", "Ianis Hagi",
			    "Jason", "Aleksandar Sedlar", "Abdel Abqar", "Adrián Pérez", "Anderson Arroyo", "Antonio Sivera",
			    "Yuzún Ley", "Paco Sanz", "Carles Aleñá", "Eneko Ortiz", "Álvaro Carrillo", "Andoni Gorosabel",
			    "Abdel Abqar", "Asier Gago", "Momo Mbaye", "Abdel Abqar", "Nahuel Tenaglia", "Erick Cabaco", "Yan Couto",
			    "Florian Lejeune", "Ander Sánchez", "Antonio Blanco", "Carlos Benavídez", "Gaizka García", "Jesús Owono",
			    "Rúben Montero", "Aleksandar Sedlar", "Anderson Arroyo", "Andoni Gorosabel", "Eneko Ortiz",
			    "Florian Lejeune", "Jesús Navas", "Ianis Hagi", "José de León", "Jon Guridi", "Abdel Abqar", "Jesús Owono",
			    "Anderson Arroyo", "José de León", "Adrián Pérez", "Adrián Pérez", "Aleksandar Sedlar", "Mikel Oyarzabal",
			    "Loïc Badé", "Toni Lato", "Ander Guevara", "Anderson Arroyo", "Andoni Gorosabel", "Eneko Ortiz",
			    "Florian Lejeune", "Anderson Arroyo", "Rubén Duarte", "Víctor Laguardia", "Álex Sola", "Yan Couto",
			    "Andoni Gorosabel", "Genar Fornés", "Alberto Flores", "Asier Gago", "Gaizka García", "Jon Guridi",
			    "Adrián Pérez", "Rúben Montero", "Aleksandar Sedlar", "Eneko Ortiz", "Jason", "Jon Guridi", "José de León",
			    "Abdel Abqar", "Adrián Pérez", "Asier Gago", "Nikola Maras", "Rafa Marín", "Anderson Arroyo", "Rafa Martín",
			    "Andoni Gorosabel", "Eneko Ortiz", "Gaizka García", "Aleksandar Sedlar", "Imanol Baz", "Javi López",
			    "Joseda Álvarez", "Nahuel Tenaglia", "Florian Lejeune", "Imanol Baz", "Gaizka García", "Andoni Gorosabel",
			    "Florian Lejeune", "Asier Gago", "Jordi Alba" };
			

	
	ArrayList<String> clientesList=new ArrayList<>();
    HashSet<String> clientesHash = new HashSet<>();

	
	
	for(int i=0;i<clientes.length;i++) {
		if(!clientesList.contains(clientes[i])) {
			clientesList.add(clientes[i]);
		}
		clientesHash.add(clientes[i]);
		
	}
	
	
    String[] v= new String[clientesHash.size()];
    v=(String[]) clientesHash.toArray();
    clientesHash.toArray(v);
    
    

	
    
    System.out.println(v);
	
	System.out.println(clientesList);
	System.out.println(clientesHash);
	System.out.println(clientesList.size());
	System.out.println(clientes.length);
}
	

}


