package ArmaAbstractFactory;

import Disparo.Disparo;

public abstract class Arma {
protected int daño;

		public Arma(int daño) {
			this.daño = daño;
		}
	public abstract Disparo CrearDisparo();

}
