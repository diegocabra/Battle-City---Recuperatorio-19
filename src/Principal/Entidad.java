package Principal;

import Visitor.Visitor;

public abstract class Entidad {
	
	public abstract void recibirdaño(int daño);
	public abstract void morir();
	public abstract void aceptarVisitor(Visitor v);
	

}
