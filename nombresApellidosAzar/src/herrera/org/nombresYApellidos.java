package herrera.org;

public class nombresYApellidos {

	public static void main(String[] args) {
		String []nombres={ "Ana", "Carmen", "Cristina", "Sara", "Esther", "Isabel", "Sandra", "Beatriz", "Elena", "Inés",
				  "Susana", "Irene", "Mónica", "Rocío", "Lucía", "Marta", "Begoña", "Belén", "Carolina", "Celia", "Laura",
				  "Paloma", "Raquel", "Rosa", "Adriana", "Alicia", "Eva", "Silvia", "Vanesa", "Almudena", "Yolanda",
				  "Luisa", "Araceli", "Estefania", "Mayte", "Natalia", "Nieves", "Olga", "Sonia", "Ana María", "Cecilia",
				  "Diana", "Margarita", "Marisol", "María del Mar", "María Jesús", "María José", "María", "Mercedes",
				  "Noelia", "Tatiana", "Ángeles", "Azucena", "Blanca", "Gloria", "Lorena", "María Teresa", "Patricia",
				  "Verónica", "Violeta", "Adelaida", "Ainhoa", "Inmaculada", "María Ángeles", "María del Pilar",
				  "María Victoria", "Miriam", "Montserrat", "Nerea", "Nuria", "Rebeca", "Rosa María", "Soraya", "Yedra",
				  "Aida", "Alexia", "Amanda", "Clara", "Cyntia", "Elisa", "Esperanza", "Estíbaliz", "Eva María", "Loreto",
				  "Sofía", "Amaya", "Elvira", "Emilia", "Estrella", "Fátima", "Henar", "Lourdes", "Mariam", "Marina",
				  "María Elena", "María Luisa", "Milagros", "Minerva", "Mirella", "Nereida", "Paula", "Tamara",
				  "Victoria", "Zaida", "Ángela", "Abigail", "Adela", "Vera", "Alba", "Angelines", "Chenoa",
				  "Isabel María", "Itziar", "Karen", "Rosalía", "Rosana", "Zoraida", "África", "Aitana",
				  "Amparo", "Ana Cecilia", "Angélica", "Ariadna", "Aránzazu", "Arancha", "Aurora", "Brenda", "Casandra",
				  "Claudia", "Débora", "Edurne", "Gema", "Alberto", "Santiago", "David", "Carlos", "Daniel", "Óscar",
				  "Javier", "Julio", "Miguel", "Nicolás", "Raúl", "Roberto", "Victor", "Jaime", "Tomás", "Alejandro",
				  "Antonio", "César", "Fernando", "Francisco", "Iván", "Jesús", "Jorge", "Manuel", "Pablo", "Sergio",
				  "Ángel", "Alfonso", "Juan", "Marcos", "Alfredo", "Ignacio", "Ismael", "José", "Julián", "Rafael",
				  "Ramiro", "Cristobal", "Mario", "Ramón", "Rodrigo", "Andrés", "José Luis", "José María", "Luis Miguel",
				  "Pedro", "Rubén", "Victor Manuel", "Miguel Ángel", "Eloy", "Emilio", "Felipe", "Juan José",
				  "Luis Alberto", "Vicente", "Eugenio", "Federico", "Fermín", "Francisco Javier", "Guillermo",
				  "Juan Carlos", "Juan Manuel", "Roberto Juan", "Álex", "Bruno", "Germán", "Isidro", "Julio José",
				  "Manuel Jesús", "Pablo José", "Álvaro", "Adolfo", "Diego", "Carlos Alberto", "Enrique", "Esteban",
				  "Federico José", "Gabriel", "Gustavo", "Horacio", "José Antonio", "José Carlos", "José Fernando",
				  "Juan Antonio", "Juan Marcos", "Juan Miguel", "Luis Félix", "Mariano", "Pascual", "Ricardo",
				  "Sebastián", "Damián", "Ernesto", "Félix", "Lorenzo", "Adriano", "Adrián", "Agustín", "Aitor", "Arturo",
				  "Bernardo", "Borja", "Carlos Bruno", "Carlos Isidro", "Elías", "Federico", "Fidel", "Gregorio",
				  "Gustavo Adolfo", "Iñigo", "Jesús Adolfo", "Jesús María", "Joaquín", "José Alberto", "José Germán",
				  "Juan Pablo", "Lucas", "Martín", "Mateo", "Samuel", "Simón", "Alexis", "Benjamín"
				};
		String []apellidos= {
				  "García", "González", "Rodríguez", "Fernández", "López", "Martínez", "Sánchez", "Pérez",
				  "Gómez", "Martín", "Jiménez", "Ruiz", "Hernández", "Díaz", "Moreno", "Álvarez", "Muñoz", "Romero",
				  "Alonso", "Gutiérrez", "Navarro", "Torres", "Domínguez", "Vázquez", "Ramos", "Gil", "Ramírez",
				  "Serrano", "Blanco", "Suárez", "Molina", "Morales", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio",
				  "Marín", "Sanz", "Iglesias", "Núñez", "Medina", "Garrido", "Santos", "Castillo", "Cortés", "Lozano",
				  "Guerrero", "Cano", "Prieto", "Méndez", "Calvo", "Cruz", "Gallego", "Vidal", "León", "Herrera", "Peña",
				  "Márquez", "Flores", "Cabrera", "Campos", "Vega", "Díez", "Fuentes", "Carrasco", "Caballero", "Nieto",
				  "Reyes", "Aguilar", "Santana", "Pascual", "Herrero", "Giménez", "Lorenzo", "Hidalgo", "Montero",
				  "Ibáñez", "Ferrer", "Durán", "Vicente", "Benítez", "Arias", "Santiago", "Mora", "Carmona", "Vargas",
				  "Crespo", "Pastor", "Sáez", "Román", "Soto", "Velasco", "Moya", "Soler", "Bravo", "Parra", "Esteban",
				  "Gallardo", "Rojas", "Merino", "Pardo", "Franco", "Izquierdo", "Espinosa", "Lara", "Rivas", "Redondo",
				  "Silva", "Arroyo", "Rivera", "Casado", "Camacho", "Rey", "Vera", "Luque", "Otero", "Montes", "Sierra",
				  "Galán", "Ríos", "Segura", "Carrillo", "Marcos", "Expósito", "Bernal", "Robles", "Mendoza", "Martí",
				  "Soriano", "Vila", "Valero", "Andrés", "Palacios", "Benito", "Guerra", "Varela", "Macías", "Bueno",
				  "Heredia", "Mateo", "Villar", "Roldán", "Pereira", "Contreras", "Guillén", "Miranda", "Mateos",
				  "Menéndez", "Escudero", "Aguilera", "Aparicio", "Rivero", "Casas", "Estévez", "Gracia", "Padilla",
				  "Rico", "Beltrán", "Abad", "Gálvez", "Calderón", "Quintana", "Conde", "Salas", "Blázquez", "Miguel",
				  "Jurado", "Plaza", "Acosta", "Aranda", "Bermúdez", "Roca", "Guzmán", "Salazar", "Santamaría", "Costa",
				  "Villanueva", "Tomás", "Serra", "Trujillo", "Manzano", "Cuesta", "Hurtado", "Pacheco", "Rueda", "Ávila",
				  "Mesa", "Lázaro", "Pons", "Simón", "de la Fuente", "Sancho", "del Río", "Escobar", "Alarcón", "Blasco",
				  "Millán", "Luna", "Castaño", "Zamora", "Salvador", "Bermejo", "Paredes", "Ballesteros", "Antón",
				  "Valverde", "Maldonado", "Bautista", "Valle", "Ponce", "Rodrigo", "Juan", "Cordero", "Oliva", "Lorente",
				  "Collado", "Murillo", "Montoya", "Pozo", "Mas", "de la Cruz", "Cuenca", "Martos", "Cuevas", "Barroso",
				  "Barrera", "Quesada", "Ordóñez", "Marco", "de la Torre", "Gimeno", "Pulido", "Ros", "Corral", "Navas",
				  "Cabello", "Rojo", "Soria", "Alba", "Arenas", "Saiz", "Puig", "Aguado", "Vallejo", "Galindo", "Asensio",
				  "Ramón", "Mena", "Escribano", "Domingo", "Valencia", "Polo", "Lucas", "Caro", "Paz", "Reina", "Aguirre",
				  "Mata", "Naranjo", "Villalba", "Morán", "Linares", "Leal", "Amador", "Burgos", "Ojeda", "Carretero",
				  "Bonilla", "Clemente", "Oliver", "Aragón", "Carrera", "Roig", "Sosa", "Carrión", "Córdoba", "Rosa",
				  "Castellano", "Villa", "Hernando", "Cáceres", "Andreu", "Calero", "Cobo", "Cárdenas", "Correa",
				  "Toledo", "Chacón", "Juárez", "Alcaraz", "Velázquez", "Solá", "Llorente", "Riera", "Doménech",
				  "Saavedra", "Zapata", "Vela", "Moral", "Luis", "Mohamed", "Salgado", "Villegas", "Arribas", "Prado",
				  "Carbonell", "Alfonso", "Peláez", "da Silva", "Sevilla", "Piñeiro", "Carballo", "Barrios", "Olivares",
				  "Requena", "Ayala", "Ferreira", "Quintero", "Font", "Pinto", "Solís", "Esteve", "Perea", "Salinas",
				  "Marqués", "Cid", "Grau", "Marrero", "Castilla", "Palomo", "Cantero", "Ballester", "Pineda", "Bosch",
				  "Arévalo", "Belmonte", "Sanchís", "de la Rosa", "Miralles", "Nicolás", "Rincón", "Lago", "Arranz"
				};
		
		for(int i=1;i<=10;i++) {
			System.out.println(nombres[(int) (Math.random()*nombres.length)]+" "+apellidos[(int) (Math.random()*apellidos.length)]+" "+apellidos[(int) (Math.random()*apellidos.length)]);
			
		}
		

	}

}
