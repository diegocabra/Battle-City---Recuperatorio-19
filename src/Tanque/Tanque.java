package Tanque;
import Principal.Arma;
import Principal.Entidad;
import State.*;

public abstract class Tanque extends Entidad{
	
	protected int vida; 
	protected int velocidadBase; 
	protected State myState; 
	protected Arma 	miArma;

	public Tanque() {
		myState = new Sano(this);
		vida = 100; 
	}
	public void changeState(State s) {
		myState = s; 
	}
	
	public abstract void mover(int x);

	public int velocidadFinal() {
		return myState.velocidadFinal();	
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {  
		this.vida = vida;
		if (vida<30)					// CUANDO LA VIDA DE LOS TANQUES ES MENOR A 30 ,SE PASA A DAÑADO . 
			changeState(new Dañado(this));
	}
	
	
	public int getVelocidadBase() {
		return velocidadBase;
	}
	public void setVelocidadBase(int velocidadBase) {
		this.velocidadBase = velocidadBase;
	}
	public State getMyState() {
		return myState;
	}
	
	public Arma getMiArma() {
		return miArma;
	}
	public void setMiArma(Arma miArma) {
		this.miArma = miArma;
	}

	
}
