package ArmaAbstractFactory;

import Disparo.Disparo;
import Disparo.DisparoEnemigo;


public class Factory_D_Basico extends Arma{
	

	public Factory_D_Basico(int daño) {
		super(daño);
	}

		
		public Disparo CrearDisparo() {
			return new DisparoEnemigo(daño);
		}

}
