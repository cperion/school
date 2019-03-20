package tp2.exercice5;

import java.awt.Color;

public class TestAnimaux {

	public static void main(String[] args) {
		
		ICarnivore t = new Tigre(Color.red,200);
		
		ICarnivore[] carnivores = {
				new Tigre(Color.red, 150),
				new Chien(Color.black, 30, "Medor"),
				new Sanglier(Color.black, 90)
		};
		
		Animal lapin = new Lapin(Color.white, 5, "Fluffy");
		
		for(ICarnivore carnivore : carnivores){
			carnivore.manger(lapin);
		}
		
		t.manger(lapin);
		//t.moyenExpression(); // compile pas
				

	}

}
