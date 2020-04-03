package Visitor;

import Tanque.Enemigo;
import Tanque.Jugador;

public class VisitorDisparoBasico implements Visitor {

	private int daño = 10;

	@Override
	public void visitarJugador(Jugador j) {
		j.recibirdaño(daño);
		}

	@Override
	public void visitarEnemigo(Enemigo e) {
			
	}

}
