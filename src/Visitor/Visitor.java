package Visitor;
import Tanque.*;

public interface Visitor {
	
	public void visitarJugador(Jugador j);
	public void visitarEnemigo(Enemigo e);
	
	

}
