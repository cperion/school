package tp2.exercice5;

import java.awt.Color;

public class Chat extends AnimalDomestique implements ICarnivore{

	public Chat(Color color, double weight, String nom) {
		super(color, weight, nom);
	}

	@Override
	public void moyenExpression() {
		System.out.println("Je miaule");
	}
	
	@Override
	public String toString(){
		return super.toString() + "Je suis un Chat.";
	}
	
	@Override
	public void manger(Animal animal) {
		System.out.println("Je mange " + animal);
	}
}

