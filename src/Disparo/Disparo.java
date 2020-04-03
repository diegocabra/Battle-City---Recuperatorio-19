package Disparo;

import Principal.Entidad;

public abstract class Disparo extends Entidad {
	protected int daño;
	
	public Disparo(int daño) {
		this.daño = daño;
	}
	public int daño() {
		return daño;
	}
	public void recibirdaño(int daño) {
		morir();
	}
	
	public void morir() {
		System.out.print("Este Disparo murio. Press f to pay respect");
		
	}
}
