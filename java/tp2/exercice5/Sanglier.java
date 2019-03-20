package tp2.exercice5;

import java.awt.Color;

public class Sanglier extends AnimalSauvage implements ICarnivore, IHerbivore{

	public Sanglier(Color color, double weight) {
		super(color, weight);
	}

	@Override
	public void moyenExpression() {
		System.out.println("Je grogne");
	}
	
	@Override
	public String toString(){
		return super.toString() + "Je suis un Sanglier.";
	}
	
	@Override
	public void manger(Animal animal) {
		System.out.println("Je machouille " + animal);
	}

	@Override
	public void manger() {
		System.out.println("Je machouille");
	}
}
