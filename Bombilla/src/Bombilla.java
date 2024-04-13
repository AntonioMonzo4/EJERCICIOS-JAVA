public class Bombilla {
		  private String on_off;

		  public Bombilla (String estado) {
			  on_off = estado;
		  }		  
		  
		  void encender() {
		    on_off =  "ON";
		  }

		  void apagar() {
			    on_off =  "OFF";
		  }
		  
		  String getEstado() {
		    return on_off;	
		  }
}
