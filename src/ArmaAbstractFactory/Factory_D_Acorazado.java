package ArmaAbstractFactory;

import Disparo.Disparo;
import Disparo.DisparoEnemigo;


public class Factory_D_Acorazado extends Arma{

	public Factory_D_Acorazado(int daño) {
		super(daño);
	}

	public Disparo CrearDisparo() {
		return new DisparoEnemigo(daño);
	}


}
