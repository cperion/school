package tp2.exercice5;

import java.awt.Color;

public class Lapin extends AnimalDomestique implements IHerbivore{

	public Lapin(Color color, double weight, String nom) {
		super(color, weight, nom);
	}

	@Override
	public void moyenExpression() {
		System.out.println("Je fais le bruit que fait un lapin");
	}
	
	@Override
	public String toString(){
		return super.toString() + "Je suis un Lapin.";
	}
	
	@Override
	public void manger() {
		System.out.println("Je grignotte");
	}
}
