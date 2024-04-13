/**
 * 
 */
package org.herrera.seres;

/**
 * 
 */
/**
 * 
 */
public class Mundo {

	private int capacidad;
	private int index=0;
	private SerVivo[] seres = new SerVivo[] {};
	
	
	public Mundo(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.seres= new SerVivo[capacidad];
	}
	
	public void add(SerVivo x) {
	
			seres[index]=x;
			index++;

	}
	public SerVivo getFirst() {
		return seres[0];
	}

	public SerVivo get(int x) {
		return seres[x];
	}
	public SerVivo getLast() {
		return seres[index];
	}

	public void pasarAnio() {
		for(int i =0;i<seres.length;i++) {
			if(seres[i]!=null)
			{
				seres[i].cumplirAnios();
				
				if(seres[i].edad>seres[i].edadFin) {
					seres[i]=null;
				}
			}
			
			
		}
	}
	
	
	public int getCenso() {
		int censo=0;
		for (int i = 0; i < seres.length; i++) {
			if (seres[i] != null) {
				censo++;
			}
		}
		return censo;
	}
	
	public void listar() {
		
		for (int i = 0; i < seres.length; i++) {
			
			if (seres[i] != null ) {
				
				System.out.println(seres[i]);
				
			}
		}
	}

	public int getCapacidad() {
		return capacidad;
	}
	
	
}
