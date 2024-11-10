package Projet2;

public class Credit {
	private Employe owner;
	private int code ;
	private CompteCourant compte;
	private Date versement;
	private double montantcredit;
	
	
	public  Credit(Employe owner,int code ,CompteCourant compte,Date versement,double montantcredit)
	{
		this.owner=owner;
		this.versement=versement;
		this.montantcredit=montantcredit;
		this.code=code;
		this.compte=compte;
	}
	public Employe getOwner() {
		return owner;
	}
	public void setOwner(Employe owner) {
		this.owner = owner;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void versementCredit() {
        if (autoriseCredit()) {
            double frais = fraisDossier();
            double montantTotal = montantcredit + frais;
            if (compte.getSolde() >= montantTotal) {
                compte.retrait(montantTotal);
                compte.versement(montantcredit);
                System.out.println("Versement du crédit réussi !");
            } else {
                System.out.println("Solde insuffisant pour effectuer le versement du crédit.");
            }
        } else {
            System.out.println("Le titulaire n'est pas éligible au crédit.");
        }
 }
	public boolean autoriseCredit() {
        int ageTitulaire = compte.getTitulaire().getDn().calculerAge(versement);
        int moisDepuisCreation = compte.getDateCreation().diffMois(versement);

        return ageTitulaire >= 18 && moisDepuisCreation >= 6 && this.montantcredit<owner.getSalaire()*5;
    }
	public double fraisDossier() {
        int ageTitulaire = compte.getTitulaire().getDn().calculerAge(versement);
        double tauxFrais;

        if (ageTitulaire < 30) {
            tauxFrais = 0.01;
        } else if (ageTitulaire <= 50) {
            tauxFrais = 0.02;
        } else {
            tauxFrais = 0.03;
        }

        return montantcredit * tauxFrais;
    }}
	
