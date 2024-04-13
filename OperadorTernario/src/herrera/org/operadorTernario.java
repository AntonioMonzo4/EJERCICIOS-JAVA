package herrera.org;
public class operadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=4;
		String nombreDia;
		nombreDia= dia==1 ? "Lunes" :  dia==2 ? "Martes" :  dia==3 ? "Miercoles" :  dia==4 ? "Jueves" :  dia==5 ? "Viernes" :  dia==6 ? "Sabado" :  dia==7 ? "Domingo" : "Otro" ;

		System.out.println(nombreDia);
		
		
		
		
		
		//OPERADOR TERNARIO EDAD
		int edad=27;
		Object edadU;
		
		edadU= edad < 0 ? "No existes" : edad <18 ? "Menor de edad" : edad <120 ? "juega al casino" : " estás muerto";
		System.out.println(edadU);
	}
	
	

}
