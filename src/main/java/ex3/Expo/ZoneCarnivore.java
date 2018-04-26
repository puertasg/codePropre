package ex3.Expo;

public class ZoneCarnivore extends AbstractExpo{
	
	public double calculerKgsNourritureParJour(){
		return listeAnimal.size() * 10;
	}
}
