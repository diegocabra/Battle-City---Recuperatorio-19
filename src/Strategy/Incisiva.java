package Strategy;

import Tanque.Tanque;

public class Incisiva implements Strategy {
protected Tanque tanque; 
	
	
	public Incisiva(Tanque tanque) {
		this.tanque = tanque; 
	}
	
	public void mover(int x) {
		System.out.print("El tanque se mueve de manera INCISIVA hacia "+x+" con una velocidad: "+tanque.getVelocidadBase()+ ".");
	}
}
