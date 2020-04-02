package Tanque;

import Strategy.Aleatoria;
import Strategy.Strategy;

public abstract class Enemigo extends Tanque{
	protected Strategy myStrategy; 
	
	public Enemigo() {
		super();
		myStrategy =  new Aleatoria(this);
	}

	public Strategy getMyStrategy() {
		return myStrategy;
	}

	public void changeStrategy(Strategy myStrategy) {
		this.myStrategy = myStrategy;
	}
	
	public void mover(int x ) {
		myStrategy.mover(x);
	}
	

}
