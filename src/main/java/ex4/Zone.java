/**
 * 
 */
package ex4;

import java.util.ArrayList;
import java.util.List;

public class Zone {

	protected List<Animal> animals;
	
	public Zone(){
		animals = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animals){
			animal.affNom();
		}
	}
	
}
