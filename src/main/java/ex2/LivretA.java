package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle(){
		if (this.getType().equals("LA")){
			this.setSolde(this.getSolde() + this.getSolde() * tauxRemuneration/100);
		}
	}

	/** 
	 * @Override
	 * 
	 * @param montant (double)
	 * @return (void)
	 */
	public void debiterMontant(double montant){
		if (this.getSolde() - montant > 0){
			this.setSolde(this.getSolde() - montant);
		}	
	}



	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
