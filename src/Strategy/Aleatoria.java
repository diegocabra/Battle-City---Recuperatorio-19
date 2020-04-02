package Strategy;
import Tanque.Tanque;
public class Aleatoria implements Strategy {
	protected Tanque tanque; 
	
	
	public Aleatoria(Tanque tanque) {
		this.tanque = tanque; 
	}
	
	public void mover(int x) {
		System.out.print("El tanque se mueve de manera ALEATORIA hacia "+x+" con una velocidad: "+tanque.getVelocidadBase()+ ".");
	}
}
