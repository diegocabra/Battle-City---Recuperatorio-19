package ArmaAbstractFactory;

import Disparo.*;

public class Factory_D_Jugador extends Arma {
	
	public Factory_D_Jugador(int daño) {
		super(daño);
	}
	

	@Override
	public Disparo CrearDisparo() {
		return new DisparoEnemigo(daño);
	}

	
}
