package Tanque;

import Visitor.Visitor;

public class Acorazado extends Enemigo{

	
	public Acorazado() {
		super();
		velocidadBase = 7;
	}

	public void recibirdaño(int daño) {
		super.recibirdaño(daño/2); // Los tanques acorazado reciben la mitad del daño 
		
	}
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarEnemigo(this);		
	}
	
	

}
