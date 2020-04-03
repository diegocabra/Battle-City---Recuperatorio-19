package Tanque;

import Strategy.Incisiva;
import Visitor.Visitor;

public class Basico extends Enemigo {

	public Basico() {
		super();
		velocidadBase = 4;
		}
						
	public void recibirdaño(int daño) {
		super.recibirdaño(daño);
		if (vida<20)
				changeStrategy(new Incisiva(this));
			}

	public void aceptarVisitor(Visitor v) {
		v.visitarEnemigo(this);		
	}

	
	
}
