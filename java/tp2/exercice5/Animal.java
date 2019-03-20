package tp2.exercice5;

import java.awt.Color;
/**
 * Classe abstraite mère de toutes les types d'animaux
 * @author formation
 *
 */
public abstract class Animal {

	private Color couleur;
	private double poids;
	public Animal(Color color, double weight) {
		super();
		this.couleur = color;
		this.poids = weight;
	}
	public Color getColor() {
		return couleur;
	}
	public void setColor(Color color) {
		this.couleur = color;
	}
	public double getWeight() {
		return poids;
	}
	public void setWeight(double weight) {
		this.poids = weight;
	}
	
	public abstract void deplacement();
	public abstract void moyenExpression();
	
	@Override
	public String toString(){
		return "Je suis un Animal.";
	}
	
	
}
