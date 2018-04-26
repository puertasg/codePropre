package ex3.Expo;

public class Aquarium extends AbstractExpo {

	public double calculerKgsNourritureParJour(){
		return listeAnimal.size() * 0.2;
	}
}
