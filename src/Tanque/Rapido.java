package Tanque;

import Visitor.Visitor;

public class Rapido extends Enemigo {

	
	public Rapido() {
		super();
		velocidadBase = 4;
	}
	
	public void aceptarVisitor(Visitor v) {
		v.visitarEnemigo(this);
		
	}

}
