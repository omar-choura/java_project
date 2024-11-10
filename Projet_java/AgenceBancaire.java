package Projet2;

public class AgenceBancaire {
	private int CodeAgence;
	private String NomBanque;
	private int Adresse;
	private Date DL;
	
	
	public AgenceBancaire(int CodeAgence1,String NomBanque1,int Adresse1,Date DL1)
	{
		this.CodeAgence=CodeAgence1;
		this.NomBanque=NomBanque1;
		this.Adresse=Adresse1;
		this.DL=DL1;
	}
	
	public void affiche()
	{
		System.out.println("Code agence="+CodeAgence+"Nom de la banque="+NomBanque+"l'adresse="+Adresse+"date de lancement="+DL.toString());
	}
	
	public String toString() {
	    return "Code agence=" + CodeAgence + " Nom de la banque=" + NomBanque + " l'adresse=" + Adresse + " date de lancement=" + DL.toString();
	}

	
	
}
