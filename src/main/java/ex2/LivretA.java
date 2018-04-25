package ex2;

public class LivretA extends CompteBancaire {

	public LivretA(String type, double solde, double tauxRemuneration) {
		super("LA", solde, 0, tauxRemuneration);
	}
	
	public void debiterMontant(double montant)
	{
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}
	}

}
