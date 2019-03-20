package tp2.exercice5;

import java.awt.Color;

public class Chien extends AnimalDomestique implements ICarnivore{

	public Chien(Color color, double weight, String nom) {
		super(color, weight, nom);
	}

	@Override
	public void moyenExpression() {
		System.out.println("J'aboie");
	}
	
	@Override
	public String toString(){
		return super.toString() + "Je suis un Chien.";
	}

	@Override
	public void manger(Animal animal) {
		System.out.println("Je dévore " + animal);
	}
}
