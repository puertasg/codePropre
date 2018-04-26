package ex3;

import ex3.Animaux.AnimalAquarium;
import ex3.Animaux.AnimalCarnivore;
import ex3.Animaux.AnimalReptile;
import ex3.Animaux.AnimalSavane;
import ex3.Expo.Aquarium;
import ex3.Expo.FermeReptile;
import ex3.Expo.SavaneAfricaine;
import ex3.Expo.ZoneCarnivore;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		this.savaneAfricaine = new SavaneAfricaine();
		this.zoneCarnivore = new ZoneCarnivore();
		this.fermeReptile = new FermeReptile();
		this.aquarium = new Aquarium();
	}
	
	public void addAnimal(AnimalCarnivore ac){
		zoneCarnivore.addAnimal(ac);
	}
	
	public void addAnimal(AnimalSavane as){
		savaneAfricaine.addAnimal(as);
	}
	
	public void addAnimal(AnimalReptile ar){
		fermeReptile.addAnimal(ar);
	}
	
	public void addAnimal(AnimalAquarium ar){
		aquarium.addAnimal(ar);
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
