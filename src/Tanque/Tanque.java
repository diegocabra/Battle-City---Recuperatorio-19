package Tanque;
import ArmaAbstractFactory.Arma;
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
	
	public void recibirdaño(int daño) {
		this.vida = vida - daño;
		if (vida<= 0)
			morir();
		else if (vida<30)					// CUANDO LA VIDA DE LOS TANQUES ES MENOR A 30 ,SE PASA A DAÑADO . 
			changeState(new Dañado(this));
		}

	@Override
	public void morir() {
		System.out.print("Este Tanque Murio, press F to pay Respect");
	}

	public int velocidadFinal() {
		return myState.velocidadFinal();	
	}
	
	public int getVida() {
		return vida;
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
