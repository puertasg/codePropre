package ex3;

import ex3.Animaux.AnimalAquarium;
import ex3.Animaux.AnimalCarnivore;
import ex3.Animaux.AnimalReptile;
import ex3.Animaux.AnimalSavane;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new AnimalSavane("Gazelle"));
		zoo.addAnimal(new AnimalSavane("Zèbre"));
		zoo.addAnimal(new AnimalSavane("Lion"));
		zoo.addAnimal(new AnimalCarnivore("Panthère"));
		zoo.addAnimal(new AnimalAquarium("Requin blanc"));
		zoo.addAnimal(new AnimalAquarium("Truite dorée"));
		zoo.addAnimal(new AnimalReptile("Boa constrictor"));
		zoo.addAnimal(new AnimalReptile("Python"));
	}

}
