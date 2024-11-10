package Projet2;
public class Main {

    public static void main(String[] args) {
        Personne salem = new Personne("Salem", "Choura", 123456, new Date(13, 5, 1982));
        AgenceBancaire agenceBiat = new AgenceBancaire(24, "Biat", 123, new Date(25, 12, 2015));
        CompteCourant compteCourant = new CompteCourant(salem, 12854, 0, agenceBiat, new Date(1, 1, 2022), 30, 0);
        CompteEpargne compteEpargne = new CompteEpargne(salem, 95147, 0, agenceBiat, new Date(1, 1, 2022), 30, 0);
        Employe salemEmploye = new Employe("Salem", "Choura", 123456, new Date(13, 5, 1982), new Date(1, 3, 2018), "", 1500, "JobTitle");

        for (int i = 1; i <= 12; i++) {
        	
            compteCourant.versement(salemEmploye.getSalaire());
            if (salemEmploye.anciennete(new Date(1, i, 2022)) && i % 4 == 0) {
                salemEmploye.augmenterSalaire();
            }
            Operation depotOperationCC = new Operation(new DateTime(1, i, 2022, 10, 00, 00), "Dépôt Salaire", salemEmploye.getSalaire(), agenceBiat);
            
            compteCourant.addOperation(depotOperationCC);

            compteCourant.retrait(350);

            Operation retraitOperationCC = new Operation(new DateTime(1, i, 2022, 10, 00, 00), "Retrait", 350, agenceBiat);
            compteCourant.addOperation(retraitOperationCC);

            compteEpargne.versement(500);

            Operation depotOperationCE = new Operation(new DateTime(1, i, 2022, 10, 00, 00), "Dépôt", 500, agenceBiat);
            compteEpargne.addOperation(depotOperationCE);
           

            System.out.println("Mois " + i + " - Solde Compte Courant : " + compteCourant.getSolde() +
                    ", Solde Compte Epargne : " + compteEpargne.getSolde());
        }

        Credit credit = new Credit(salemEmploye, 123, compteCourant, new Date(1, 1, 2023), salemEmploye.getSalaire() * 3);

        for (int i = 1; i <= 12; i++) {
        	if (salemEmploye.anciennete(new Date(1, i, 2022)) && i % 4 == 0) {
                salemEmploye.augmenterSalaire();
            }
        	compteCourant.versement(salemEmploye.getSalaire());
        	
            compteCourant.retrait(400);

            Operation retraitOperationCC = new Operation(new DateTime(1, i, 2023, 10, 00, 00), "Retrait", 400, agenceBiat);
            compteCourant.addOperation(retraitOperationCC);

            if (i % 2 == 0) {
                compteEpargne.retrait(300);

                Operation retraitOperationCE = new Operation(new DateTime(1, i, 2023, 10, 00, 00), "Retrait", 300, agenceBiat);
                compteEpargne.addOperation(retraitOperationCE);
            }

            credit.versementCredit();

            System.out.println("Mois " + i + " - Solde Compte Courant : " + compteCourant.getSolde() +
                    ", Solde Compte Epargne : " + compteEpargne.getSolde());
        }

        System.out.println("\nCompte Courant : ");
        compteCourant.affiche();
        System.out.println("\nCompte Epargne : ");
        compteEpargne.affiche();
        System.out.println("\nRelevé Bancaire - Compte Courant : ");
        compteCourant.extraitBancaire();
        System.out.println("\nRelevé Bancaire - Compte Epargne : ");
        compteEpargne.extraitBancaire();
    }
}
