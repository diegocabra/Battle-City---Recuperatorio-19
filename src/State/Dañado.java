package State;
import Tanque.Tanque;

public class Dañado implements State {

	protected Tanque tanque;
	
	public Dañado(Tanque tanque) {
		this.tanque = tanque;
	}
	
	public int velocidadFinal() {
		return tanque.getVelocidadBase()+5;
	}
	
	

}
