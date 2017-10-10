/**
 * 
 */
package ex4;


public class Animal {

	Types type;
	comportements comportement;
	String nom;
	
	public Animal(String nom,Types type ,comportements comportement){
		this.type = type;
		this.comportement=comportement;
		this.nom = nom;
	}
	
	public boolean inZoneCarnivore(){
		return type.equals(Types.MAMMIFERE) && comportement.equals(comportements.CARNIVORE);
	}
	
	public boolean inFermeReptile(){
		return type.equals(Types.REPTILE);
	}
	
	public boolean inSavaneAfricaine(){
		return type.equals(Types.MAMMIFERE) && comportement.equals(comportements.HERBIVORE);
	}
	
	public boolean inAquarium(){
		return type.equals(Types.POISSON);
	}
	
	public void affNom(){
		System.out.println(nom);
	}
	
}
