package Projet2;

public class CompteEpargne extends Compte {

	private double montantepargne;
	public CompteEpargne(Personne titulaire, int numeroCompte, double solde, AgenceBancaire agenceBancaire,Date dateCreation,int maxOperations,double montantepargne) {
			super(titulaire, numeroCompte, solde, agenceBancaire, dateCreation, maxOperations);
			this.montantepargne=0;
		
	}
	public double getMontantepargne() {
		return montantepargne;
	}
	public void setMontantepargne(double montantepargne) {
		this.montantepargne = montantepargne;
	}
	public void montantepargne(double solde)
	{
		for(int i=1;i<=12;i++)
		{
			if(i%3==0)
			{
				montantepargne+=montantepargne*1.06;
			}
		}
	}

}
