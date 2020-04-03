package Visitor;

import Tanque.Enemigo;
import Tanque.Jugador;

public class VisitorDisparoAcorazado  implements Visitor {
	private int daño = 8;
	
	public void visitarEnemigo(Enemigo e) {
		//No hace nada
	}
	
	@Override
	public void visitarJugador(Jugador j) {
		j.recibirdaño(daño);		
	}

}
