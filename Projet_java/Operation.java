package Projet2;

public class Operation {
    private DateTime operation;
    private String typeoperation;
    private double montantoperation;
    private AgenceBancaire agenceoperation;

    public Operation(DateTime operation, String typeoperation, double montantoperation,
            AgenceBancaire agenceoperation) {
        this.operation = operation;
        this.typeoperation = typeoperation;
        this.montantoperation = montantoperation;
        this.agenceoperation = agenceoperation;
    }

    public void affiche() {
        int jour = operation.getJ();
        int mois = operation.getM();
        int annee = operation.getA();
        int heure = operation.getH();
        int minute = operation.getMin();
        int seconde = operation.getS();

        System.out.println("Date : " + jour + "/" + mois + "/" + annee +
                ", Heure : " + heure + ":" + minute + ":" + seconde +
                ", Type : " + typeoperation +
                ", Montant : " + montantoperation +
                ", Agence : " + agenceoperation);
    }

    public String toString() {
        int jour = operation.getJ();
        int mois = operation.getM();
        int annee = operation.getA();
        int heure = operation.getH();
        int minute = operation.getMin();
        int seconde = operation.getS();

        return "Date: " + jour + "/" + mois + "/" + annee +
                ", Heure: " + heure + ":" + minute + ":" + seconde +
                ", Type: " + typeoperation +
                ", Montant: " + montantoperation +
                ", Agence: " + agenceoperation;
    }
    
    public DateTime getOperation() {
        return operation;
    }

    public String getTypeoperation() {
        return typeoperation;
    }

    public double getMontantoperation() {
        return montantoperation;
    }

    public AgenceBancaire getAgenceoperation() {
        return agenceoperation;
    }
}

