package ex3.Animaux;

public abstract class AbstractAnimal {
	private String type;
	private String nom;
	private String comportement;

	public AbstractAnimal(String n, String c, String t) 
	{
		this.nom = n;
		this.comportement = c;
		this.type = t;
	}
	
	public String getNom() {
		return nom;
	}
}
