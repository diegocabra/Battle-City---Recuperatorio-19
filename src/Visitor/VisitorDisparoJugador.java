package Visitor;


import Tanque.Enemigo;
import Tanque.Jugador;

public class VisitorDisparoJugador implements Visitor {
	
	private int daño =10;
	

	@Override
	public void visitarJugador(Jugador j) {
		// TODO Auto-generated method stub
		
	}
	
	public void visitarEnemigo(Enemigo e) {
				e.recibirdaño(daño);
	}
	
	
}
