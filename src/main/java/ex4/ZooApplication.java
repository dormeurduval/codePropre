package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", Types.MAMMIFERE, comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Types.MAMMIFERE, comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Types.MAMMIFERE, comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", Types.MAMMIFERE, comportements.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Types.POISSON, comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", Types.POISSON, comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", Types.SERPENT, comportements.CARNIVORE));
		zoo.addAnimal(new Animal("Python", Types.SERPENT, comportements.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}
