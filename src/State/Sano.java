package State;
import Tanque.Tanque;

public class Sano implements State {
	protected Tanque tanque;
	
	
	public Sano(Tanque tanque) {
		this.tanque = tanque;
			}

	public int velocidadFinal() {
		return tanque.getVelocidadBase()+10;
	}
}
