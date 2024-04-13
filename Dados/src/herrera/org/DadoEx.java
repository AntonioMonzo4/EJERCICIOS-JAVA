package herrera.org;

import java.awt.Toolkit;

public class DadoEx extends Dado{

	private int caras;
	private int velocidad;
	public DadoEx() {
		// TODO Auto-generated constructor stub
	}
	public DadoEx(int caras,int velocidad) {
		this.caras= caras;
		this.velocidad= velocidad;
		
		//this.numCaras= numCaras --> el this indica la variable de clase
	}
	
	public int getNumCaras() {
		return caras;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void cantaCara() throws InterruptedException {
		for(int i=1;i<=this.getNumCaras();i++) {
			
			Toolkit.getDefaultToolkit().beep();

			Thread.sleep(this.getVelocidad());
		}
	}


}
