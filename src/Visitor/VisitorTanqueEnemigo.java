package Visitor;

import Tanque.Enemigo;
import Tanque.Jugador;
import Tanque.Tanque;

public class VisitorTanqueEnemigo implements Visitor {
private Tanque tanque;
	public VisitorTanqueEnemigo(Tanque t) {
		this.tanque = t;
		
	}
	@Override
	public void visitarJugador(Jugador j) {
		j.morir();
		tanque.morir();
	}

	@Override
	public void visitarEnemigo(Enemigo e) {
		// cuando un Tanque ENEMIGO colisiona con otro enemigo, no hace nada.
		
	}

}
