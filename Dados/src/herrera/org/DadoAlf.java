package herrera.org;

public class DadoAlf extends Dado{
	
	private String letras;
	
	public DadoAlf(int numCaras) {
		super(numCaras);
		
	}

	public DadoAlf() {
		// TODO Auto-generated constructor stub
	}
	
	public DadoAlf(String letras) {
		this.letras=letras;
	}
	
	
	public char lanzarAlf() {
		
		
		String copia = new String();
		

		
		for(int i =0;i<letras.length();i++) {
			if(i==0) {
				copia+=letras.charAt(i);
			}else if(letras.charAt(i)==copia.charAt(i-1)) {
				continue;
			}else {
				copia+=letras.charAt(i);
			}

		}
		
		
		return copia.charAt((int)(Math.random()*copia.length()));
	}

}
