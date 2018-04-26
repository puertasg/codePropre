package ex3.Expo;

import java.util.ArrayList;
import java.util.List;

import ex3.Animaux.AbstractAnimal;

public abstract class AbstractExpo {
	
	protected List<AbstractAnimal> listeAnimal;
	
	public AbstractExpo()
	{
		this.listeAnimal = new ArrayList<>();
	}
	
	public void addAnimal(AbstractAnimal a) {
		listeAnimal.add(a);
	}

	public void afficherListeAnimaux() {
		listeAnimal.forEach(animal -> System.out.println(animal.getNom()));
	}
	
	public int compterAnimaux(){
		return listeAnimal.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
}
