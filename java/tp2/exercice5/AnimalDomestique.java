package tp2.exercice5;

import java.awt.Color;

public abstract class AnimalDomestique extends Animal{
	
	private String nom;

	
	public AnimalDomestique(Color color, double weight, String nom) {
		super(color, weight);
		this.nom = nom;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public void deplacement() {
		System.out.println("Je me déplace en appartement");
	}
	
	@Override
	public String toString(){
		return super.toString() + "Je suis un Animal Domestique.";
	}
}
