package Tanque;

import Visitor.Visitor;

public class Jugador extends Tanque {

	@Override
	public void mover(int x) {
		System.out.print("El tanque del Jugador se mueve hacia x : "+x);
	}

	@Override
	public void aceptarVisitor(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	

}
