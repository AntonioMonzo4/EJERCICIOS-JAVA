public class MisOrdenadores {

    public static void main(String[] args) {
    	
    	System.out.println ("ordenador: referencia de clase Ordenador, instancia un Ordenador");
        Ordenador ordenador = new Ordenador();
        ordenador.start();// Llama al método start de la clase Ordenador.
        //Ordenador.stop();
        //No se puede llamar a stop porque no es método de Ordenador
        
    	System.out.println ("portatil: referencia de clase Portatil, instancia un Portatil");
        Portatil portatil = new Portatil();
        portatil.start();//Llama al método start de la clase Portatil
        //porque hemos sobreescrito este método en la clase Portatil.
        portatil.stop();//Llama al método stop de la clase Portatil.
        
        //Ejemplo de up casting
   
        Ordenador portatil1 = new Portatil();//Llama al método start de la clase Portatil
        //porque aunque Portatil1 es referencia de clase Ordenador es una instancia de Portatil.
        //Esto es la asociación dinámica.
        if (portatil1 instanceof Portatil)
        	System.out.println ("portatil1: referencia de clase Ordenador, instancia un Portatil");
        if (portatil1 instanceof Ordenador)
        	System.out.println ("portatil1: referencia de clase Ordenador, instancia también un Ordenador");
        portatil1.start();
        //Portatil1.stop();
        //No se puede llamar a stop porque es método de Portatil y
        //Portatil1 es referencia a Ordenador

        //Ejemplos de down casting.El down casting no siempre es válido. 
        //El down casting es válido si una referencia padre apunta a una instancia del hijo
    	System.out.println ("portatil2: down casting a Portatil de ordenador2 que instancia un Portatil");
        Ordenador ordenador2 = new Portatil();		//ordenador2 es referencia de clase Ordenador
        											//pero apunta a un objeto de clase Portatil.
        Portatil portatil2 = (Portatil) ordenador2;	//portatil2 es referencia de clase Portatil
        											//se hace down casting para Ordenador 2
        portatil2.start();
        portatil2.stop();
        
        //Down Casting NO Válido. No da error en compilación
        //pero salta una exception classCastException.
        //Recuera NO todos los ordenadores son portatiles.
    	System.out.println ("Portatil3: down casting a Portatil de Ordenador3 que instancia un Ordenador");
        Ordenador ordenador3 = new Ordenador();		//ordenador3 es referencia de clase Ordenador
        											//y apunta a un objeto de clase Ordenador.
        Portatil portatil3 = (Portatil) ordenador3;	//portatil3 es referencia de clase Portatil
        											//se hace down casting para ordenador3
        portatil3.start();    
   }
}

