package tp2.exercice5;

import java.awt.Color;

public class Vache extends AnimalSauvage implements IHerbivore{

	public Vache(Color color, double weight) {
		super(color, weight);
	}

	@Override
	public void moyenExpression() {
		System.out.println("Je meugle");
	}

	@Override
	public String toString(){
		return super.toString() + "Je suis une Vache.";
	}
	
	@Override
	public void manger() {
		System.out.println("Je broute");
	}
}
