package Visitor;
import Tanque.*;

public interface Visitor {
	
	public void visitarAcorazado(Acorazado a);
	public void visitarRapido(Rapido r);
	public void visitarBasico(Basico b);
	public void visitarJugador(Jugador j);
	

}
