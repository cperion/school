package tp2.exercice5;

import java.awt.Color;

public class Tigre extends AnimalSauvage implements ICarnivore{

	public Tigre(Color color, double weight) {
		super(color, weight);
	}

	@Override
	public void moyenExpression() {
		System.out.println("Je rugis");
	}
	@Override
	public String toString(){
		return super.toString() + "Je suis un Tigre.";
	}
	
	@Override
	public void manger(Animal animal) {
		System.out.println("Je déchire " + animal);
	}
}
