package tp2.exercice5;

import java.awt.Color;

public abstract class AnimalSauvage extends Animal{

	public AnimalSauvage(Color color, double weight) {
		super(color, weight);
	}

	@Override
	public void deplacement() {
		System.out.println("Je me déplace dans la nature");
	}
	
	
	@Override
	public String toString(){
		return super.toString() + "Je suis un Animal Sauvage.";
	}
	
	
	
}