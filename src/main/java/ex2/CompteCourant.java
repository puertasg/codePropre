package ex2;

public class CompteCourant extends CompteBancaire {
	
	private double decouvert;
	
	public CompteCourant(String type, double solde, double tauxRemuneration) {
		super("CC", solde, 0, tauxRemuneration);
		this.decouvert = 0;
	}
	
	public void debiterMontant(double montant)
	{
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}
	}

}