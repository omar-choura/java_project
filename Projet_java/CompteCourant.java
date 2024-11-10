package Projet2;

public class CompteCourant extends Compte {

	private double depassation;
	
	public CompteCourant(Personne salem, int numeroCompte, double solde, AgenceBancaire agenceBiat, Date dateCreation,int maxOperations,double depassation) {
		super(salem, numeroCompte,solde, agenceBiat, dateCreation,maxOperations);
		this.depassation=solde;
	}
	

	public double getDepassation() {
		return depassation;
	}

	public void setDepassation(double depassation) {
		this.depassation = getSolde();
	}
	public void frais()
	{
		for(int i=1;i<=12;i++)
		{
			setSolde(getSolde() - getSolde()*0.02);
		}
	}
	
	public double getFraisfix() {
		return 20;
	}

	public double fraisBancairesTrimestrielsCC()
	{
		return super.fraisBancairesTrimestriels() + getFraisfix();
		
	}
	public void retrait(double montant) {
        if (getSolde() - montant >= -depassation) {
            super.retrait(montant);
            setSolde(getSolde() - getFraisfix());
        } else {
            System.out.println("Opération de retrait non autorisée. Solde insuffisant.");
        }
    }
	

}
