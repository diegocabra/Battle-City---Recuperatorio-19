package Tanque;

import Strategy.Incisiva;

public class Basico extends Enemigo {

	public Basico() {
		super();
		velocidadBase = 4;
		}
	
	
	public void setVida(int vida) {  //REVISAR REGULAR
		this.vida = vida;
		if (this.vida < 20)
			changeStrategy(new Incisiva(this));
			
	}
			
	public void recibirdaño(int daño) {
		// TODO Auto-generated method stub

	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub

	}

	
	
}
